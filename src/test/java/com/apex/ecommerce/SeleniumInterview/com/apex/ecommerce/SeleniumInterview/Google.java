package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

public class Google {

	public static int isSmallest(int num[]) {

		// System.out.println(num[0]);
		int k = 0;
		// int j = 1;
		int i = 1;
		int temp = 0;
		for (i = 1; i < num.length; i++) {
			
			if (temp > num[i]) {

				temp = num[i];

			}
		}

System.err.println();
		return 0;
	}

	public static void main(String[] args) {
		int input[] = {1, 2, 3, 6, 7, 8, 10, 11,100,21,34,91,12,10,11};

		isSmallest(input);
	}

}
