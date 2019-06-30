import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Driver;
import utils.PropertyReader;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RobotTest {

    private static WebDriver driver;

    @BeforeClass
    public static void init() {
//        driver = Driver.getDriver("chrome");
        driver = Driver.getDriver(PropertyReader.getValue("browserType"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyReader.getValue("exerciseUrl"));
    }

    @Test
    public void testFileUpload() throws InterruptedException, AWTException {

        WebElement uploadBtn = driver.findElement(By.id("imagesrc"));
        uploadBtn.click();
//        robot.setAutoDelay(2000);

        String pathToFile = PropertyReader.getValue("/Users/izatillaaitmatov/Desktop/filenn.txt");
        StringSelection ss = new StringSelection(pathToFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

//        robot.setAutoDelay(2000);
        Thread.sleep(2000);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
