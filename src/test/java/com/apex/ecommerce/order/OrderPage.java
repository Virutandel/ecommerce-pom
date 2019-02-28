package com.apex.ecommerce.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBasePage;

public class OrderPage extends ApexBasePage {

	@FindBy(xpath = OrderContant.ADD_TO_CART_LINK_LOCATOR)
	private WebElement addToCart;

	@FindBy(xpath = OrderContant.CONTINUE_LINK_LOCATOR_1)
	private WebElement continueButtonOne;

	@FindBy(xpath = OrderContant.CONTINUE_LINK_LOCATOR_2)
	private WebElement continueButtonTwo;

	@FindBy(xpath = OrderContant.LOGIN_LINK_PLUS_CHECKOUT_LOCATOR)
	private WebElement logIn_plus_checkout;

	@FindBy(xpath = OrderContant.PAY_PAL_LINK_LOCTOR)
	private WebElement payPal;

	@FindBy(xpath = OrderContant.PRODUCT_SELCTION_LINK_LOCATOR)
	private WebElement productSelect;

	@FindBy(xpath = OrderContant.RADIO_BUTTON_LINK_LOCATOR)
	private WebElement standardShipping;

	@FindBy(xpath = OrderContant.SECURE_PAYMENT_LOCATOR)
	private WebElement securePayment;

	@FindBy(xpath = OrderContant.ORDER_EMAIL_ID_LOCATOR)
	private WebElement emailId;

	@FindBy(xpath = OrderContant.ORDER_PASSWORD_ID_LOCATOR)
	private WebElement password;

	@FindBy(xpath = OrderContant.PRODUCT_LINK_LOCATOR)
	private WebElement productButton;

	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void orderProduct(String email, String pwd) {

		emailId.sendKeys(email);
		password.sendKeys(pwd);
		logIn_plus_checkout.click();
		productButton.click();
		productSelect.click();
		addToCart.click();
		logIn_plus_checkout.click();
		continueButtonTwo.click();
		standardShipping.click();
		continueButtonTwo.click();
		payPal.click();
		continueButtonTwo.click();
		continueButtonTwo.click();
		securePayment.click();

	}
}