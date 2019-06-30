package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver driver;
    private Driver (){}

    public static WebDriver getMyCurrentDriver(String browser){
        if(driver == null) getDriver(browser);
        return driver;
    }
    public static WebDriver getDriver( String browserType ){
        System.setProperty("webdriver.chrome.driver", PropertyReader.getValue("chromeDriverPath"));
        System.setProperty("webdriver.gecko.driver", "/Users/izatillaaitmatov/Documents/workspace/geckodriver");

        if(browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        }
        else if(browserType.equalsIgnoreCase("firefox") || browserType.equalsIgnoreCase("ff")){
            return  new FirefoxDriver();
        }
        else {
            System.out.println("User input for browser type is invalid: ("+browserType+")");
            System.out.println("Please enter chrome or firefox");
            return null;
        }
    }

}
