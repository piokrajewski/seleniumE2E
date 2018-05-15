package my.initial.project.selenium.jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class firstTests2 {
	WebDriver driver = new ChromeDriver();

	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bantam\\Downloads\\eclipse\\chromedriver.exe");		
		driver.get("https://crowdsurf-api.herokuapp.com/keystone/events");
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=2)
	public void login() {
		driver.findElement(By.name("email")).sendKeys("hypercrowd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("HyperCrowd135");
		driver.findElement(By.xpath("//button")).click();
	}
	@Test(priority=3)
	public void getPageTitle() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		String title = driver.getTitle();
		Assert.assertEquals(title, "Crowdsurf");
	}
	
}
