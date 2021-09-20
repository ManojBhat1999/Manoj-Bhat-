package com.xworkz.controlStatements;

public class Discount {
	public static void Discount (double value ,double discount) { 
		double total=value-(value*discount); 
		if(value==1000) { 
			System.out.println("the discount is 15% and the discounted price is" +total); 
			} 
		else if(value==2000) { 
			System.out.println("the discount is 20% and the discounted price is" +total); 
			} else if(value==3000) {
				System.out.println("the discount is 25% and the discounted price is" +total); 
				} else if(value>=3000) { 
					System.out.println("the discount is 30% and the discounted price is" +total); 
					}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the shop");
		Discount.Discount(3500, 0.30);
		System.out.println("Thank you for shopping with us ");
		
	}

}
