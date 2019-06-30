package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfestionalContractorPage extends HomePage{

    public ProfestionalContractorPage(final WebDriver driver){

        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Government Buyers')]")
    private WebElement govermentBuyers;

    public void clickGovermentBuyersLink(){
        govermentBuyers.click();
    }
}
