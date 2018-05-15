package my.initial.project.selenium.jenkins;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/"}
		)
public class TestRunner {

	
}
