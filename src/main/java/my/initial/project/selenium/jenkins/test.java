package my.initial.project.selenium.jenkins;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.pl");
	}
}
