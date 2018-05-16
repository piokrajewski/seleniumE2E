package my.initial.project.selenium.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.When;

public class firstTests {
	WebDriver driver = new ChromeDriver();
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/");
		
		driver.get("https://www.google.pl");
		
	}

	@When("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin");
	 driver.get("https://www.google.pl");
	}
}
