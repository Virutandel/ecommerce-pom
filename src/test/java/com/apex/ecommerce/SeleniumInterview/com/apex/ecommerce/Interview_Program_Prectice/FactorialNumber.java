package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class FactorialNumber {
	// number = 3
	// 3*2*1

	// take number
	// crate loop with that given number and catch increment number and multiply by
	// previous number

	public static int isFactorialNumber(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(isFactorialNumber(5));
		System.out.println(isFactorialNumber(10));
		System.out.println(isFactorialNumber(3));
	}
}


