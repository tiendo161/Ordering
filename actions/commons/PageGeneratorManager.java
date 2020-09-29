package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.live.user.CheckoutPageObject;
import pageObjects.live.user.CompareProductsPageObject;
import pageObjects.live.user.HomeUserPageObject;
import pageObjects.live.user.LoginPageObject;
import pageObjects.live.user.MobilePageObject;
import pageObjects.live.user.MyAccountPageObject;
import pageObjects.live.user.MyWishlistPageObject;
import pageObjects.live.user.RegisterPageObject;
import pageObjects.live.user.ShoppingCartPageObject;
import pageObjects.live.user.TVPageObject;

public class PageGeneratorManager {

	public static HomeUserPageObject getHomeUserPage(WebDriver driver) {
		return new HomeUserPageObject(driver);
	}

	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);
	}

	public static MobilePageObject getMobilePage(WebDriver driver) {
		return new MobilePageObject(driver);
	}

	public static CompareProductsPageObject getCompareProductsPage(WebDriver driver) {
		return new CompareProductsPageObject(driver);
	}

	public static TVPageObject getTVPage(WebDriver driver) {
		return new TVPageObject(driver);
	}

	public static MyWishlistPageObject getMyWishlistPage(WebDriver driver) {
		return new MyWishlistPageObject(driver);
	}
	
	public static ShoppingCartPageObject getShoppingCartPage(WebDriver driver) {
		return new ShoppingCartPageObject(driver);
	}
	public static CheckoutPageObject getCheckoutPage(WebDriver driver) {
		return new CheckoutPageObject(driver);
	}

}
