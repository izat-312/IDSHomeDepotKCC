package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends HomePage{

    public SearchResultPage(final WebDriver driver){

        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1/span[@class]")
    private WebElement searchResultHeader;

    public String getSearchResultHeaderText(){
        return searchResultHeader.getText();
    }

}
