package com.apex.ecommerce.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apex.ecommerce.core.ApexBasePage;

public class LoginPage extends ApexBasePage {

	public static final String AssertJUnit = null;
	@FindBy(id = LoginContant.EMAIL_ID_LOCATOR)
	private WebElement emailId;
	@FindBy(id = LoginContant.PASSWORD_LOCATOR)
	private WebElement password;
	@FindBy(linkText = LoginContant.LOGIN_LINK_TEXT_LOCATOR)
	private WebElement signonLink;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignonLink(String email, String pwd1) {
		emailId.sendKeys(email);
		password.sendKeys(pwd1);
		signonLink.click();

	}

}
