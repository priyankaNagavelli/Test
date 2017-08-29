package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.KanoProductPage;
import pages.StorePage;
import util.WebConnector;

public class ShoppingBasket {
    public WebConnector wcon=WebConnector.getInstance();
    public HomePage home=null;
    public StorePage store=null;
    public KanoProductPage productPage=null;

    @Given("^am on Kano_site$")
    public void am_on_Kano_site() {
        wcon.openBrowser("mozilla");
        home=wcon.openUrl("https://kano.me/");
    }


    @Given("^I click on shop tab on menu$")
    public void i_click_on_shop_tab_on_menu(){
        store=home.goToShopPage();
    }

    @When("^I click on 'computer kit bundle'$")
    public void i_click_on_computer_kit_bundle()  {
         productPage=store.selectComputerBundle();
    }

    @When("^click on 'buy now'$")
    public void click_on_buy_now() {
          productPage.buy_Product();
    }

    @Then("^I should see 'computer kit bundle' in 'your kano order'$")
    public void i_should_see_computer_kit_bundle_in_your_kano_order()  {

    }

    /*@Given("^change country to US$")
    public void change_country_to_US()  {

    }
    */

}
