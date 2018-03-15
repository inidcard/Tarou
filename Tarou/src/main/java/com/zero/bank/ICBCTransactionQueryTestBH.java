package com.zero.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ICBCTransactionQueryTestBH {

	public static void main(String args[]) throws ClientProtocolException, IOException, NoSuchAlgorithmException,
			KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException, URISyntaxException {

		// String targetUrl = "http://www.163.com/";
		String targetUrl = "https://corporbank.icbc.com.cn:446/servlet/ICBCINBSEBusinessServlet";

		String keyStory = "D:/marmot/supreme/fire/Tarou/certificate/3803EE20253016/3803EE20253016.jks";
		String trustKeyStory = "D:/marmot/supreme/fire/Tarou/certificate/3803EE20253016/3803EE20253016_trust.jks";
		String keyStoryPass = "123456"; // 证书库密码
		String keyStoryCertPass = "123456"; // 证书密码
		String trustKeyStoryPass = "123456"; // 证书库密码

		SSLContext sslContext = SSLContexts.custom()
				.loadTrustMaterial(new File(trustKeyStory), keyStoryPass.toCharArray(), new TrustSelfSignedStrategy())
				.loadKeyMaterial(new File(keyStory), keyStoryPass.toCharArray(), keyStoryPass.toCharArray()).build();
		
		 SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
	                sslContext,
	                new String[] { "TLSv1" },
	                null,
	                SSLConnectionSocketFactory.getDefaultHostnameVerifier());

		// 1. 建立HttpClient对象
		CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		/**
		 * 1.建立HttpClient对象 * CloseableHttpClient client =
		 * HttpClients.createDefault(); 2.建立Get请求 HttpGet get = new
		 * HttpGet(targetUrl); 3.发送Get请求 CloseableHttpResponse res = *
		 * client.execute(get); 4.处理请求结果
		 */

		// 2. 建立POST请求
		// HttpGet get = new HttpGet(targetUrl);
		HttpPost postMethod = new HttpPost(targetUrl);
		
		String sFileNamePath="D:/marmot/supreme/fire/Tarou/certificate/MerReqDataBH.xml";
		String rd = DoTxt.ReadTxt(sFileNamePath);
		System.out.println("MerReqData: " + rd);
		
		// post 赋值
				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				nvps.add(new BasicNameValuePair("APIName", "EAPI"));
				nvps.add(new BasicNameValuePair("APIVersion", "001.001.002.001"));
				nvps.add(new BasicNameValuePair("MerReqData", rd));
				postMethod.setEntity(new UrlEncodedFormEntity(nvps));
				
				 HttpEntity entityReq = postMethod.getEntity();
					ContentType contentTypeReq = ContentType.getOrDefault(entityReq);
					byte[] contentReq = EntityUtils.toByteArray(entityReq);
					System.out.println("请求数据-1：" + new String(contentReq));
					
				HttpUriRequest postData = RequestBuilder.post()
		                 .setUri(new URI("https://corporbank.icbc.com.cn:446/servlet/ICBCINBSEBusinessServlet"))
		                 .addParameter("APIName", "EAPI")
		                 .addParameter("APIVersion", "001.001.002.001")
		                 .addParameter("MerReqData", rd)
		                 .build();
		
		// 3. 发送Get请求
		CloseableHttpResponse res = client.execute(postData);


		System.out.println("返回状态: " + res.getStatusLine().getStatusCode());
		System.out.println("返回数据: " + res.toString());
		
		// 4. 处理请求结果
		if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			HttpEntity entity = res.getEntity();
			ContentType contentType = ContentType.getOrDefault(entity);
			Charset charset = contentType.getCharset();
			String mimeType = contentType.getMimeType();
			// 获取字节数组
			byte[] content = EntityUtils.toByteArray(entity);
			if (charset == null) {
				// 默认编码转成字符串
				String temp = new String(content);
				String regEx = "(?=<meta).*?(?<=charset=[\\'|\\\"]?)([[a-z]|[A-Z]|[0-9]|-]*)";
				Pattern p = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(temp);
				if (m.find() && m.groupCount() == 1) {
					charset = Charset.forName(m.group(1));
				} else {
					charset = Charset.forName("ISO-8859-1");
				}
			}
			System.out.println("===" + new String(content, charset));
			
			String rspXml = new String(content, charset).trim();
			System.out.println("返回内容: " + rspXml);
			// System.out.println("===" + new String(content, charset));

			// String rspXml = new String(postMethod.getResponseBody(),
			// "UTF-8");
			// Document document = DocumentHelper.parseText(rspXml);
			// System.out.println("===: " + document.toString());

			// String decoderRspXml = URLDecoder.decode(rspXml, "GB2312");
			String decoderRspXml = URLDecoder.decode(rspXml, "GB2312");
			System.out.println("==URLDecoder==: " + decoderRspXml);

			// rspXml

			// Reader rs = new StringReader(decoderRspXml);
			Reader reader = new StringReader(decoderRspXml);

			SAXReader saxReader = new SAXReader();
			Document document = null;
			try {
				document = saxReader.read(reader);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("==SAXReader==: " + document.getDocument());

			// System.out.println("==document=getRootElement=: " +
			// document.getRootElement());
			Element root = document.getRootElement();// 得到根节点
			System.out.println("==Element root=: " + root.toString());


			List<Element> nodes = root.elements("in");
				// System.out.println("============: " + elm.elementText("orderNum").trim().toString(). );

			Element inElm = (Element)nodes.get(0);
			List inNodes = inElm.elements("orderNum");
			Element orderNum = (Element)inNodes.get(0);
			String sOrderNum = orderNum.getText();
			
			System.out.println("sOrderNum===: " + sOrderNum); 

			String tranDate = getStringFromXml(nodes, "tranDate");
			System.out.println("tranDate===: " + tranDate); 
			
			
			
			
			System.out.println("===: " + nodes.size());
			for (Iterator it = nodes.iterator(); it.hasNext();) {
				Element elm = (Element) it.next();
				// System.out.println("============: " + elm.elementText("orderNum").trim().toString(). );
				for (Iterator it2 = elm.elementIterator(); it2.hasNext();) {
					Element elel = (Element) it2.next();
					System.out.println("===" + elel.getName() + ":" + elel.getText() + ":");
				}
			}

			List outNodes = root.elements("out");
			for (Iterator it = outNodes.iterator(); it.hasNext();) {
				Element elm = (Element) it.next();
				for (Iterator it2 = elm.elementIterator(); it2.hasNext();) {
					Element elel = (Element) it2.next();
					System.out.println("===" + elel.getName() + ":" + elel.getText() + ":");
				}
			}
			
		}

		if (null != client) {
     		client.close();
		}
	}
	
    public static String getStringFromXml(List<Element> list, String str) {
		
		Element ele = (Element)list.get(0);
		List nodeList = ele.elements(str);
		Element eleTmp = (Element)nodeList.get(0);
		return eleTmp.getText();
	}

}
