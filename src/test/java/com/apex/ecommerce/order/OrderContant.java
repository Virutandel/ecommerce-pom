package com.apex.ecommerce.order;

public interface OrderContant {
	
	//Button Locator
	public static final String SECURE_PAYMENT_LOCATOR = "//input[@value='Secure Payment']";
	public static final String PAY_PAL_LINK_LOCTOR = "//input[@value='1']";
	public static final String RADIO_BUTTON_LINK_LOCATOR = "//td[@class='maincontainer']//tbody//tbody//tbody//tr[4]//td[3]//input[1]";
	public static final String CONTINUE_LINK_LOCATOR_2 = "//img[@src='images/continue.gif']";
	public static final String ADD_TO_CART_LINK_LOCATOR = "//input[@value='Add to Cart']";
	public static final String PRODUCT_SELCTION_LINK_LOCATOR = "//td[@valign='top']//div[5]//div[2]//p[2]//a[1]//img[1]";
	public static final String CONTINUE_LINK_LOCATOR_1 = "//a[contains(text(),'PRODUCTS')]";
	public static final String LOGIN_LINK_PLUS_CHECKOUT_LOCATOR = "//div[@align='center']"; //LOGIN_LINK + CHECKOUT LINK LOCATOR	
	public static final String PRODUCT_LINK_LOCATOR = "//a[contains(text(),'PRODUCTS')]";
	//Login link locator
	public static final String ORDER_PASSWORD_ID_LOCATOR = "//input[@id='password']";
	public static final String ORDER_EMAIL_ID_LOCATOR = "//input[@id='email']";

	
	//Data
	public static final String PASSWORD_ID_DATA = "1234";
	public static final String EMAIL_ID_DATA = "hubopeni@daabox.com";

}
