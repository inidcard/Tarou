package com.zero.webcontroller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("duck")
public class DuckController {
	
	private static final Logger logger = LoggerFactory.getLogger(DuckController.class);
	
	@RequestMapping(value ="/helloworld")
	public String helloWorld (HttpServletRequest request, HttpServletResponse  response , Model model){
		
		System.out.println("helloworld!!!");
		System.out.println("request-data APIName: " + request.getParameter("APIName"));
		System.out.println("request-data APIVersion: " + request.getParameter("APIVersion"));
		System.out.println("request-data MerReqData: " + request.getParameter("MerReqData"));
		System.out.println("request-data testaa: " + request.getParameter("testaa"));
		System.out.println("=====");

		logger.info("request-data: ", request.getAttribute("APPID"));
		return "pages/page-hello";
	}
	
	@RequestMapping(value ="/duckRespMap")
	public String duckRespMap (HttpServletRequest request, HttpServletResponse  response , Model model){
		
		System.out.println("helloworld!!!");
		System.out.println("request-data APIName: " + request.getParameter("APIName"));
		System.out.println("request-data APIVersion: " + request.getParameter("APIVersion"));
		System.out.println("request-data MerReqData: " + request.getParameter("MerReqData"));
		System.out.println("request-data testaa: " + request.getParameter("testaa"));
		System.out.println("=====");
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("code", "0000");
		hm.put("msg", "交易成功");
		
		model.addAllAttributes(hm);

		return "pages/page-map";
	}

}
