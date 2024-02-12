package cucumber.Options;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = "json:target/cucumber-report.json",features="src/test/java/features",glue="")
public class TestRunner extends AbstractTestNGCucumberTests {

}