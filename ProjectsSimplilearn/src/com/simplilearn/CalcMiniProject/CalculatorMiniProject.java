package com.simplilearn.CalcMiniProject;

import java.util.Scanner;

public class CalculatorMiniProject {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while(true) {
		System.out.println("Enter you numbers");
		int num1=sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("Enter the operator +,-,*,/");
		String c =sc.next();
		char d = c.charAt(0);
		if(d=='+') {
			System.out.println("Addition is: "+(num1+num2));
		}
		else if(d=='-') {
			System.out.println("Substraction is: "+(num1-num2));
		} 
		else if(d=='*') {
			System.out.println("Multiplication is: "+(num1*num2));
		} 
		else if(d=='/') {
			System.out.println("Division is: "+(num1/num2));
		} 
		else {
			System.out.println("Enter proper operator");
		}
		System.out.println("Enter yes or no");
		String a=sc.next();
		char cd = a.charAt(0);
		if(cd=='y'||cd =='Y') {
			continue;
		}
		else {
			break;
		}
	
	}
}
}
