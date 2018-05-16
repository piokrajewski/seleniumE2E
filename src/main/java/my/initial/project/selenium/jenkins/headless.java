package my.initial.project.selenium.jenkins;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;

public class headless {


    @Test
    public void createChromeDriverHeadless() throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        chromeOptions.setBinary("/usr/bin/google-chrome");
        chromeOptions.addArguments(
                "--headless",
                "--no-sandbox",
                "--disable-gpu",
                "--remote-debugging-port=9222"
        );
        chromeOptions.setHeadless(true);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.facebook.com");
        String actual = driver.getTitle();
        Assert.assertEquals("Google", actual);
        driver.quit();
    }

}
