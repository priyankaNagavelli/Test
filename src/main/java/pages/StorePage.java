package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class StorePage extends BasePage {
    @FindBy(xpath= PageConstants.COMPUTER_BUNDLE)
    WebElement computer_bundle;
    private MenuPage menu=null;
    public StorePage()
    {
        menu=new MenuPage();
    }

    public KanoProductPage selectComputerBundle()
    {
        Actions action=new Actions(wcon.driver);
        //action.moveToElement(computer_bundle).click().perform();
        action.click(computer_bundle).perform();
        return new KanoProductPage();
    }
}
