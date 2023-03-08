package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"StepsDefinition", "runner"},
        plugin = {"json:target/jsonReports/cucumber-report.json"},
        features = "src/test/java/Features",
        monochrome = true)

public class RunTest {
}
