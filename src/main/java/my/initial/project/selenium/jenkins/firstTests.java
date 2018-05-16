package my.initial.project.selenium.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTests {
	WebDriver driver = new ChromeDriver();
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/");
		
		driver.get("https://www.google.pl");
		
	}
	
	public void verifyTitle() {
		driver.getTitle();
	}
}
