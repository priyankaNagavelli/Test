package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class HomePage extends BasePage{
    private MenuPage menu;
    @FindBy(xpath= PageConstants.WIN_COMPUTER_BUNDLE)
    WebElement win_comp_bundle_popup;
    @FindBy(xpath= PageConstants.WIN_COMPUTER_BUNDLE_CLOSE)
    WebElement win_comp_bundle_popup_close;

    public HomePage()
    {
        menu=new MenuPage();
    }

    public StorePage goToShopPage()
    {
        Actions action=new Actions(wcon.driver);
        action.moveToElement(menu.shop_tab).click().perform();
        return new StorePage();
    }


}
