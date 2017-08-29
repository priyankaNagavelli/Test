package util;

public class PageConstants {
    //Home Page
    public static final String WIN_COMPUTER_BUNDLE="//div[@class='EmailModal-content']";
    public static final String WIN_COMPUTER_BUNDLE_CLOSE="WIN_COMPUTER_BUNDLE";
    //Menu
    public static final String SHOP_TAB="//ul[@class='nav-menu-items style-scope kano-primary-links']/li[3]/a/span";
    //public static final String COMPUTER_BUNDLE="//a[@class='ProductListingItem-link KanoLink KanoLink--internal']/div/h3[@class='ProductListingItem-title']";
    public static final String COMPUTER_BUNDLE="//a[@class='ProductListingItem-link KanoLink KanoLink--internal']//*[contains(text(),'Computer Kit Bundle')]";

    //product page buy now button
    public static final String BUY_NOW="//button[@id='BundleDisplay-actionPrimary--kano-complete']";

    //computer kit in your order
    public static final String COMPUTER_KIT_YOUR_ORDER="//a[@class='CartPage-itemNameLink']";
    //computer kit quantity in your order
    public static final String COMPUTER_QUANTITY="//input[@class='CartPage-quantityValue CartPage-quantityValue--valid']";

    //path
    public static final String REPORTS_PATH="C:\\Users\\Jishnu\\IdeaProjects\\kano\\screenshot_reports";
}
