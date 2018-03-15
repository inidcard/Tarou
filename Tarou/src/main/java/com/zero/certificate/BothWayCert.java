package com.zero.certificate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

public class BothWayCert {

	public static void main(String[] args) {

		DefaultHttpClient httpclient = new DefaultHttpClient();

		KeyStore trustStore = null;
		try {
			trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream instream = null;
		try {
			//instream = new FileInputStream(new File("E:/marmot/supreme/fire/Tarou/certificate/huameijks.jks"));
			instream = new FileInputStream(new File("E:/marmot/supreme/fire/Tarou/certificate/server.jks"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
				try {
					trustStore.load(instream, "password".toCharArray());
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CertificateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} finally {
			try {
				instream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		SSLSocketFactory socketFactory = null;
		try {
			socketFactory = new SSLSocketFactory(trustStore, "password", trustStore);
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnrecoverableKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scheme sch = new Scheme("https", socketFactory, 443);
		httpclient.getConnectionManager().getSchemeRegistry().register(sch);

		//HttpGet httpget = new HttpGet("https://localhost:12443/");
		HttpGet httpget = new HttpGet("https://www.slzx.com:12443/");
		//<IP>corporbank.icbc.com.cn</IP>  <!--工行系统地址-->
		//<path>/servlet/ICBCINBSEBusinessServlet</path>

		//HttpGet httpget = new HttpGet("https://corporbank.icbc.com.cn/servlet/ICBCINBSEBusinessServlet");

		System.out.println("executing request" + httpget.getRequestLine());

		HttpResponse response = null;
		try {
			response = httpclient.execute(httpget);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpEntity entity = response.getEntity();

		System.out.println("----------------------------------------");
		System.out.println(response.getStatusLine());
		if (entity != null) {
			System.out.println("Response content length: " + entity.getContentLength());
		}
		if (entity != null) {
			try {
				entity.consumeContent();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		httpclient.getConnectionManager().shutdown();

	}

}