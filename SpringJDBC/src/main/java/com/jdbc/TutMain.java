package com.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutMain {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	Tution t=ac.getBean(Tution.class);
	TutionDAO dao=ac.getBean(TutionDAO.class);
	
	Scanner sc= new Scanner(System.in);
	while(true) {
		
	
	System.out.println("\nChoose: 1.Insert 2.Update 3.Delete 4.Retrive 5.Exit");
	int ch=sc.nextInt();
	
	switch(ch) {
	case 1:{
		System.out.println("Enter id:");
		t.settId(sc.nextInt());
		System.out.println("Enter name of tution");
		t.settName(sc.next()+sc.nextLine());
		System.out.println("Enter the stream taught");
		t.settType(sc.next());
		System.out.println("Enter contact number");
		t.setPhno(sc.nextLong());
		if(dao.insert(t)>0) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Failed!!");
		}
		break;
	}
	case 2:
	{
		System.out.println("Enter new name of tution");
		t.settName(sc.next()+sc.nextLine());
		System.out.println("Enter id whose name needs to be changed:");
		t.settId(sc.nextInt());
		if(dao.update(t)>0) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Failed!!");
		}
		break;	
	}
	case 3:
	{
		System.out.println("Enter id whose data needs to get deleted:");
		t.settId(sc.nextInt());
		if(dao.delete(t)>0) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Failed!!");
		}
		break;	
	}
	case 4:
	{
		List<Tution> li=dao.getAll();
		for(Tution tu:li) {
			System.out.println(tu);
		}
		break;
	}
	case 5:
		System.exit(0);
	}
}
}
}