package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {

	protected WebDriver driver = null;

	@BeforeMethod
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php?msg=lnvalid");
	}

	@AfterMethod
	public void CleanUp() {
		driver.close();
	}

}
