package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@RequestMapping("/insert")
public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Student s=ac.getBean(Student.class);
	StudentDAO dao=ac.getBean(StudentDAO.class);
	
	s.setEmail(request.getParameter("email"));
	s.setPhono(request.getParameter("phono"));

	int row=dao.insert(s);
	if(row>0) {
		mv.setViewName("display.jsp");
	}
	else {
		mv.setViewName("error.jsp");
	}
	return mv;
}
@RequestMapping("/update")
public ModelAndView update(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Student s=ac.getBean(Student.class);
	StudentDAO dao=ac.getBean(StudentDAO.class);
	
	s.setEmail(request.getParameter("email"));
	s.setPhono(request.getParameter("phono"));
	s.setSid(Integer.parseInt(request.getParameter("sid")));
	
	String s1=dao.update(s);
	if(s1!=null) {
		mv.setViewName("display.jsp");
	}
	else {
		mv.setViewName("error.jsp");
	}
	return mv;
}
@RequestMapping("/delete")
public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Student s=ac.getBean(Student.class);
	StudentDAO dao=ac.getBean(StudentDAO.class);
	
	s.setSid(Integer.parseInt(request.getParameter("sid")));
	
	String s2=dao.delete(s);
if(s2!=null) {
		mv.setViewName("display.jsp");
	}
	else {
		mv.setViewName("error.jsp");
	}
	return mv;
}

@RequestMapping("/display")
public ModelAndView display(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	StudentDAO dao=ac.getBean(StudentDAO.class);
	
	List<Student> list=dao.getAll();
	mv.setViewName("displayall.jsp");
	mv.addObject("list",list);
	return mv;
}
}