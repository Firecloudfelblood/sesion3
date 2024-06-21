package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:Reports/cucumber.json",
                "html:docs/Cucumber.html",
                "rerun:target/rerun.txt",
                "junit:Reports/Cucumber-results.xml",
                "pretty"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
