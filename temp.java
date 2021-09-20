package com.xworkz.controlStatements;

public class temp {
	public static double getTemperature() { 
		return 18.0; 
		}

	public static void main(String[] args) {
		System.out.println("Welcome to the temperature forecast of the day");
		double temp=getTemperature();
		System.out.println("temperature"+temp);
	}

}
