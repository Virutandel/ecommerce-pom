package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	protected WebDriver driver = null;
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php?msg=lnvalid");
	}

}
