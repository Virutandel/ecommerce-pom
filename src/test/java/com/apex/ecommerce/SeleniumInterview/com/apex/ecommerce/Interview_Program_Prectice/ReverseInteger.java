package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class ReverseInteger {

	public static void main(String[] args) {

		/*
		 * int num = 123456789; int rev = 0;
		 * 
		 * while(num != 0) {
		 * 
		 * rev = rev*10 + num%10; // rev*10 : create space with zero to store new
		 * separated digit and num%10 : separate last digit
		 * 
		 * num = num / 10; // remove last digit }
		 * 
		 * System.out.println(rev);
		 */

		isPalindrom(1001001);

	}

	public static void isPalindrom(int num) {
		// 151 is palindorm

		int temp;
		temp = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10; // 1, 10
			num = num / 10;
		}

		
		if (rev == temp) {
			System.out.println(temp + " is palindrom");
		} else {
			System.out.println(temp + " is Not palindrom");
		}
	}

}
