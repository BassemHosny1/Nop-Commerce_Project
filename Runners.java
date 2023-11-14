package Tests_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src\\main\\resources\\Features",
                glue = {"StepDefs"},
                plugin = {"pretty", "html:target/ProjectReport.html"},
                tags = "@smoke"
        )
public class Runners extends AbstractTestNGCucumberTests {
}
