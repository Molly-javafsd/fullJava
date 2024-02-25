package com.example;

public class PrimeOrNot {
	public String PrOrNt(int num) {
		int flag=0;
	
		if(num==0 || num==1) {
			return"Not Prime";
		}
		else{
			for(int i=2;i<=num/2;i++){	
				if(num%i==0) {
					flag=1;
					break;
		}
			
		}
	}
		if(flag==0) {
			return "Yes,its a prime number";
		}
		else{
			return"Not Prime";
		}
	}
	
}
