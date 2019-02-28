package com.apex.ecommerce.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.core.ApexBasePage;

public class RegistrationPage extends ApexBasePage {

	@FindBy(xpath = RegistrationContant.ACCOUNT_BUTTON_LINK_LOCATOR)
	private WebElement accountButton;

	@FindBy(xpath = RegistrationContant.CONFIRM_PASSWORD_LINK_LOCATOR)
	private WebElement passwordConfirm;

	@FindBy(xpath = RegistrationContant.COUNTRY_LINK_LOCATOR)
	private WebElement country;

	@FindBy(xpath = RegistrationContant.DAYTIME_TELEPHONE_NO_LINK_LOCATOR)
	private WebElement dayTimeTelephoneNo;

	@FindBy(xpath = RegistrationContant.EVENINGTIME_TELEPHONE_NO_LINK_LOCATOR)
	private WebElement eveningTimeTelephoneNo;

	@FindBy(xpath = RegistrationContant.FIRST_DATE_OF_BIRTH_DAY_LINK_LOCATOR)
	private WebElement dateOfBirthDay;

	@FindBy(xpath = RegistrationContant.FIRST_DATE_OF_BIRTH_MONTHLINK_LOCATOR)
	private WebElement dateOfBirthMonth;

	@FindBy(xpath = RegistrationContant.FIRST_DATE_OF_BIRTH_YEAR_LINK_LOCATOR)
	private WebElement dateOfBirthYear;

	@FindBy(xpath = RegistrationContant.LAST_NAME_LINK_LOCATOR)
	private WebElement lastName;

	@FindBy(xpath = RegistrationContant.FIRST_NAME_LINK_LOCATOR)
	private WebElement firastName;

	@FindBy(xpath = RegistrationContant.FIRST_USER_EMAIL_ADDRESS_LINK_LOCATOR)
	private WebElement userEmail;

	@FindBy(xpath = RegistrationContant.GENDER_FEMALE_LINK_LOCATOR)
	private WebElement genderMale;

	@FindBy(xpath = RegistrationContant.GENDER_MALE_LINK_LOCATOR)
	private WebElement genderFemale;

	@FindBy(xpath = RegistrationContant.HOUSE_NUMBER_LINK_LOCATOR)
	private WebElement houseNo;

	@FindBy(xpath = RegistrationContant.NEWS_LETTER_RADIO_BUTTON_LINK_LOCATOR)
	private WebElement newLatterRadioButton;

	@FindBy(xpath = RegistrationContant.PASSWORD_LINK_LOCATOR)
	private WebElement passoword;

	@FindBy(xpath = RegistrationContant.POST_CODE_LINK_LOCATOR)
	private WebElement postCode;

	@FindBy(xpath = RegistrationContant.SIGN_UP_BUTTON_LINK_LOCATOR)
	private WebElement signUpButton;

	@FindBy(xpath = RegistrationContant.SIGN_UP_LINK_LOCATOR)
	private WebElement signUpLink;

	@FindBy(xpath = RegistrationContant.STREET_NAME_LINK_LOCATOR)
	private WebElement streetName;

	@FindBy(xpath = RegistrationContant.TERMS_AND_CONDIDTIONS_RADIO_BUTTON_LINK_LOCATOR)
	private WebElement termsAndCondidtion;

	@FindBy(xpath = RegistrationContant.TOWN_LINK_LOCATOR)
	private WebElement town;

	@FindBy(xpath = RegistrationContant.COUNTY_LINK_LOCATOR)
	private WebElement county;

	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickRegestation(String email1, String pswd1, String pswd2) {
		// Your personal detail
		accountButton.click();
		signUpLink.click();
		genderMale.click();
		firastName.sendKeys("Viral");
		lastName.sendKeys("Tandel");
		dateOfBirthDay.sendKeys("26");
		dateOfBirthMonth.sendKeys("10");
		dateOfBirthYear.sendKeys("1994");
		userEmail.sendKeys(email1);

		// your address
		houseNo.sendKeys("123");
		streetName.sendKeys("xyz");
		town.sendKeys("abc");
		county.sendKeys("def");
		country.clear();
		country.sendKeys("usa");
		postCode.sendKeys("12345");

		// Your contact detail
		dayTimeTelephoneNo.sendKeys("1234567890");
		eveningTimeTelephoneNo.sendKeys("0987654321");

		// your password
		passoword.sendKeys(pswd1);
		passwordConfirm.sendKeys(pswd2);

		// Additional
		newLatterRadioButton.click();

		// Teams and condition
		termsAndCondidtion.click();

		// signup
		signUpButton.click();

	}
}
