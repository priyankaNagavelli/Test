package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.PageConstants;

public class Your_Kano_Order extends BasePage{
    private MenuPage menu;
    public Your_Kano_Order()
    {
        menu=new MenuPage();
    }
    @FindBy(xpath=PageConstants.COMPUTER_KIT_YOUR_ORDER)
    WebElement your_order;

    @FindBy(xpath=PageConstants.COMPUTER_QUANTITY)
    WebElement quantity;
}
