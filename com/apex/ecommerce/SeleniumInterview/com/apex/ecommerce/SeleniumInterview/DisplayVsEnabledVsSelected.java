package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayVsEnabledVsSelected {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		
		
		//	driver.get("https://www.freecrm.com/register/");
		
		
		
		
		
		
		
		//Check Box IsSelect
	//	boolean CheckBox = driver.findElement(By.name("agreeTerms")).isSelected();
	//	System.out.println("CheckBox: " + CheckBox);

//		System.out.println("======================================");
		
	/*	Boolean EnableButton1 = driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println("Enable Button check : " + EnableButton1);
		

		System.out.println("======================================");
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean CheckBoxCheck = driver.findElement(By.name("agreeTerms")).click();
		System.out.println("CheckBox Checked: " + CheckBoxCheck);
		

		System.out.println("======================================");
		
		//SubmitButton iS enabled Check
		Boolean EnableButton = driver.findElement(By.name("submitButton")).isEnabled();
		System.out.println("Enable Button check : " + EnableButton);
		
		System.out.println("======================================");
		
		boolean ValueIsDisplayed = driver.findElement(By.id("payment_plan_id")).isDisplayed();
		System.out.println("Value Is Displayed: " + ValueIsDisplayed);
		
*/	}
}
