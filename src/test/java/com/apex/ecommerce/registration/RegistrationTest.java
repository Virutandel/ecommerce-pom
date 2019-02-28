package com.apex.ecommerce.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;


public class RegistrationTest extends ApexBaseTest {
	
	@Test
	public void registrationTestwithNewEmailAndPasswordData() {
	//create page
	RegistrationPage registrationPage = new RegistrationPage(driver);
	//perform action
	registrationPage.clickRegestation("tanzvira@gmail.com", "1234", "1234");
	//Verification
	AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	
	
	}
	
	@Test
	public void registrationTestwithUsedEmailandPasswordData() {
	//create page
	RegistrationPage registrationPage = new RegistrationPage(driver);
	//perform action
	registrationPage.clickRegestation("tanzvira@gmail.com", "1234" , "1234");
	//Verification
	AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	}

	
	@Test
	public void registrationTestwithNewEmailandWrongConfromaPasswordData() {
	//create page
	RegistrationPage registrationPage = new RegistrationPage(driver);
	//perform action
	registrationPage.clickRegestation("tanzvira@gmail.com", "1234", "12344");
	//Verification
	AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	}
}
