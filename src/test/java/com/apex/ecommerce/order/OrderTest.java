package com.apex.ecommerce.order;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;

public class OrderTest extends ApexBaseTest implements OrderContant {
	@Test
	public void orderTest() {
		
		OrderPage orderPage = new  OrderPage(driver);
		orderPage.orderProduct(EMAIL_ID_DATA, PASSWORD_ID_DATA);
		AssertJUnit.assertEquals(driver.getTitle(), "Log in to your account");
		
	}

}
