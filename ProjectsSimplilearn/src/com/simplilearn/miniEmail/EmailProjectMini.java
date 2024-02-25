package com.simplilearn.miniEmail;

import java.util.Scanner;

public class EmailProjectMini {
public static void main(String[] args) {
	String[] Email= {"molly.3@gmail.com","neha.10@gmail.com","abhishek.55@gmail.com","ayaansh.09@gmail.com","neeta.4@gmail.com"};
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter your mail: ");
	String mail=sc.next();
	boolean flag = false;
	for(String e:Email) {
		if(e.equalsIgnoreCase(mail)) {
			flag = true;
			break;
		}
	}
		if(flag) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
			}
		sc.close();
}
}
