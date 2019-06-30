package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends HomePage{

    public SignInPage(final WebDriver driver){

        super(driver);
        PageFactory.initElements(driver,this);
    }
}
