package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage extends HomePage {

    public GiftCardsPage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    private WebElement giftCardHeader;

    @FindBy(xpath = "//p[contains(text(),'Give the gift')]/..")
    private WebElement explanationText;

    public String giftCardHeaderGetText(){
        return giftCardHeader.getText();
    }

    public String getExplanationText(){
        return explanationText.getText();
    }
}
