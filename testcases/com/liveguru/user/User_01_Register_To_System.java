package com.liveguru.user;

import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.DataHelper;
import commons.PageGeneratorManager;
import pageObjects.live.user.HomeUserPageObject;
import pageObjects.live.user.MyAccountPageObject;
import pageObjects.live.user.RegisterPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class User_01_Register_To_System extends AbstractTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		firstName = data.getFirstName();
		lastName = data.getLastName();
		Email = data.getEmail();
		password = data.getPassword();

	}

	@Test
	public void TC_01_RegisterToSystem() {
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
		
		verifyTrue(registerPage.isSuccessMessageDisplayed(driver, "Thank you for register with Main Webserive Store."));

	}

	@Test
	public void TC_02_VerifyRegisteredUserInfoCorrect() {
		myAccountPage = PageGeneratorManager.getMyAccountPage(driver);
		myAccountPage.clickToEditContactInfoLink();
		
		verifyEquals(myAccountPage.getContactInfoValue("firstname"), firstName);
		verifyEquals(myAccountPage.getContactInfoValue("lastname"), lastName);
		verifyEquals(myAccountPage.getContactInfoValue("email"), Email);
	}
	@AfterClass
	public void afterClass() {
		closeBrowserAndDriver(driver);

	}

	WebDriver driver;
	HomeUserPageObject homePage;
	RegisterPageObject registerPage;
	MyAccountPageObject myAccountPage;
	DataHelper data = DataHelper.getData();
	String firstName, lastName, Email, password;
}
