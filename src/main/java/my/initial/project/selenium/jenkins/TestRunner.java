package my.initial.project.selenium.jenkins;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/"},
		format = {"pretty","json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	@Test
	public void test() {
		throw new RuntimeException();
	}
	
}
