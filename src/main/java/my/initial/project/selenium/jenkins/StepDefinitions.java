package my.initial.project.selenium.jenkins;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinitions {
	WebDriver driver = new ChromeDriver();
	
	@When("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin");
	 driver.get("https://www.google.pl");
	}

	@Then("^Page title should be displayed$")
	public void page_title_should_be_displayed() throws Throwable {
	    driver.getTitle();
	}

	@Then("^Browser should be shut down$")
	public void browser_should_be_shut_down() throws Throwable {
	   
	}
}
