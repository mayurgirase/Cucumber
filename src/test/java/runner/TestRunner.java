package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
format = {"pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" },
glue = {"stepsDefination"},
features={ "C:\\Users\\new201809\\CucumberBDDframework\\src\\test\\java\\features\\login.feature"},
dryRun=false ,
strict=true			)
public class TestRunner {

}
