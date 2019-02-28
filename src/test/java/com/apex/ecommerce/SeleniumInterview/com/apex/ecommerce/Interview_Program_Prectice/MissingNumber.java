package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class MissingNumber {

	/*
	 * public static void isMinssing() { int a[] = {1,2,4,5}; int sum = 0; for (int
	 * i = 0; i < a.length; i++) { sum = sum + a[i];
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {

		int a[] = { 1, 2,3, 4, 5 ,6,7,8,9,10,11,12,13,14,16,17,18,19,20 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
	
		
		for (int j = 1; j < a.length+2; j++) {
			sum1 = sum1 + j;
	//	System.out.println("counter sum1: " +sum1);
		}

		System.out.println("length : " + a.length);
		System.out.println(sum);
		
		System.out.println(sum1);
		
		System.out.println("Missing Number is: " + (sum1-sum) );
	}
}