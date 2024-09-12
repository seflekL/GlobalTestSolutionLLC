package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_R004_PozitifBug_Rana extends TestBaseRapor {
    @Test
    public void Test01() throws InterruptedException {

        extentTest=extentReports.createTest
                ("Listing sayfasindaki arama formunda arama yapilmasi testi");

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayici acildi ve Hause Heaven sitesine gidildi.");

        HomePage homePage = new HomePage();
        homePage.HomePageListingLink.click();
        extentTest.pass("Headerdaki listing linkine tiklandi.");

        homePage.listingSayfasiSearchForALocationKutusu.sendKeys("New Jersey");
        extentTest.pass("Locationa New Jersey Yazilir");


        homePage.listingSayfasiCityDDM.click();
        ReusableMethods.bekle(1);
        extentTest.pass("City kutusuna click yapilir");

        homePage.listingSayfasiCitySearch.sendKeys("Borden Town");
        ReusableMethods.bekle(3);
        extentTest.pass("Listing sayfasina Borden Town ismi gonderilir ve click yapilir");

        String actualResult = homePage.listingSayfasiCitySearchResult.getText();
        String expectedResult = "Borden Town,";
        if (actualResult.equalsIgnoreCase(expectedResult)) {
            homePage.listingSayfasiCitySearchResult.click();

        }
        else {
            ReusableMethods.getFullScreenshot(Driver.getDriver());
            Assert.fail("Borden Town secilebilir olmali ancak listede yok");}

        Driver.getDriver().quit();
        extentTest.pass("Ziyaretci browseri kapatir.");
    }
}
