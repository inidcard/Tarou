package com.zero.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
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
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.zero.constant.PathConstant;

import cn.com.infosec.icbc.ReturnValue;

public class ICBCSaleReturnDuck {

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

		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new String[] { "TLSv1" }, null,
				SSLConnectionSocketFactory.getDefaultHostnameVerifier());

		// 1. 建立HttpClient对象
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

		String sFileNamePath = "D:/marmot/supreme/fire/Tarou/certificate/MerReqData_hm_sale-return-duck.xml";
		String rd = DoTxt.ReadTxt(sFileNamePath).toString();
		System.out.println("MerReqData: " + rd);
		
		// 组装请求数据
		String sMerReqData = generateReqDataIcbcSaleReturn();

		// post 赋值
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("APIName", "EAPI"));
		nvps.add(new BasicNameValuePair("APIVersion", "001.001.007.001"));
		nvps.add(new BasicNameValuePair("MerReqData", rd));
		postMethod.setEntity(new UrlEncodedFormEntity(nvps));

		HttpEntity entityReq = postMethod.getEntity();
		ContentType contentTypeReq = ContentType.getOrDefault(entityReq);
		byte[] contentReq = EntityUtils.toByteArray(entityReq);
		System.out.println("请求数据-1：" + new String(contentReq));

		HttpUriRequest postData = RequestBuilder.post()
				.setUri(new URI("https://corporbank.icbc.com.cn:446/servlet/ICBCINBSEBusinessServlet"))
				.addParameter("APIName", "EAPI").addParameter("APIVersion", "001.001.002.001")
				.addParameter("MerReqData", rd).build();

		// CloseableHttpResponse response2 = httpclient.execute(login);

		// 3. 发送POST请求
		CloseableHttpResponse res = client.execute(postMethod);
		// CloseableHttpResponse res = client.execute(postData);

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
					// charset = Charset.forName("UTF-8");
				}
			}
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
			Document document;
			document = saxReader.read(reader);
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
	
	public static String generateReqDataIcbcSaleReturn() {
	    String reqDataXml = "";	
	    
	    Document document = DocumentHelper.createDocument();
		Element icbcAPI = document.addElement(PathConstant.ICBC_ICBCAPI);
		
		// 包序列号
		String packSerial = "";
		// 商城代码
		String shopCode = "";
		// 商城账号
		String shopAccount = "";
		// 日期
		String tranDate = "";    // YYYYMMDDhhmmss
		// 订单号
		String orderNo = "";
		// 退款金额
		String RejAmt= "";
		
		// 签名字段
		// APIName=EAPI&APIVersion=001.001.007.001&PackNo=包序列号&ShopCode=商城代码&ShopAccount=商城帐号&tranDate=退货对应的支付日期&orderNo=订单号&RejAmt=退货金额
		String signData = "";
		signData = "APIName=EAPI&APIVersion=001.001.007.001" 
		        + "&PackNo=" + packSerial 
		        + "&ShopCode=" + shopCode 
		        + "&ShopAccount=" + shopAccount
		        + "&tranDate=" + tranDate
		        + "&orderNo=" + orderNo
		        + "&RejAmt=" + RejAmt;
		
        System.out.println("请求数据签名数据: " + signData);
		String signDataDone = "";
		
		// 证书信息
        String certPrivateKey = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030.jks";
        String certPublicKey = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030_trust.jks";
        String certKeyPassword = "zzxx123456";
		// String tranReqData = signData;

        // String keyStory = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030.jks";
        // String trustKeyStory = "D:/marmot/supreme/fire/Tarou/certificate/huamei/hm_20180201143030_trust.jks";
        // String keyStoryPass = "zzxx123456"; // 证书库密码
        // String keyStoryCertPass = "zzxx123456"; // 证书密码
        // String trustKeyStoryPass = "zzxx123456"; // 证书库密码

		Map<String, String> mData = new HashMap<String, String>();
		mData.put(PathConstant.CERT_PRIVATE_KEY, certPrivateKey);
		mData.put(PathConstant.TRAN_REQ_DATA, signData);
		mData.put(PathConstant.CERT_KEY_PASSWORD, certKeyPassword);
		mData.put(PathConstant.CERT_PUBLIC_KEY, certPublicKey);

		Map<String, String> mDataReturn = null;
		try {
			mDataReturn = slDataBase64SignForIcbc(mData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        signDataDone = mDataReturn.get(PathConstant.SIGN_DATA);
        System.out.println("请求数据签名后数据: " + signDataDone);

			// returnMap.put(PathConstant.SIGN_DATA, new String(signature));
			// FileInputStream f = new FileInputStream(mData.get(PathConstant.CERT_PRIVATE_KEY));
			// String sReqData = mData.get(PathConstant.TRAN_REQ_DATA);
			// String merCertKeyPassword= mData.get(PathConstant.CERT_KEY_PASSWORD);
			// String sCertPublicKey = mData.get(PathConstant.CERT_PUBLIC_KEY);

		// in 元素
		Element in = icbcAPI.addElement(PathConstant.ICBC_IN);

		// <PackNo>包序列号</PackNo>
		in.addElement(PathConstant.ICBC_PACK_NO).addText(packSerial);
		// <ShopCode>商城代码</ShopCode>
		in.addElement(PathConstant.ICBC_SHOP_CODE).addText(shopCode);
		// <ShopAccount>商城账号</ShopAccount>
		in.addElement(PathConstant.ICBC_SHOP_ACCOUNT).addText(shopAccount);
		// <tranDate>提交的日期时间</tranDate>
		in.addElement(PathConstant.ICBC_TRAN_DATE).addText(tranDate);
		// <orderNo>订单号</orderNo>
		in.addElement(PathConstant.ICBC_ORDER_NO).addText(orderNo);
		// <RejAmt>退款金额</RejAmt>
		in.addElement(PathConstant.ICBC_REJ_AMT).addText(RejAmt);
		// <signData>签名数据</signData>
		in.addElement(PathConstant.ICBC_SIGN_DATA).addText(signDataDone);
		// <Cert>证书</Cert>
		in.addElement(PathConstant.ICBC_CERT_CERT).addText(RejAmt);

		/*
		<in>
		<PackNo>包序列号</PackNo>
		<ShopCode>商城代码</ShopCode>
		<ShopAccount>商城账号</ShopAccount>
		<tranDate>提交的日期时间</tranDate>
		<orderNo>订单号</orderNo>
		<RejAmt>退款金额</RejAmt>
		<signData>签名数据</signData>
		<Cert>证书</Cert>
	    </in>
	    */
		
		document.setXMLEncoding(PathConstant.CHARACTER_GBK);
		String xmlHeader = PathConstant.XML_HEADER_GBK_NO;
		reqDataXml = xmlHeader + document.getRootElement().asXML();
	    
	    return reqDataXml;
	}
	
	/**
	 * @创建人 zero
	 * @创建时间 2018年3月9日 下午3:43:23
	 * @说明  ICBC B2C 签名
	 * @备注
	 * @param @param mData
	 * @param @throws Exception
	 * @return Map<String,String>
	 */
	public static Map<String, String> slDataBase64SignForIcbc(Map<String, String> mData) throws Exception {

        Map<String, String> returnMap = new HashMap<String, String>();
		try {
			FileInputStream f = new FileInputStream(mData.get(PathConstant.CERT_PRIVATE_KEY));
			byte[] bs = new byte[f.available()];
			f.read(bs);
			f.close();

			// 签名
			String sReqData = mData.get(PathConstant.TRAN_REQ_DATA);
			String merCertKeyPassword= mData.get(PathConstant.CERT_KEY_PASSWORD);
			byte[] signature = ReturnValue.base64enc(ReturnValue.sign(sReqData.getBytes(),
							sReqData.getBytes().length, bs, merCertKeyPassword.toCharArray()));
			returnMap.put(PathConstant.SIGN_DATA, new String(signature));

			// BASE64
			byte[] base64 = ReturnValue.base64enc(sReqData.getBytes());
			returnMap.put(PathConstant.BASE64_DATA, new String(base64));

			//证书公钥
			String sCertPublicKey = mData.get(PathConstant.CERT_PUBLIC_KEY);
			FileInputStream fs = new FileInputStream(sCertPublicKey);
			byte[] bsc = new byte[fs.available()];
			fs.read(bsc);
			fs.close();
			byte[] cert = ReturnValue.base64enc(bsc);
			returnMap.put(PathConstant.CERT_PUBLIC_KEY, new String(cert));
		} catch (Exception e) {
			throw e;
		}

	    return returnMap;
	}

}
