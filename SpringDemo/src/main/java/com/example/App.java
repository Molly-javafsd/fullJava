package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		 ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Airtel airtel=ac.getBean(Airtel.class);		//calling with class Airtel
		airtel.typeOfSim();
		airtel.datatypeofSim();
		System.out.println(airtel.getGetDataStrength());
		
		Idea id=(Idea) ac.getBean("idea");			//calling with id in bean mapping
		id.typeOfSim();
		id.datatypeofSim();
		id.display();

		
	

	}

	
}
