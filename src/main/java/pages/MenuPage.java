package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class MenuPage extends BasePage{

    @FindBy(xpath= PageConstants.SHOP_TAB)
    WebElement shop_tab;
    @FindBy(xpath= PageConstants.COMPUTER_BUNDLE)
    WebElement computer_bundle;

    public StorePage goToShop()
    {

    return new StorePage();
    }

    public WorldPage goToWorldPage()
    {
        return new WorldPage();
    }

}
