package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	Cappuccino cp=ac.getBean(Cappuccino.class);
    	cp.typeOfCoffee();
    	cp.rateOfCoffee();
    	System.out.println(cp.getHasCream());
    	
    	Expresso ex=ac.getBean(Expresso.class);
    	ex.typeOfCoffee();
    	ex.rateOfCoffee();
    	
    	
}
}
