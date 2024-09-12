package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_ME004_Pozitif_Merve extends TestBaseRapor {
    @Test
    public void test04(){
        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest("Email ve yanliş passwoord kullanılarak admin sayfasına giriş yapılamadığının doğrulanması testi ");

        extentTest.pass("Ziyaretçi hauseheaven.com/admin url girer ") ;
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));


        extentTest.pass(" Login formunda kendi email ve yanliş password unu girer ve sing in butonuna tıklar") ;
        homePage.adminloginemailkutusu.click();
        homePage.adminloginemailkutusu.sendKeys("mervenurembel.admin@hauseheaven.com");
        homePage.adminloginpasswordkutusu.click();
        homePage.adminloginpasswordkutusu.sendKeys("50820");
        homePage.adminloginsigninbutonu.click();

        extentTest.pass("Ziyaretçi these credentials do not match our records penceresini gorür ve admin sayfasına giriş yapamadığını doğrular ")  ;
        Assert.assertTrue(homePage.loginuyarımesajı.isDisplayed());
      extentTest.pass("Ziyaretçi açılan sekmeyi kapatır. ")  ;
      Driver.getDriver().quit();

    }
}
