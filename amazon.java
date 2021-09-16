package com.xworkz.controlStatements;

public class amazon {
	public static void order() {
		System.out.println("Order placed successfully");
	}
	public static void addToCart() {
		System.out.println("Added to cart successfully");
	}
	public static void viewProducts() {
		System.out.println("Products viewed");
	}
	public static void payment() {
		System.out.println("Payment done successfully");
	}
	
	public static void main(String[] args) {
		System.out.println("Login to Amazon");
		
		amazon.addToCart();
		amazon.order();
		amazon.payment();
		amazon.viewProducts();
		System.out.println("Logout from Amazon");
	}

}
