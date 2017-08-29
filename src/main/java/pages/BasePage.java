package pages;

import org.openqa.selenium.support.PageFactory;
import util.WebConnector;

public class BasePage
{
public WebConnector wcon=WebConnector.getInstance();

public BasePage()
    {
        PageFactory.initElements(wcon.driver, this);
    }

}
