package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LogInPage;
import utils.Driver;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public class HomeDepotSteps {

    WebDriver driver;
    LogInPage logInPage;

    @Given("Open chrome and start application")
    public void open_chrome_and_start_application() {
        driver= Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(PropertyReader.getValue("homedepoturl"));
    }

    @When("i click my account button than sign in button")
    public void i_click_my_account_button_than_sign_in_button() {
        logInPage = new LogInPage(driver);
        logInPage.myAccount();
    }

    @Then("i enter invalid username password and click log in")
    public void i_enter_invalid_username_password_and_click_log_in() {

        logInPage.loginInvalidAccountTest("manas@gmail.com","bishkek312");
    }

    @And("user should not be able to log in")
    public void user_should_not_be_able_to_log_in() {
        WebElement tryAgain = driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
        if (tryAgain.getText().contains("Please try again")){
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false,"It is logged in");
        }

    }
}
