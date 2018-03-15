package com.zero.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

public class ICBCTransactionQueryTestTou {

	public static void main(String args[]) throws Exception {

		// String targetUrl = "https://www.baidu.com/";
		// String targetUrl = "http://www.163.com/";
		// https://www.slzx.com:12443/Tarou/

		String targetUrl = "https://corporbank.icbc.com.cn:446/servlet/ICBCINBSEBusinessServlet?aa=aabccccbcb";
		// String targetUrl = "https://localhost:12443/Tarou/";

		// String keyStory =
		// "E:/marmot/supreme/fire/Tarou/certificate/3803EE20253016/3803EE20253016.jks";
		String keyStory = "E:/marmot/supreme/fire/Tarou/certificate/1613EE20253017/huamei1613EE20253017.jks";
		// String keyStory =
		// "E:/marmot/supreme/fire/Tarou/certificate/custom.p12";
		String keyStoryPass = "zzxx123456"; // 证书库密码
		String keyStoryCertPass = "zzxx123456"; // 证书密码
		// String trustKeyStory =
		// "E:/marmot/supreme/fire/Tarou/certificate/3803EE20253016/3803EE20253016_trust.jks";
		String trustKeyStory = "E:/marmot/supreme/fire/Tarou/certificate/1613EE20253017/huamei1613EE20253017_trust.jks";
		// String trustKeyStory =
		// "E:/marmot/supreme/fire/Tarou/certificate/3803EE20253016/3803EE20253016.crt";
		// String trustKeyStory =
		// "E:/marmot/supreme/fire/Tarou/certificate/server.jks";
		String trustKeyStoryPass = "zzxx123456"; // 证书库密码

		// URL keyStoryURL = new URL("file:///" + keyStory);
		InputStream keyStoryURL = new FileInputStream(keyStory);
		// URL trustKeyStoryURL = new URL("file:///" + trustKeyStory);
		InputStream trustKeyStoryURL = new FileInputStream(trustKeyStory);

		// 1-1-1 创建证书库
		KeyStore ks = null;
		ks = KeyStore.getInstance("jks");
		ks.load(keyStoryURL, keyStoryPass.toCharArray());

		KeyStore tks = null;
		// tks = KeyStore.getInstance("jks");
		tks = KeyStore.getInstance("jks");
		// tks = KeyStore.getInstance(KeyStore.getDefaultType());
		tks.load(trustKeyStoryURL, trustKeyStoryPass.toCharArray());

		// new java.io.FileInputStream("keyStoreName");

		// 1-1. 证书管理
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

		// kmf.init(ks, password);
		kmf.init(ks, keyStoryCertPass.toCharArray());
		tmf.init(tks);

		KeyManager[] km = null;
		TrustManager[] tm = null;

		km = kmf.getKeyManagers();
		tm = tmf.getTrustManagers();

		// 通过Protocol建立socket通讯
		// Protocol ptl;
		// SSLContext sslContext = null;
		// sslContext = SSLContext.getInstance("SSL");
		// sslContext.init(km, tm, null);

		SSLContext sslContext = SSLContexts.custom()
				.loadTrustMaterial(new File(trustKeyStory), "zzxx123456".toCharArray(), new TrustSelfSignedStrategy())
				.loadKeyMaterial(new File(keyStory), "zzxx123456".toCharArray(), "zzxx123456".toCharArray()).build();
		
		 SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
	                sslContext,
	                new String[] { "TLSv1" },
	                null,
	                SSLConnectionSocketFactory.getDefaultHostnameVerifier());

		// sslcontext.init(keymanagers, trustmanagers, null);
		// SSLContext sslcontext = SSLContext.getInstance("SSL");

		// CloseableHttpClient client_1 = HttpClients.createDefault();

		// 1. 建立HttpClient对象
		// CloseableHttpClient client = HttpClients.custom().setSSLContext(sslContext).build();
		CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		/**
		 * 1.建立HttpClient对象 * CloseableHttpClient client =
		 * HttpClients.createDefault(); 2.建立Get请求 HttpGet get = new
		 * HttpGet(targetUrl); 3.发送Get请求 CloseableHttpResponse res = *
		 * client.execute(get); 4.处理请求结果
		 */

		// 1. 建立HttpClient对象
		// CloseableHttpClient client_1 = HttpClients.createDefault();

		// 2. 建立Get请求
		// HttpGet get = new HttpGet(targetUrl);
		HttpPost postMethod = new HttpPost(targetUrl);
		
		String sFileNamePath="E:/marmot/supreme/fire/Tarou/certificate/MerReqData_huamei.xml";
		String rd = DoTxt.ReadTxt(sFileNamePath).toString();

		System.out.println("MerReqData: " + rd);
		
		//String bufData = XMLUtils.xml2Str(sFileNamePath);
		//System.out.println("bufData-MerReqData: " + bufData);
		
		// post 赋值
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("APIName", "EAPI"));
		nvps.add(new BasicNameValuePair("APIVersion", "001.001.002.001"));
		nvps.add(new BasicNameValuePair("MerReqData", rd));
		System.out.println("req-data: " + nvps.toString());
		postMethod.setEntity(new UrlEncodedFormEntity(nvps));

		System.out.println("req-2-data: " + client.toString());
		// 3. 发送Get请求
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

		if (null == client) {
     		client.close();
		}
	}

}
