package com.example;

public class Cappuccino implements CoffeeMachineEx {
	private String hasCream;

	public String getHasCream() {
		return hasCream;
	}

	public void setHasCream(String hasCream) {
		this.hasCream = hasCream;
	}

	public void rateOfCoffee() {
		System.out.println("Price is 3$");
		
	}

	public void typeOfCoffee() {
		System.out.println("Its Cappuccino");
		
	}

}
