package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    /**
     * This method polls every 20 millis for 2 mins to make sure webElement is visible
     * @param driver Provide same driver as the main driver
     * @param element Provide a webElement which you want to wait for
     * @return the webElement once it's visible
     */
    public static WebElement waitUntilVisible(WebDriver driver, WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOf(element));

        return webElement;
    }
}
