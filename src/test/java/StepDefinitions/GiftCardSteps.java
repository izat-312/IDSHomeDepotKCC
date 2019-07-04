package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.GiftCardsPage;
import utils.Driver;
import utils.PropertyReader;

public class GiftCardSteps {

    WebDriver driver;
    GiftCardsPage giftCardsPage;

    @When("click gift card button")
    public void click_gift_card_button() {
        driver=Driver.getDriver("chrome");
        giftCardsPage = new GiftCardsPage(driver);
        driver.get(PropertyReader.getValue("homedepoturl"));
        giftCardsPage.clickGiftCard();
    }

    @Then("gift card page should be open")
    public void gift_card_page_should_be_open() {
        String header = giftCardsPage.giftCardHeaderGetText();
        if (header.equals("Home Depot Gift Cards")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false,"gift card page not opened");
        }
    }
}
