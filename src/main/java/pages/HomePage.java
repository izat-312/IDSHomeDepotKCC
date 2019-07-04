package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private static WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);
    }

//  annotation hooks
    @FindBy(xpath = "//li[@class='TaskLinks__item']//a[contains(text(),'Gift Cards')]")
    private WebElement giftCard;

    @FindBy(id = "headerSearch")
    private WebElement searchBox;

    @FindBy(id = "headerSearchButton")
    private WebElement searchBtn;

    @FindBy(xpath = "//li[@class='TaskLinks__item']//a[contains(text(),'For the')]")
    private WebElement forThePro;

    @FindBy(xpath = "//span[contains(text(),'Shop All')]/..")
    private WebElement shopAllSavingsButton;

    @FindBy(id = "headerMyAccount")
    private WebElement myAccount;

    @FindBy(xpath = "//span[contains(text(),'Sign')]")
    private WebElement signIn;



    public void clickGiftCard(){
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.elementToBeClickable(giftCard)).click();
    }

    public void search(String searchValue){
        searchBox.clear();
        searchBox.sendKeys(searchValue);
        searchBtn.click();
    }

    public void forThePro(){
        forThePro.click();
    }

    public void clickShopAll(){
        shopAllSavingsButton.click();
    }

    public void myAccount(){
        myAccount.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
    }

}
//south labs test ng cucumber