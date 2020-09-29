package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;

public class HomeUserPageObject extends AbstractPage {

	WebDriver driver;

	public HomeUserPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public MobilePageObject clickToTabLink(String tabName) {
		clickToDynamicLink(driver, tabName);
		return PageGeneratorManager.getMobilePage(driver);
	}







}
