package com.xworkz.oops;

public class Registration {
	String name;
	String email;
	long phNo;
	
	
	public Registration(String name,long phNo) //can only use public modifier
	{	this.name=name;
		this.phNo=phNo;
		System.out.println("registration is sucessful using "+this.phNo+" phone number");
		
	}
	
	
	public Registration(String name,String email)
	{	this.name=name;
		this.email=email;
		System.out.println("registration is sucessful using "+this.email+" mail id");
	}

}
