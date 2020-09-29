package pageUI.liveguru.user;

public class MyWishlistPageUI {
	public static final String ADD_TO_WISHLIST_SUCCESS_MESSAGE = "//li[@class='success-msg']//span[contains(., 'LG LCD has been added to your wishlist. Click here to continue shopping.')]";
	public static final String ADD_TO_CART_BUTTON_BY_PRODUCT_NAME = "//a[text()='%s']/ancestor::td/following-sibling::td[contains(@class, 'cart')]//button[@title='Add to Cart']";
	public static final String PRODUCT_NAME_LIST = "//h3[@class='product-name']";


}
