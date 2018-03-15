package com.zero.bank;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyStore;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class TestHttps {
	public static void main(String[] args) throws Exception {
		System.setProperty("jsse.enableSNIExtension", "false");

		KeyStore ks = KeyStore.getInstance("PKCS12");
		InputStream ksIs = new FileInputStream("E:/marmot/supreme/fire/Tarou/certificate/custom.p12");
		try {
			ks.load(ksIs, "password".toCharArray());
		} finally {
			if (ksIs != null) {
				ksIs.close();
			}
		}
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(ks, "password".toCharArray());

		KeyStore ts = KeyStore.getInstance("jks");
		InputStream tsIs = new FileInputStream("E:/marmot/supreme/fire/Tarou/certificate/server.jks");
		try {
			ts.load(tsIs, "password".toCharArray());
		} finally {
			if (tsIs != null) {
				tsIs.close();
			}
		}
		TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		tmf.init(ts);

		SSLContext ctx = SSLContext.getInstance("SSLv3");
		ctx.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

		URL myURL = new URL("https://localhost:12443/Tarou/");
		// URL myURL = new URL("https://www.slzx.com:12443/Tarou/");
		// 创建HttpsURLConnection对象，并设置其SSLSocketFactory对象

		HttpsURLConnection httpsConn = (HttpsURLConnection) myURL.openConnection();
		httpsConn.setSSLSocketFactory(ctx.getSocketFactory());
		// 取得该连接的输入流，以读取响应内容
		InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream(), "UTF-8");
		// 读取服务器的响应内容并显示
		int respInt = insr.read();
		while (respInt != -1) {
			System.out.print((char) respInt);
			respInt = insr.read();
		}
	}
}