package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;

public class LoginPageObject extends AbstractPage {

	WebDriver driver;

	public LoginPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

}
