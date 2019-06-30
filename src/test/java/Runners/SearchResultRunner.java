package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/report.json"},
        features = "src/test/Resources/features",
        glue = "StepDefinitions",
        tags = "@search"

)
public class SearchResultRunner extends AbstractTestNGCucumberTests {

}
