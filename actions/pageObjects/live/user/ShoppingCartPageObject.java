package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;
import pageUI.liveguru.user.MobilePageUI;
import pageUI.liveguru.user.ShoppingPageUI;
import pageUI.liveguru.user.TVPageUI;

public class ShoppingCartPageObject extends AbstractPage {

	WebDriver driver;

	public ShoppingCartPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public Float getFlatRateValue() {
		waitForElementsVisible(driver, ShoppingPageUI.FLAT_RATE_VALUE);
		String[] flatRate = getElementText(driver, ShoppingPageUI.FLAT_RATE_VALUE).split("$");
		return Float.parseFloat(flatRate[1]);
	}

	public boolean isFlatRateLableDisplayed() {
		waitForElementsVisible(driver, ShoppingPageUI.FLAT_RATE_LABLE);
		return isElementDisplayed(driver, ShoppingPageUI.FLAT_RATE_LABLE);
	}

	public void selectFlatRateRadioButton() {
		waitForElementClickable(driver, ShoppingPageUI.FLAT_RATE_RADIO);
		checkToCheckbox(driver, ShoppingPageUI.FLAT_RATE_RADIO);

	}

}
