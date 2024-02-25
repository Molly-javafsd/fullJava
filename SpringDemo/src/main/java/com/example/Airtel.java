package com.example;

public class Airtel implements Sim {
	private String getDataStrength;

	public String getGetDataStrength() {
		return getDataStrength;
	}

	public void setGetDataStrength(String getDataStrength) {
		this.getDataStrength = getDataStrength;
	}

	public void typeOfSim() {
		System.out.println("this is airtel sim");
	}

	public void datatypeofSim() {
		System.out.println("it gives 5G service");
	}

}
