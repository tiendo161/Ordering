package pageUI.liveguru.user;

public class AbstractPageUI {
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	public static final String DYNAMIC_LINK_IN_ACCOUNT_HEADER = "//div[@id='header-account']//a[contains(@title='%s')]";
	public static final String DYNAMIC_BUTTON = "//button[@title='%s']";
	public static final String DYNAMIC_LINK_TEXT = "//a[text()='%s']";
	public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
	public static final String DYNAMIC_SUCCESS_TEXT = "//li[@class='success-msg']//span[text()='%s']";
	public static final String ADD_TO_CART_BUTTON_IN_lIST_PAGE = "//a[text()='%s']/parent::h2/following-sibling::div[@class='actions']/button[@title='Add to Cart']";
	public static final String ADD_TO_COMPARE_OR_WISHLIST_BUTTON = "//a[text()='%s']/parent::h2/following-sibling::div[@class='actions']//a[text()='%s']";
	public static final String NO_ITEM_TEXT = "//div[@class='cart-empty']/p[text()='You have no items in your shopping cart.']";
	public static final String DYNAMIC_PRODUCT_NAME ="//a[text()='%s']";
	public static final String	DYNAMIC_PRODUCT_NAME_LINK = "//h2[@class='product-name']/a[text()='%s']";
	
	public static final String DYNAMIC_DEFAULT_DROPDOWN_LIST = "//select[@title='%s']";
	public static final String	GRANDTOTAL_VALUE = "//strong[contains(text(),'Grand Total')]/parent::td/following-sibling::td//span";
	
	
	

}
