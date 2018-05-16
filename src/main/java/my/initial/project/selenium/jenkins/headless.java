package my.initial.project.selenium.jenkins;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class headless {

    @Test
    public void runFirefoxHeadless() throws IOException {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
        try {
            driver.get("http://www.google.com");
            driver.manage().timeouts().implicitlyWait(4,
                    TimeUnit.SECONDS);
            String actual = driver.getTitle();
            Assert.assertEquals("Google", actual);
            driver.quit();
        } finally {
            driver.quit();
        }
    }

    @Test
    @Ignore
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
