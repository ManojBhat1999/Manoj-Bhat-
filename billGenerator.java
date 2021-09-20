package com.xworkz.controlStatements;

public class billGenerator {
	public static void billGenerator(int price , int quantity) {
		int total=price*quantity;
		{
			System.out.println("total is " +total)	;
			}
	}

	public static void main(String[] args) {
		
	System.out.println("Welcome");
	billGenerator.billGenerator(18, 5);
 }

}
