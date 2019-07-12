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

public class HomeDepotLoginSteps {

    WebDriver driver;
    LogInPage logInPage;


    @Given("Open chrome and start application")
    public void open_chrome_and_start_application() {
        driver= Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @When("i click my account button and sign in button")
    public void i_click_my_account_button_and_sign_in_button() {
        driver.get(PropertyReader.getValue("homedepoturl"));
        logInPage = new LogInPage(driver);
        logInPage.myAccount();
    }

    @Then("i enter username (.+) and password (.+) and click log in")
    public void i_enter_username_and_password_and_click_log_in(String string, String string2) {

        logInPage.loginInvalidAccountTest(string,string2);
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
