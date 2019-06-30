package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends HomePage {

    public LogInPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email_id")
    private WebElement inputEmail;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "accountSignIn")
    private WebElement logInButton;

    @FindBy(xpath = "//span[@class='alert-inline__tilte']")
    private WebElement errorLogIn;

    public String loginInvalidAccountTest(String email,String pass){

        inputEmail.clear();
        inputEmail.sendKeys(email);
        inputPassword.clear();
        inputPassword.sendKeys(pass);
        logInButton.click();

        return errorLogIn.getText();

    }

}
