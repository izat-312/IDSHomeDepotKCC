package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class AllDepartmentSteps {

    private static WebDriver driver;
    private static Actions action;


    @Given("Home Depot web app is up")
    public void home_Depot_web_app_is_up() {
        driver = Driver.getMyCurrentDriver("chrome");
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get("https://www.homedepot.com/");
    }

    @When("user hover overs All Departments menu")
    public void user_hover_overs_All_Departments_menu() throws InterruptedException {
        WebElement alldep = driver.findElement(By.xpath("//a[text()='All Departments']"));
        action.moveToElement(alldep).build().perform();
    }

    @Then("user sees (.+) in the drop down list")
    public void user_sees_Appliances_in_the_drop_down_list(String string) throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath(returnStr(string)));
        System.out.println(element.getText());

        Thread.sleep(2000);
//        driver.quit();
    }

    private static String returnStr(String string) {

        String str = "//a[text()='"+string+"']";
        System.out.println(str);

       return str;
    }
}
//277756