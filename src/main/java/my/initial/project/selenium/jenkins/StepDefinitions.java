package my.initial.project.selenium.jenkins;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinitions {
	WebDriver driver;
	
	@When("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox", "--disable-setuid-sandbox", "--headless", "--disable-gpu", "--remote-debugging-port=9222");
		WebDriver driver = new ChromeDriver(options); 
	    driver.get("https://www.google.pl");
	}
}
