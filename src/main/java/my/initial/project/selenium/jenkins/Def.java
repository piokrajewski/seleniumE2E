package my.initial.project.selenium.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Def {

	WebDriver driver = new ChromeDriver();
	
	@When("^I open browser$")
	public void i_open_browser() throws Throwable {
	    driver.get("http://www.google.pl");
	}

	@Then("^Page title is displayed$")
	public void page_title_is_displayed() throws Throwable {
	    driver.getTitle();
	}
}
