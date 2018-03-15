package com.zero.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BothWayAuthentication {

    private static final Logger logger = LoggerFactory.getLogger(BothWayAuthentication.class);

	// private static final String CERT_PATH =
	// HttpsRequest.class.getClassLoader().getResource("jks/icbc.jks").getFile();
	private static final String CERT_PATH = "E:/marmot/supreme/fire/Tarou/certificate/icbc.jks";
	private String charset_gbk = "GBK";

	/**
	 * 表示请求器是否已经做了初始化工作
	 */
	private boolean hasInit = false;

	/**
	 * 连接超时时间，默认10秒
	 */
	private int socketTimeout = 20000;

	/**
	 * 传输超时时间，默认30秒
	 */
	private int connectTimeout = 90000;

	// 请求器的配置
	private RequestConfig requestConfig;

	// HTTP请求器
	private CloseableHttpClient httpClient;

	public void HttpsRequest() throws UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException,
			KeyStoreException, IOException {
		init();
	}

	public void init() throws IOException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException,
			KeyManagementException {
        // Init keyStore
        KeyStore keyStore = KeyStore.getInstance("jks");// PKCS12、jks 等
        logger.info("keystore: " + keyStore);

        FileInputStream instream = new FileInputStream(new File(CERT_PATH));// 加载本地的证书进行https加密传输
        try {
            keyStore.load(instream, "12345678".toCharArray());// 设置证书密码
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            instream.close();
        }
        
        // SSLContext sslcontext = SSLContexts.custom().useSSL().loadKeyMaterial(keyStore, "12345678".toCharArray()) .loadTrustMaterial(keyStore).build(); 


	}
	
	
}
