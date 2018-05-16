package my.initial.project.selenium.jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BSTNG {

	WebDriver driver;
	@Test
	public void test() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setPlatform(Platform.WINDOWS);
		caps.setBrowserName("firefox");

		String stringUrl = "https://piotrkrajewski1:opzWrgpq7ZzQ1mRxhR6R@hub-cloud.browserstack.com/wd/hub";
		URL serverUrl = new URL(stringUrl);
		
		WebDriver driver = new RemoteWebDriver(serverUrl,caps);
		
	}
}
