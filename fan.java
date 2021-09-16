package com.xworkz.controlStatements;

public class fan {
	public static void turnOnFan() {
		System.out.println("Fan switched on");
	}
	public static void turnOffFan() {
		System.out.println("Fan switched off");
	}
	public static void increase() {
		System.out.println("Fan speed increased");
	}
	public static void decrease() {
		System.out.println("Fan speed decreased");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the room");
		
		fan.turnOnFan();
		fan.turnOffFan();
		fan.increase();
		fan.decrease();
		System.out.println("Exit from the room");
	}

}
