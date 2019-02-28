package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

import java.sql.Array;

public class PalindromeNumber {

	public static void isPalindrom(int num) {
		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;                         // r  = 1      5       1       
			sum = (sum * 10) + r;				  // SUM  = 1     15     151
			num = num / 10;						  // NUM = 15     1      0
		}

		if (t == sum) {
			System.out.println(sum + " is Palindrome");
		} else {
			System.out.println(sum + " is not Palindrome");
		}
	}

	public static void main(String[] args) {
		isPalindrom(151);
	}

}
