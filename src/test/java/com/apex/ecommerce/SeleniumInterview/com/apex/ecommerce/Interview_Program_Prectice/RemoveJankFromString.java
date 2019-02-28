package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.Interview_Program_Prectice;

public class RemoveJankFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java @#$%^&  Test *&^$^% String @#$%^&*{}|>:>";
		String s = str.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		
	}

}
