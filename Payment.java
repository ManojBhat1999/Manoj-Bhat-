package com.xworkz.oops;

public class Payment {
	long card;
	String UPI;
	int cash;
	
	// constructor number 1
	public Payment(int cash) 
	{	this.cash=cash;
		System.out.println("payment is successful using cash");
		
	}
	
	// constructor number 2
	public Payment(String UPI)
	{	this.UPI=UPI;
		System.out.println("payment is successful using UPI");
	}
	
	// constructor number 3
		public Payment(long card)
		{	this.card=card;
			System.out.println("payment is successful using Card");
		}

}
