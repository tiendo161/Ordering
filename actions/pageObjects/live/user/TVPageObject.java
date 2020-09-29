package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;
import pageUI.liveguru.user.MobilePageUI;
import pageUI.liveguru.user.TVPageUI;

public class TVPageObject extends AbstractPage {

	WebDriver driver;

	public TVPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public String getValidationMessageTextByTextField(String textFieldName) {
		waitForElementVisible(driver, TVPageUI.VALIDATION_MESSAGE_REQUIRED, textFieldName);
		return getElementText(driver, TVPageUI.VALIDATION_MESSAGE_REQUIRED, textFieldName);
	}

}
