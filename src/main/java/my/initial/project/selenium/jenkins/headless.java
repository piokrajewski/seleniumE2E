package my.initial.project.selenium.jenkins;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headless {

	
	  @Test  
	  public void createChromeDriverHeadless() throws IOException  
	  {  
	    ChromeOptions chromeOptions = new ChromeOptions();  
	    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");  
	    chromeOptions.addArguments("--headless");  
	    chromeOptions.addArguments("--disable-gpu");  
	    WebDriver driver = new ChromeDriver(chromeOptions);  
	    driver.navigate().to("https://www.facebook.com");   
	    String actual = driver.getTitle();
	    Assert.assertEquals("Google", actual);
	    driver.quit();  
	  }  
	   
}
