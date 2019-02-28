package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
	}

}
