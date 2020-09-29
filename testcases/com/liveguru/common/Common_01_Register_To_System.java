package com.liveguru.common;

import commons.AbstractTest;
import commons.DataHelper;
import commons.PageGeneratorManager;
import pageObjects.live.user.HomeUserPageObject;
import pageObjects.live.user.MyAccountPageObject;
import pageObjects.live.user.RegisterPageObject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class Common_01_Register_To_System extends AbstractTest {

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browserName) {
		driver = getBrowserDriver(browserName);
		firstName = data.getFirstName();
		lastName = data.getLastName();
		Email = data.getEmail();
		password = data.getPassword();

		homePage = PageGeneratorManager.getHomeUserPage(driver);
		homePage.clickOnAccountMenu(driver);

		homePage.clickToDynamicLinkInAccountHeader(driver, "Register");
		registerPage = PageGeneratorManager.getRegisterPage(driver);

		registerPage.inputToDynamicTextbox(driver, "firstname", firstName);
		registerPage.inputToDynamicTextbox(driver, "lastname", lastName);
		registerPage.inputToDynamicTextbox(driver, "email", Email);
		registerPage.inputToDynamicTextbox(driver, "password", password);
		registerPage.inputToDynamicTextbox(driver, "confirmation", password);

		registerPage.clickToDynamicButton(driver, "Register");
		verifyTrue(registerPage.isSuccessMessageDisplayed(driver, "Thank you for registering with Main Website Store."));

		closeBrowserAndDriver(driver);

	}

	WebDriver driver;
	HomeUserPageObject homePage;
	RegisterPageObject registerPage;
	MyAccountPageObject myAccountPage;
	DataHelper data = DataHelper.getData();
	String firstName, lastName;
	public static String Email, password;
}
