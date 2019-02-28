package com.apex.ecommerce.login;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;

public class LoginTest extends ApexBaseTest {

	@Test
	public void testLoginwithCorrectData() {
		// create page
		LoginPage loginPage = new LoginPage(driver);
		// perform action
		loginPage.clickSignonLink("rece@amadamus.com", "1234");
		// assert
		AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	}

	@Test
	public void testLoginwithBlankData() {
		// create page
				LoginPage loginPage = new LoginPage(driver);
				// perform action
				loginPage.clickSignonLink("", "");
				// assert
				AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	
	
	}

	@Test
	public void testLoginwithBlankUser() {
		// create page
				LoginPage loginPage = new LoginPage(driver);
				// perform action
				loginPage.clickSignonLink("", "1234");
				// assert
				AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	}

	@Test
	public void testLoginwithBlankPassword() {
		// create page
				LoginPage loginPage = new LoginPage(driver);
				// perform action
				loginPage.clickSignonLink("rece@amadamus.com", "");
				// assert
				AssertJUnit.assertEquals(driver.getTitle(), "Ez Shop Online");
	}

}
