package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Driver;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public class HomeServiceDoorInstallationSteps {

    private static WebDriver driver;


    @Given("User goes to the main Home Depot page")
    public void user_goes_to_the_main_Home_Depot_page() {
        driver = Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyReader.getValue("homedepoturl"));
    }

    @When("user scroll down click Home service")
    public void user_scroll_down_click_Home_service() {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        WebElement homeservice = driver.findElement(By.xpath("//div[@class='content']//img[@title='Home Services']"));
        js.executeScript("arguments[0].scrollIntoView(true);",homeservice);
        homeservice.click();
    }

    @When("under services click Door Hardware Installation")
    public void under_services_click_Door_Hardware_Installation() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement handymanServices = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='TILE TILE-2']//button[contains(text(),'10 Services')]")));
        handymanServices.click();
        Thread.sleep(1500);
        WebElement doorIns = driver.findElement(By.xpath("//a[@class='TILE TILE-3']/following-sibling::div//a[contains(text(),'Door Hardware')]"));
        doorIns.click();
    }

    @Then("validate user on Door Hardware Installation page")
    public void validate_user_on_Door_Hardware_Installation_page() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver,50);
        WebElement doorSerInst = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Door Hardware Installation ')]")));
        System.out.println(doorSerInst.getText());
        if (doorSerInst.getText().contains("Door Hardware Installation")){
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false,"User is not on \"Door Installaion\" page");
        }
    }
}
