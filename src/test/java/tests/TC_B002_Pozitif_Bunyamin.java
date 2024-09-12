package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.TeamPages.BunyaminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TC_B002_Pozitif_Bunyamin extends TestBaseRapor {

    @Test
    public void test02(){
         extentTest = extentReports.createTest(" Ziyaretçi olarak Listing sayfasindan bir ürüne tıklayıp Share butonunun üzerine gelindiğinde çıkan sosyal medya ikonlarının çalışıyor olması testi.    ");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Hause Heaven ana sayfasına gidildi.");

        BunyaminPage bunyaminPage = new BunyaminPage();
        HomePage homePage=new HomePage();

        homePage.listingButonu.click();
        ReusableMethods.wait(1);
        extentTest.pass("Listing basligina tiklandi.");

        ReusableMethods.hover(bunyaminPage.listingUrunIsim);
        ReusableMethods.wait(2);
        bunyaminPage.listingUrunIsim.click();
        extentTest.pass("Listing'de urune tiklandi.");
        homePage.sefUsercookies.click();
        Actions action = new Actions(Driver.getDriver());
        ReusableMethods.hover(bunyaminPage.urunShareButton);
        bunyaminPage.urunShareButton.click();
        // action.moveToElement(bunyaminPage.urunShareButton).perform();
        ReusableMethods.wait(3);

        ReusableMethods.waitForVisibility(bunyaminPage.shareFacebook,10);
        Assert.assertTrue(bunyaminPage.shareFacebook.isDisplayed());
        Assert.assertTrue(bunyaminPage.shareTwitter.isDisplayed());
        Assert.assertTrue(bunyaminPage.shareLinkedin.isDisplayed());
        extentTest.pass("Share butonları goruntulendi.");

        String expectedHref = "facebook.com";
        String actualHref = bunyaminPage.shareFacebook.getAttribute("href");
        Assert.assertTrue(actualHref.contains(expectedHref),"URL güncel");
        extentTest.pass("facebook url guncel.");

        String expectedHref1 = "x.com";
        String actualHref1 = bunyaminPage.shareTwitter.getAttribute("href");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedHref1.contains(actualHref1),"URL guncel degil");
        extentTest.fail("x url guncel degil.");

        String expectedHref2 = "linkedin.com";
        String actualHref2 = bunyaminPage.shareLinkedin.getAttribute("href");
        Assert.assertTrue(actualHref2.contains(expectedHref2),"URL güncel");
        extentTest.pass("linkedin url guncel.");

        Driver.quitDriver();
        extentTest.pass("Driver kapatildi.");


    }

}
