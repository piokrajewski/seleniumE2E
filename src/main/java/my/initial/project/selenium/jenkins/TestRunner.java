package my.initial.project.selenium.jenkins;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/"},
		format = {"pretty","json:target/cucumber.json"},
		glue="classpath:my.initial.project.selenium.jenkins.StepDefinitions"
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
