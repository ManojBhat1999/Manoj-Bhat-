package com.xworkz.controlStatements;

public class sumofarrayelements {
	public static void main(String[] args) {
		int billAmount[] = {1200, 292, 202, 2928, 300};
		int sumAmount = 0;
		for(int i=0;i<billAmount.length;i++) {
			sumAmount = sumAmount + billAmount[i];
		}
		System.out.println(sumAmount);
	}
}
