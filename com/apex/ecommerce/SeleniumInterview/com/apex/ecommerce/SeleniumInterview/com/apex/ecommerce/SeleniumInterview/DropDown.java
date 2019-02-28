package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
  @Test
  public void f1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
  
  
  }
}
