package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TC_L002_Grid_Levent {

    static WebDriver driver;

    @Parameters("browser")
    @Test
    public void Test01(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new RemoteWebDriver(new URL("http://192.168.1.20:4444"), new ChromeOptions());
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new RemoteWebDriver(new URL("http://192.168.1.20:4444"), new FirefoxOptions());
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new RemoteWebDriver(new URL("http://192.168.1.20:4444"), new EdgeOptions());
        }
                driver.manage().window().maximize();

      HomePage homePage = new HomePage();
         driver.get("https://qa.hauseheaven.com/");

        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@placeholder='Enter your email']"))).perform();

        driver.findElement(By.xpath("//*[@class='js-cookie-consent-agree cookie-consent__agree']")).click();

        driver.findElement(By.xpath("//*[text()='About us']")).click();

        int winHandleTimes = 1;
        Assert.assertEquals(driver.getWindowHandles().size(), winHandleTimes);

        actions.moveToElement(driver.findElement(By.xpath("//*[@placeholder='Enter your email']"))).perform();

        //Ziyaretci guideline da verilen footer ogelerinin "About Us"sayfasinin altinda yer aldigini  kontrol eder
        List<WebElement> aaList = driver.findElements(By.xpath("//*[@class='footer-widget']"));
        List <String> footerAltUstDizinList = new ArrayList<>();

        for (WebElement element : aaList) {
                footerAltUstDizinList.add(element.getText());  // Add the text of each element to the list
            }

                    System.out.println(footerAltUstDizinList);
            String expetedFooterElements = "[4655 Wild Indigo St Houston Tx 77027-7080 Usa\n" +
                    "+1 246-345-0695\n" +
                    "info@hauseheaven.com, About\n" +
                    "About us\n" +
                    "Contact us\n" +
                    "Terms & Conditions, More Information\n" +
                    "All properties\n" +
                    "Houses for sale\n" +
                    "Houses for rent, News\n" +
                    "The Benefits Of Investing In Emerging Real Estate Markets\n" +
                    "A Guide To Negotiating The Best Deal On Your Dream Home\n" +
                    "The Rise Of Sustainable Homes: Building For A Greener Future\n" +
                    "How to Stage Your Home for a Quick and Profitable Sale\n" +
                    "Investing in Vacation Rental Properties: A Lucrative Opportunity, Download Apps\n" +
                    "Google Play\n" +
                    "Get It Now\n" +
                    "App Store\n" +
                    "Now it Available]";
             for (String eachelements : footerAltUstDizinList) {
                Assert.assertTrue(expetedFooterElements.contains(eachelements));
            }
        //Ziyaretci halen  "About Us" sayfasinda oldgunu dogrular

        String expectedUrl="https://qa.hauseheaven.com/about-us";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
       driver.quit();
    }







    }


