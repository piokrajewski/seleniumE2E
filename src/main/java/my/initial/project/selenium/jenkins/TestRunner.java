package my.initial.project.selenium.jenkins;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;





@CucumberOptions(
		features = {"feature/","classpath:my.initial.project.selenium.jenkins.StepDefinitions"},
		format = {"pretty","json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
