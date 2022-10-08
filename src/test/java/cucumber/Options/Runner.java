package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hook"},
        plugin = "json:target/jsonReports/cucumreport.json"
        //tags = "@smoke"

)
public class Runner {

}
