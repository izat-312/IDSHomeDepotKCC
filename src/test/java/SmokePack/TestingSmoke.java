package SmokePack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GiftCardsPage;
import pages.LogInPage;
import pages.ProfestionalContractorPage;
import pages.SearchResultPage;
import utils.Driver;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

public class TestingSmoke {

    private static WebDriver driver;
    private static pages.HomePage homePage;
    private static ProfestionalContractorPage proPage;
    private static GiftCardsPage giftcard;
    private static SearchResultPage searchResultPage;
    private static LogInPage logInAccount;


    @BeforeClass
    public static void init() {

        driver = Driver.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new pages.HomePage(driver);
        proPage = new ProfestionalContractorPage(driver);
        giftcard = new GiftCardsPage(driver);
        searchResultPage = new SearchResultPage(driver);
        logInAccount = new LogInPage(driver);

    }

    @BeforeMethod
    public void beforeTestHook() {
        driver.get(PropertyReader.getValue("homedepoturl"));
    }

    @Test
    public void giftCards() {
        giftcard.clickGiftCard();
    }

    @Test
    public void searchFuncTest() {
        searchResultPage.search("grill brush");
        String expected = "\"grill brush\"";
        String actual = searchResultPage.getSearchResultHeaderText();
        Assert.assertEquals(expected,actual,"search result was invalid!");
    }

    @Test
    public void proBuyersTest() {
        proPage.forThePro();
        proPage.clickGovermentBuyersLink();
    }

    @Test
    public void giftcardsHeaderTest() {
        giftcard.clickGiftCard();
        String expected = "Home Depot Gift Cards";
        String actual = giftcard.giftCardHeaderGetText();
        Assert.assertEquals(expected, actual,"Gift Card Page Header is invalid!");
        System.out.println("Actual text: " + actual);
        giftcard.giftCardHeaderGetText();
    }

    @Test
    public void shopAllSavings() {
        homePage.clickShopAll();
    }

    @Test
    public void logInAccountTest() {
        logInAccount.myAccount();
        String errorLogIn;
        errorLogIn = logInAccount.loginInvalidAccountTest("kcc@gmail.com", "Bishekek312");
        Assert.assertEquals("Your email and password combination didn't match our records. Please try again."
                , errorLogIn,"logIn error is not true!");
    }

    @Test
    public void giftCardsText() {
        giftcard.clickGiftCard();
        Assert.assertEquals("Give the gift of doing with a Home Depot Gift Card" +
                ". Congratulate a friend on a new home purchase, say “thank you” for being an amazing employee or" +
                " “Happy Birthday” to the DIY’er in your life. Gift Cards also make excellent wedding or wedding shower" +
                " gifts and are the perfect solution for Father’s Day gifts and holiday gifts! Did you know that a" +
                " Home Depot Gift Card is a useful tool for managing home improvement projects? You can use it to" +
                " budget project expenses and easily track your purchases online. Our Gift Cards are all reloadable" +
                " in-store and online. Available in plastic or eGfit Card options. Redeem in-store or online. " +
                "No fees, no expiration.", giftcard.getExplanationText(),"Text is invalid!");
    }

}
