package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpControllerMS1 {
@Autowired
EmployeeService dao;

@RequestMapping("/")
public ModelAndView loadPage(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("login.jsp");
	return mv;
}

@RequestMapping("/getallemp")
public ModelAndView display(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<Employee> list=dao.getAll();
	mv.addObject("list",list);
	mv.setViewName("displayemp.jsp");
	return mv;
}

@RequestMapping("/login")
public ModelAndView checkLogin(@RequestParam("user") String user,@RequestParam("pwd") String pwd,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Employee emp=dao.findByUserNPwd(user, pwd);
	if(emp!=null) {
		mv.setViewName("display.jsp");
		mv.addObject("emp",emp);
	}
	else {
		mv.setViewName("fail.jsp");
	}
	return mv;
}
@RequestMapping("/delete")
public ModelAndView dlt(@RequestParam("user") String user,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();

	RestTemplate rest=new RestTemplate();
	String url="http://localhost:8082/delete-user/"+user;
	rest.getForObject(url, String.class);
	
	mv.setViewName("successreg.jsp");
	
	return mv;
}
@ResponseBody
@RequestMapping("/registermslogin")
public ModelAndView registermslogin(@RequestParam("user") String user,@RequestParam("pwd") String pwd,@RequestParam("email") String email,HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	
	RestTemplate rest=new RestTemplate();
	String url="http://localhost:8082/register-user/"+user+"/"+pwd+"/"+email;
	rest.getForObject(url,String.class);
	
	mv.setViewName("successreg.jsp");
	return mv;
	
}
}
