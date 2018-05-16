package my.initial.project.selenium.jenkins;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/","classpath:my.initial.project.selenium.jenkins.firstTests"},
		format = {"pretty","json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
