package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AccessController {
	Logger log=Logger.getAnonymousLogger();
	
	@ResponseBody 	//generate virtual response
	@RequestMapping("/add")
	public String displayadd(HttpServletRequest request,HttpServletResponse response) {
		log.info("Entered into display add method");
		int result=Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		log.info("Addition of 2nos done");
		return "sum of numbers is "+result;
	}
	
	@ResponseBody
	@RequestMapping("/sub")
	public String displaysub(HttpServletRequest request,HttpServletResponse response) {
		log.info("Entered into display sub method");
		int result=Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		log.info("Subtraction of 2nos done");
		return "sub of numbers is "+result;
	}
	
}
