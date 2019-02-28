package com.apex.ecommerce;

import java.util.HashMap;
import java.util.Set;

public class hasMapAndHasTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Navin" , "123456789");
		phonebook.put("pooja" , "222222222");
		phonebook.put("Ali" , "33333333");
		phonebook.put("Mahesh" , "444444444");
		phonebook.put("Archna" , "555555555");
		
		Set<String> key = phonebook.keySet();
		for(String i : key)
		{
		System.out.println(key);
		System.out.println(i + " " +phonebook.get(i));
		}
	}

}
