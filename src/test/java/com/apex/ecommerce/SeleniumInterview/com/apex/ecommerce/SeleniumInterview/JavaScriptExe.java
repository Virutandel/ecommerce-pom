package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExe {
	WebDriver driver;
@Test
	public void TestJS() throws IOException, InterruptedException {
		/*
												 * System.setProperty("webdriver.chrome.driver",
												 * "C:\\Drivers\\chromedriver\\chromedriver.exe"); WebDriver driver =
												 * new ChromeDriver(); driver.get("https://Facebook.com");
												 */

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Viru\\eclipse-workspace\\ecommerce-pom\\Config.properties");
	    
		prop.load(ip);
		
		System.out.println(prop.getProperty("URL"));
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("FF")) {
			System.setProperty("webdriver.firefox.driver", "C:\\webdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.xpath(prop.getProperty("FirstNameXpath"))).sendKeys(prop.getProperty("FirstName"));
	Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("LastNameXpath"))).sendKeys("LastName");
		driver.findElement(By.linkText(prop.getProperty("MobileNumberlink"))).sendKeys(prop.getProperty("MobileNumber"));

driver.close();
}

}
