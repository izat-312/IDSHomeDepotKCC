package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.SearchResultPage;
import utils.Driver;
import utils.PropertyReader;

public class SearchResultSteps {

    WebDriver driver;
    SearchResultPage searchResultPage;

    @When("i input (.+) to the search text box and click Enter")
    public void i_input_to_the_search_text_box_and_click_Enter(String string) {
        driver = Driver.getDriver("chrome");
        driver.get(PropertyReader.getValue("homedepoturl"));
        searchResultPage = new SearchResultPage(driver);
        searchResultPage.search(string);

    }

    @Then("i should be able to see list of searched items")
    public void i_should_be_able_to_see_list_of_searched_items() {
        String expected = "\"Brush\"";
        String actual = searchResultPage.getSearchResultHeaderText();
        Assert.assertEquals(actual,expected,"invalid search result");
    }
}
