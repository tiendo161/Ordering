package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.HomePageUI;
import pageUI.liveguru.user.MobilePageUI;

public class MobilePageObject extends AbstractPage {

	WebDriver driver;

	public MobilePageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public String getProductCostInListPage(String productName) {

		waitForElementVisible(driver, MobilePageUI.PRODUCT_COST_IN_LIST_PAGE, productName);
		return getElementText(driver, MobilePageUI.PRODUCT_COST_IN_LIST_PAGE, productName);
	}

	public String getSonyXperiaCostInDetailPage() {
		waitForElementVisible(driver, MobilePageUI.PRODUCT_COST_IN_DETAIL_PAGE);
		return getElementText(driver, MobilePageUI.PRODUCT_COST_IN_DETAIL_PAGE);
	}

	public boolean isDiscountLableDisplayed() {
		waitForElementVisible(driver, MobilePageUI.DISCOUNT_LABEL);
		return isElementDisplayed(driver, MobilePageUI.DISCOUNT_LABEL);
	}

	public Float getDiscountValue() {
		waitForElementVisible(driver, MobilePageUI.DISCOUNT_VALUE);
		String [] discountText = getElementText(driver, MobilePageUI.DISCOUNT_VALUE).split("$");
		return Float.parseFloat(discountText[1]);
	}

	public boolean isGrandTotalleDisplayed() {
		waitForElementVisible(driver, MobilePageUI.GRANDTOTAL_LABEL);
		return isElementDisplayed(driver, MobilePageUI.GRANDTOTAL_LABEL);
	}

	

	public void inputToQTYField(String inputValue) {

		waitForElementVisible(driver, MobilePageUI.QTY_TEXT_FIELD);
		sendkeyToElement(driver, MobilePageUI.QTY_TEXT_FIELD, inputValue);

	}

	public boolean isErrorMessagesDisplayed() {
		waitForElementVisible(driver, MobilePageUI.MAX_QTY_ALLOW_ERROR_MESSAGE);
		return isElementDisplayed(driver, MobilePageUI.MAX_QTY_ALLOW_ERROR_MESSAGE);
	}

	public boolean isEmptyShoppingCartShow() {
		waitForElementVisible(driver, MobilePageUI.EMPTY_SHOPPING_CART_TEXT);
		return isElementDisplayed(driver, MobilePageUI.EMPTY_SHOPPING_CART_TEXT);

	}

	public boolean isNoItemInShoppingCartDisplayed() {
		waitForElementVisible(driver, MobilePageUI.NO_ITEM_IN_SHOPPING_CART_TEXT);
		return isElementDisplayed(driver, MobilePageUI.NO_ITEM_IN_SHOPPING_CART_TEXT);
	}

}
