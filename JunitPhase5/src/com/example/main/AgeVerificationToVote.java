package com.example.main;

public class AgeVerificationToVote {
	public String ageCheck(int age) {
		if(age>18) {
			return "Right to vote!!";
		}
		else {
			return "Not Eligible!!";
		}
	}
}
