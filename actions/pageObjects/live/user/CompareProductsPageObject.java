package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import pageUI.liveguru.user.AbstractPageUI;
import pageUI.liveguru.user.CompareProductsPageUI;
import pageUI.liveguru.user.HomePageUI;
import pageUI.liveguru.user.MobilePageUI;

public class CompareProductsPageObject extends AbstractPage {

	WebDriver driver;

	public CompareProductsPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public boolean isCompareProductsHeadingDisplayed() {
		waitForElementVisible(driver, CompareProductsPageUI.COMPARE_PRODUCT_HEADING);
		return isElementDisplayed(driver, CompareProductsPageUI.COMPARE_PRODUCT_HEADING);
	}

	public boolean isProductImageDisplayed(String productName, String productImage) {
		waitForElementVisible(driver, CompareProductsPageUI.PRODUCT_IMAGE, productName, productImage);
		return isElementDisplayed(driver, CompareProductsPageUI.PRODUCT_IMAGE, productName, productImage);
	}

	public boolean isProductPriceDisplayed(String productName, String productPrice) {
		waitForElementVisible(driver, CompareProductsPageUI.PRODUCT_PRICE, productName, productPrice);
		return isElementDisplayed(driver, CompareProductsPageUI.PRODUCT_PRICE, productName, productPrice);
	}

	public boolean isProductSKUDisplayed(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getSKUValueFromDynamicTextboxPosition(String columnName, String rowName) {
		// waitForElementVisible(driver, CompareProductsPageUI.DYNAMIC_COLUMN_POSITION,
		// columnName);
		int columnPosition = countElementNumber(driver, CompareProductsPageUI.DYNAMIC_COLUMN_POSITION, columnName) + 1;
		int rowPosition = countElementNumber(driver, CompareProductsPageUI.DYNAMIC_ROW_POSITION, columnName) + 1;
		return getElementText(driver, CompareProductsPageUI.DYNAMIC_ROW_AND_COLUMN_TEXT_INDEX,
				String.valueOf(rowPosition), String.valueOf(columnPosition));

	}

}
