package com.zero.tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

public class UsuallyTools {

	
	@Test
	public void getDateTest() {
		System.out.println("===: " + getDate("yyyy-MM-dd"));
	}
	
	// 根据格式获取系统当前的日期时间
	public static String getDate(String dateFormat) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		System.out.println(df.format(date));
		return df.format(date).toString();
	}
	
	@Test
	public void stringDateToDate() {
		String d1 = "2018-02-26";
		String d2 = null;
		
		// d2 = d1.replaceAll("-", "");
		d2 = d1.replace("-", "");
		
		System.out.println("===: " + d2);
	
	}
	
	@Test
	public void jsonAndMapAnother() {
		
		Map<String, Object> mData = new HashMap<String, Object>();
		mData.put("aa", "aaaaa");
		mData.put("bb", "bbbbb");
		mData.put("cc", "ccccc");
		
		System.out.println("mData: " + mData);
		
		JSONObject jsonObj = JSONObject.fromObject(mData ); 
		System.out.println("jsonObj: " + jsonObj);
		
		Map<Object, Object> map = (Map)jsonObj;
		System.out.println("map-aa: " + map.get("aa"));
		
		// Map<String, String> mJson = JSONUtils.getProperties(jsonObj);
		// System.out.println("mJson: " + mJson);
		// System.out.println("mJson-aa: " + mJson.get("aa").toString());
		
		
	}

}
