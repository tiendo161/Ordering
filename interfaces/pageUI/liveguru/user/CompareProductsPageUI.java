package pageUI.liveguru.user;

public class CompareProductsPageUI {
	public static final String COMPARE_PRODUCT_HEADING ="//div[contains(@class, 'page-title')]/h1[text()='Compare Products']";
	public static final String PRODUCT_IMAGE ="//a[text()='%s']/ancestor::td//img[contains(@src, '%s')]";
	public static final String PRODUCT_PRICE ="//a[text()='%s']/ancestor::td//span[@class='price' and text()='%s']";
	public static final String PRODUCT_SKU ="";
	public static final String DYNAMIC_COLUMN_POSITION ="//a[text()='%s']/ancestor::td/preceding-sibling::td";
	public static final String DYNAMIC_ROW_POSITION ="//span[text()='%s']/ancestor::tr/preceding-sibling::tr";
	public static final String DYNAMIC_ROW_AND_COLUMN_TEXT_INDEX = "//tr[%s]/td[%s]/div";
	


}
