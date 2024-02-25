package com.example.CRUDMain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.example.DAO.StudentDAO;
import com.example.dbUtil.DbUtil;
import com.example.pojo.Student;

public class CRUDMain {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	Connection con=DbUtil.dbConn();
	while(true) {
		System.out.println("Enter choice: \n1.Insert \n2.Update \n3.Delete \n4.Retrieve \n5.Exit");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			Student s=new Student();
			System.out.println("Enter id:");
			s.setId(sc.nextInt());
			System.out.println("Enter name:");
			s.setName(sc.next());
			System.out.println("Enter email:");
			s.setEmail(sc.next());
			System.out.println("Enter address:");
			s.setAddress(sc.next());
			
			StudentDAO dao=new StudentDAO();
			int row=dao.insert(s);
			if(row>0) {
				System.out.println("Inserted!!");
			}
			else {
				System.out.println("Failed!!");
			}
			break;
		}
		case 2:{
			Student s=new Student();
			System.out.println("Enter id to update:");
			s.setId(sc.nextInt());
			System.out.println("Enter name:");
			s.setName(sc.next());
			StudentDAO dao=new StudentDAO();
			int row=dao.update(s);
			if(row>0) {
				System.out.println("Updated!!");
			}
			else {
				System.out.println("Failed!!");
			}
			break;
		}
		case 3:{
			Student s=new Student();
			System.out.println("Enter id to delete:");
			s.setId(sc.nextInt());
			StudentDAO dao=new StudentDAO();
			int row=dao.delete(s);
			if(row>0) {
				System.out.println("Deleted!!");
			}
			else {
				System.out.println("Failed!!");
			}
			break;
		}
		case 4:{
			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.getAll();
			for(Student s:list) {
				System.out.println(s.getId()+","+s.getName()+","+s.getEmail()+","+s.getAddress());
			}
			break;
		}
		case 5:{
			con.close();
			sc.close();
			System.exit(0);
		}
	}
	}
	
}
}
