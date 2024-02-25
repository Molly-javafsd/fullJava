package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MSRegistrationController {
@Autowired
EmployeeService dao;

@ResponseBody
@RequestMapping("register-user/{user}/{pwd}/{email}")
public String registerMicroservice(HttpServletRequest req,HttpServletResponse res,@PathVariable("user") String user,@PathVariable("pwd") String password,@PathVariable("email") String email) {
	Employee e=new Employee();
	e.setUser(user);
	e.setPassword(password);
	e.setEmail(email);
	Employee ee=dao.insert(e);
	if(ee!=null) {
		return "done";
	}
	else {
		return "failed";
	}
}

@ResponseBody
@RequestMapping("delete-user/{user}")
public String deleteUser(HttpServletRequest req,HttpServletResponse res,@PathVariable("user") String user) {
	Employee e=new Employee();
	e.setUser(user);
	String s=dao.dlt(e);
	if(s!=null) {
		return"deleted";
	}
	else {
		return "failed";
	}
}
}
