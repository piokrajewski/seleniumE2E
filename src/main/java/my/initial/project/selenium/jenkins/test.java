package my.initial.project.selenium.jenkins;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class test {
	@Test
	public void test() {
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no--sandbox");
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.google.pl");
		String actual = driver.getTitle();
		Assert.assertEquals("Google", actual);
	}
}
