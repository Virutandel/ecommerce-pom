package com.apex.ecommerce.registration;

public interface RegistrationContant {

// Buttons

	// YOUR PERSIONAL INFORMATION
	public static final String ACCOUNT_BUTTON_LINK_LOCATOR = "//a[contains(text(),'ACCOUNT')]";
	public static final String SIGN_UP_LINK_LOCATOR = "//a[contains(text(),'SignUp')]";
	public static final String GENDER_MALE_LINK_LOCATOR = "//td[@class='font']//input[@value='1']";
	public static final String GENDER_FEMALE_LINK_LOCATOR = "//td[@class='font']//input[@value='1']";
	public static final String FIRST_NAME_LINK_LOCATOR = "//input[@id='fname']";
	public static final String LAST_NAME_LINK_LOCATOR = "//input[@id='lname']";

	public static final String FIRST_DATE_OF_BIRTH_DAY_LINK_LOCATOR = "//input[@id='day']";
	public static final String FIRST_DATE_OF_BIRTH_MONTHLINK_LOCATOR = "//input[@id='month']";
	public static final String FIRST_DATE_OF_BIRTH_YEAR_LINK_LOCATOR = "//input[@id='year']";

	public static final String FIRST_USER_EMAIL_ADDRESS_LINK_LOCATOR = "//input[@id='email']";

	// YOUR ADDRESS
	public static final String HOUSE_NUMBER_LINK_LOCATOR = "//input[@id='houseno']";
	public static final String STREET_NAME_LINK_LOCATOR = "//input[@id='add1']";
	public static final String TOWN_LINK_LOCATOR = "//input[@id='add1']";
	public static final String COUNTRY_LINK_LOCATOR = "//input[@id='state']";
	public static final String COUNTY_LINK_LOCATOR = "//input[@id='country']"; // CLEAN UK
	public static final String POST_CODE_LINK_LOCATOR = "//input[@id='postcode']";

	// YOUR CONTACT INFOMATION
	public static final String DAYTIME_TELEPHONE_NO_LINK_LOCATOR = "//input[@id='phone']";
	public static final String EVENINGTIME_TELEPHONE_NO_LINK_LOCATOR = "//input[@id='fax']";

	// YOUR PASSWORD
	public static final String PASSWORD_LINK_LOCATOR = "//input[@id='password']";
	public static final String CONFIRM_PASSWORD_LINK_LOCATOR = "//input[@id='cpassword']";

	// ADDITIONAL
	public static final String NEWS_LETTER_RADIO_BUTTON_LINK_LOCATOR = "//input[@id='newsletter']";

	// TERMS AND CONDITIONS
	public static final String TERMS_AND_CONDIDTIONS_RADIO_BUTTON_LINK_LOCATOR = "//input[@id='terms']";

	// SIGNUP BUTTON
	public static final String SIGN_UP_BUTTON_LINK_LOCATOR = "//input[@value='Sign Up']";

	
	
}
