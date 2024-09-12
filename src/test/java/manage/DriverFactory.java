package manage;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
 static WebDriver driver;
 static DesiredCapabilities capabilities = new DesiredCapabilities();
 static Capabilities options;


 public static WebDriver getDriver( String browser, boolean isRemote) {

	 if (isRemote) {
		 getRemoteDriver(browser);
	 } else {
		 getLocalDriver(browser);
	 }
	 return driver;

 }

private static WebDriver getLocalDriver(String browser) {

	switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Browsers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);
			System.out.println("***** Local Chrome Driver *****");
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/Browsers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new FirefoxDriver(firefoxOptions);
			System.out.println("***** Local Firefox Driver *****");
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "src/test/resources/Browsers/msedgedriver.exe");
			EdgeOptions edgeOptions = new EdgeOptions();
			driver = new EdgeDriver(edgeOptions);
			System.out.println("***** Local Edge Driver *****");
			break;

		case "ie":
			System.setProperty("webdriver.ie.driver", "src/test/resources/Browsers/IEDriverServer.exe");
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			driver = new InternetExplorerDriver(ieOptions);
			System.out.println("***** Local IE Driver *****");
			break;

		default:
			throw new IllegalArgumentException("Browser bulunamadi");

	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


	return driver;
	}


	private static WebDriver getRemoteDriver(String browser){
	switch(browser.toLowerCase()) {
		case "chrome":
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setBrowserName("chrome");
			capabilities.setVersion("128.0.6613.120");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.merge(capabilities);
			options = chromeOptions;
			System.out.println("***** Grid Chrome Driver *****");
			break;
		case "firefox":
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setBrowserName("firefox");
			capabilities.setVersion("130.0");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.merge(capabilities);
			options = firefoxOptions;
			System.out.println("***** Grid Firefox Driver *****");
			break;
		case "edge":
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setBrowserName("edge");
			capabilities.setVersion("128.0.2739.63");
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.merge(capabilities);
			options = edgeOptions;
			System.out.println("***** Grid Edge Driver *****");
			break;
		case "ie":
			capabilities.setPlatform(Platform.WINDOWS);
			capabilities.setBrowserName("internet explorer");
			//capabilities.setVersion("128.0.2739.63");
			InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
			internetExplorerOptions.merge(capabilities);
			options = internetExplorerOptions;
			System.out.println("***** Grid IE Driver *****");
			break;

		default:
			throw new IllegalArgumentException("Browser bulunamadi");

	}


		try {
			driver = new RemoteWebDriver(new URL(ConfigReader.getProperty("gridURL")), options );
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


	return driver;
	}
}
