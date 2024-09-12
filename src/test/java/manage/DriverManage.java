package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManage {

	static WebDriver driver;
	DesiredCapabilities capabilities = new DesiredCapabilities();

	public WebDriver setUpChromeDriver() {

		capabilities.setPlatform(Platform.WIN11);
		capabilities.setBrowserName("chrome");
		capabilities.setVersion("128.0.6613.120");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(capabilities);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.152:4444"), chromeOptions);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		return driver;
	}

	public WebDriver firefoxSetUpDriver(){

		capabilities.setPlatform(Platform.ANY);
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("130.0");

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.merge(capabilities);

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.0.152:4444"), firefoxOptions);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		return driver;
	}




	}
