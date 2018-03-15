package com.zero.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
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
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

public class ICBCTransactionQueryTestHuaMei2 {

	public static void main(String args[]) throws Exception {

		// String targetUrl = "https://www.baidu.com/";
		String targetUrl = "https://corporbank.icbc.com.cn:446/servlet/ICBCINBSEBusinessServlet";

		String keyStory = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030.jks";
		String trustKeyStory = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030_trust.jks";
		String keyStoryPass = "zzxx123456"; // 证书库密码
		String keyStoryCertPass = "zzxx123456"; // 证书密码
		String trustKeyStoryPass = "zzxx123456"; // 证书库密码

		SSLContext sslContext = SSLContexts.custom()
				.loadTrustMaterial(new File(trustKeyStory), keyStoryPass.toCharArray(), new TrustSelfSignedStrategy())
				.loadKeyMaterial(new File(keyStory), keyStoryPass.toCharArray(), keyStoryPass.toCharArray()).build();
		
		 SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
	                sslContext,
	                new String[] { "TLSv1" },
	                null,
	                SSLConnectionSocketFactory.getDefaultHostnameVerifier());
		 
		 
	

		// 1. 建立HttpClient对象
		// CloseableHttpClient client = HttpClients.custom().setSSLContext(sslContext).build();
		CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		/**
		 * 1.建立HttpClient对象 * CloseableHttpClient client =
		 * HttpClients.createDefault(); 2.建立Get请求 HttpGet get = new
		 * HttpGet(targetUrl); 3.发送Get请求 CloseableHttpResponse res = *
		 * client.execute(get); 4.处理请求结果
		 */

		// 2. 建立Get请求
		// HttpGet get = new HttpGet(targetUrl);
		HttpPost postMethod = new HttpPost(targetUrl);

		/*
		 HttpUriRequest login = RequestBuilder.post()
                 .setUri(new URI("https://www.baidu.com/"))
                 .addParameter("IDToken1", "username")
                 .addParameter("IDToken2", "password")
                 .build();
         CloseableHttpResponse response2 = httpclient.execute(login);
         */
		
		String sFileNamePath="D:/marmot/supreme/fire/Tarou/certificate/MerReqData_huamei.xml";
		String rd = DoTxt.ReadTxt(sFileNamePath).toString();
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
			

		// 3. 发送POST请求
		CloseableHttpResponse res = client.execute(postMethod);


		System.out.println("返回状态: " + res.getStatusLine().getStatusCode());
		System.out.println("返回数据: " + res.toString());
		
		byte[] b = null ;
		//res.getEntity().getContent().read(b);
		//System.out.println("data: " + res.getEntity().getContent().read(b));
		System.out.println("data-1: " + res.getStatusLine());
		

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
					// charset = Charset.forName("ISO-8859-1");
					charset = Charset.forName("UTF-8");
				}
			}
			System.out.println(new String(content, charset));
		}

		if (null != client) {
     		client.close();
		}
	}

}
