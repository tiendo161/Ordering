package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;
import pageUI.liveguru.user.MyAccountPageUI;

public class MyAccountPageObject extends AbstractPage {

	WebDriver driver;

	public MyAccountPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public String getContactInfoValue(String contactValue) {
		waitForElementVisible(driver, AbstractPageUI.DYNAMIC_TEXTBOX, contactValue);
		return getAttribute(driver, AbstractPageUI.DYNAMIC_TEXTBOX, "value", contactValue);
		
	}

	public void clickToEditContactInfoLink() {
		waitForElementClickable(driver, MyAccountPageUI.EDIT_CONTACT_INFO_LINK);
		clickToElement(driver, MyAccountPageUI.EDIT_CONTACT_INFO_LINK);
	}

}
