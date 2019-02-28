package com.apex.ecommerce.SeleniumInterview.com.apex.ecommerce.SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
	@Test
  public void f() throws InterruptedException {
		
		
		
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.danielwellington.com/us/");
		driver.manage().window().maximize();
	//	WebDriver driv = (WebDriver) driver.findElement(By.linkText("Sign in"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.cssSelector("body.js-focus-visible:nth-child(2) div.sc-1j4ud3w-0.gjBsMG:nth-child(2) div.sc-12m3bgp-0.dJzcf div.sc-12m3bgp-4.dMxjtY:nth-child(2) a.sc-12m3bgp-2.dozyAn.avsuad-0.dQGvVH > h5.sc-1e13ktb-5.NDqxN"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/nav[1]/a[2]/span[1]")).click();
		
		
		
		
	//	driver.close();
		
		*/
	
		
		
		
		
		
		
		
		
		//DragAndDrop
/*		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement SourceElement = driver.findElement(By.id("draggable"));
		WebElement TargetElement = driver.findElement(By.id("draggable"));
		
		
		Actions action = new Actions(driver);
		
		//action.dragAndDrop(SourceElement, TargetElement);
		
		action.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
		
	//	action.clickAndHold(TargetElement).moveToElement(SourceElement).release().build().perform();

	*/
	
	
	//right click https://swisnl.github.io/jQuery-contextMenu/demo.html
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.cssSelector(".btn-neutral"));
		
		Actions RClick = new Actions(driver);
		
		RClick.contextClick(rightClick).build().perform();
		
		driver.findElement(By.cssSelector(".context-menu-icon-copy")).click();
	*/
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Facebook.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]/i[1]")).click();
		/*Thread.sleep(3000);
		
		driver.findElement(By.linkText("Google Search")).click();		
		*/
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to(driver.getCurrentUrl());
		
	}
	
}
