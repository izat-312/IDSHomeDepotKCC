package StepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @After
    public void after(Scenario currentScenario){
        driver = new ChromeDriver();
        if (currentScenario.isFailed()){
            TakesScreenshot screenshotTaker= (TakesScreenshot)driver;
            byte [] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
            currentScenario.embed(screenshot,"image/png");
        }
    }
}
