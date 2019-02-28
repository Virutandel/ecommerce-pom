package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class primeNumber {

	// if number 1 or less means its not a prime number (this is corner case -Ve
	// number are not prime number)
	// if number%2 = zero means its not a prime number
	// and if above two condition is not satisfy means its prime number

	public static boolean isPrimeNumber(int num) {
		// int num2 = num % 2;
		if (num <= 1) {
			return false;
		}

		else if (num % 2 == 0) {
			return false;
		}
		return true;
	};

	// make loop which increase number and pass this number to isPrimenumber

	public static void getPrimeNumber(int num) {
		for(int i = 2; i<= num; i++ ) {
		
			if (isPrimeNumber(i)==true) {
		System.out.println(i + "is prime number: "+ isPrimeNumber(i));
		
			}
	
		}
		
	}

	public static void main(String[] args) {

		getPrimeNumber(20);

		/*
		 * System.out.println("2 is prime number : " + isPrimeNumber(2));
		 * System.out.println("3 is prime number : " + isPrimeNumber(3));
		 * System.out.println("1 is prime number : " + isPrimeNumber(1));
		 * System.out.println("-3 is prime number : " + isPrimeNumber(-3));
		 * System.out.println("9 is prime number : " + isPrimeNumber(9));
		 * System.out.println("7 is prime number : " + isPrimeNumber(7));
		 * System.out.println("0 is prime number : " + isPrimeNumber(0));
		 * System.out.println("10 is prime number : " + isPrimeNumber(10));
		 */

	}

}
