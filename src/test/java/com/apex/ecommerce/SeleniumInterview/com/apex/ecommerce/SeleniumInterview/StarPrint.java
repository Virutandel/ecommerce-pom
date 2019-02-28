package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

public class StarPrint {

	public static void main(String[] args) {

		int numbStar = 6;
		int row = 0;
		for (int i = 0; i < numbStar; i++) {
			
			for (int k = 0; k < row; k++) {
				System.out.print("*");
			}
			row++;
			System.out.println();
				}
		
	}

}
