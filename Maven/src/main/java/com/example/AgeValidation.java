package com.example;

public class AgeValidation {
public String ageValid(int n) {
	if (n>=18) {
		return "Right to vote";
	}
	else {
		return "Not eligible!!";
	}
}
}
