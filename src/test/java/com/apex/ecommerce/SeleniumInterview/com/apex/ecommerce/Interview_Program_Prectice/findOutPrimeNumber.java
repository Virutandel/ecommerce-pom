package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class findOutPrimeNumber {

	// number % 2 is not prime number
	// if above two condition is not satisfy then its prime number

	public static boolean isPrimeNumber(int num) {
		// number <=1 is not a prime number
		if (num <= 1) {
			return false;
		}

		else if (num % 2 == 0) {
			return false;
		}

		return true;
	}

	// create number loop and verify using Isprime number method and print if its is
	// prime number

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {

			if (isPrimeNumber(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		getPrimeNumber(100000000);

	}

}
