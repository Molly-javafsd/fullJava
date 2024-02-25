package com.example;

public class Idea implements Sim{
	private String dataStrength;

	public Idea(String dataStrength) {
		super();
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		System.out.println("this is Idea sim");
	}

	public void datatypeofSim() {
		System.out.println("it gives 4G service");
	}
	public void display() {
		System.out.println(dataStrength);
	}


}
