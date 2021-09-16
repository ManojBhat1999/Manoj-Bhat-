package com.xworkz.controlStatements;

public class AC {
	public static void turnOnAc() {
		System.out.println("AC switched on");
	}
	public static void turnOffAc() {
		System.out.println("AC switched off");
	}
	public static void increase() {
		System.out.println("AC speed increased");
	}
	public static void decrease() {
		System.out.println("AC speed decreased");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the room");
		
		AC.turnOnAc();
		AC.increase();
		AC.decrease();
		AC.turnOffAc();
		System.out.println("Exit from the room");
	}

}
