package com.xworkz.controlStatements;

public class sumofnumbersby3 {
	public static void main(String[] args) {
		int billAmount[] = {1200, 292, 202, 2928, 300};
		int sumAmount = 0;
		for(int i=0;i<billAmount.length;i++) {
			if(billAmount[i]%3==0) {
			sumAmount = sumAmount + billAmount[i];
		 }
		}
		System.out.println(sumAmount);
	}

}
