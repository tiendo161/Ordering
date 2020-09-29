package pageObjects.live.user;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUI.liveguru.user.MyWishlistPageUI;
import pageUI.liveguru.user.TVPageUI;

public class MyWishlistPageObject extends AbstractPage {

	WebDriver driver;

	public MyWishlistPageObject(WebDriver mapDriver) {
		driver = mapDriver;
	}

	public boolean isAddToWishListSuccessMessageDisplayed() {
		waitForElementVisible(driver, MyWishlistPageUI.ADD_TO_WISHLIST_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, MyWishlistPageUI.ADD_TO_WISHLIST_SUCCESS_MESSAGE);
	}
	
	public int getProductNameCount() {
		waitForElementsVisible(driver, MyWishlistPageUI.PRODUCT_NAME_LIST);
		return countElementNumber(driver, MyWishlistPageUI.PRODUCT_NAME_LIST);
	}

	public void clickToAddProductNameToCart(String productName) {
		waitForElementClickable(driver, MyWishlistPageUI.ADD_TO_CART_BUTTON_BY_PRODUCT_NAME, productName);
		clickToElement(driver, MyWishlistPageUI.ADD_TO_CART_BUTTON_BY_PRODUCT_NAME, productName);
		
	}



}
