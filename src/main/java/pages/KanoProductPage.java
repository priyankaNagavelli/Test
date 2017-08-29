package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class KanoProductPage extends BasePage {
    private MenuPage menu=null;
    public KanoProductPage()
    {
        menu=new MenuPage();
    }

    @FindBy(xpath = PageConstants.BUY_NOW)
    WebElement buy_Now;

    public Your_Kano_Order buy_Product()
    {
        Actions action=new Actions(wcon.driver);
        action.moveToElement(buy_Now).click().perform();
        return new Your_Kano_Order();
    }

}
