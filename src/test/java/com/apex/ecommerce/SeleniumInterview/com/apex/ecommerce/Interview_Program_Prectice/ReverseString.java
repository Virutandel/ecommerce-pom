package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Selenium";
		/*String rev = "";
		int len = str.length();
		System.out.println(str.length());
		
		for (int i = len-1 ; i >= 0 ; i--) {
			char strrev = str.charAt(i);
			rev = rev + strrev;
		}
		
		System.out.println(rev);
		*/
	
		StringBuffer srtRev = new StringBuffer(str);
		System.out.println(srtRev.reverse());
	
	}
	
}
