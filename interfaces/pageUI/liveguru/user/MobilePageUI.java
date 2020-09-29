package pageUI.liveguru.user;

public class MobilePageUI {
	public static final String PRODUCT_COST_IN_LIST_PAGE = "//a[text()='%s']/parent::h2/following-sibling::div//span[@class='price']";
	public static final String PRODUCT_COST_IN_DETAIL_PAGE = "//div[@class='price-box']//span[@class='price']";
	//public static final String	ADD_TO_CART_BUTTON = "//a[text()='%s']/parent::h2/following-sibling::div[@class='actions']/button[@title='Add to Cart']";
	public static final String	DISCOUNT_LABEL = "//td[contains(text(),'Discount (GURU50)')]";
	public static final String	DISCOUNT_VALUE = "//td[contains(text(),'Discount (GURU50)')]/following-sibling::td/span";
	public static final String	GRANDTOTAL_LABEL = "//strong[contains(text(),'Grand Total')]";
	public static final String	EMPTY_SHOPPING_CART_TEXT = "//h1[contains(text(),'Shopping Cart is Empty')]";
	public static final String	NO_ITEM_IN_SHOPPING_CART_TEXT = "//div[@class='cart-empty']//p[contains(text(),'You have no items in your shopping cart.')]";
	public static final String	QTY_TEXT_FIELD = "//input[@title='Qty']";
	public static final String	MAX_QTY_ALLOW_ERROR_MESSAGE = "//p[@class='item-msg error' and contains(text(),'The maximum quantity allowed for purchase is 500')]";
	

}
