package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcMain {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Scanner sc=new Scanner(System.in);
		Student student=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		while(true) {
			System.out.println("Choose 1.Insert 2.Update 3.Delete 4.Retrive 5.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter id");
				student.setId(sc.nextInt());
				System.out.println("Enter name");
				student.setName(sc.next());
				System.out.println("Enter email");
				student.setEmail(sc.next());
				if(dao.insert(student)>0) {
					System.out.println("Insertion successful");
					}
				else {
					System.out.println("Insertion Failed!");
				}
				break;}
				
			case 2:{
				System.out.println("Enter id");
				student.setId(sc.nextInt());
				System.out.println("Enter updated name");
				student.setName(sc.next());
				
				if(dao.update(student)>0) {
					System.out.println("Updated");
					
				}
				else {
					System.out.println("Failed");
				}
				break;}
			case 3:
				{System.out.println("Enter id");
				student.setId(sc.nextInt());
				if(dao.delete(student)>0) {
					System.out.println("Deleted");
					
				}
				else {
					System.out.println("Failed");
				}
				break;}
			case 4:
			{
				List<Student> student1=dao.getallstudents();
				for(Student ss:student1) {
					System.out.println(ss);
				}
				break;}
			case 5:
				System.exit(0);
				
		}
	}
}
}
