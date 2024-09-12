package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_ME02_Negatif_Test_Merve extends TestBaseRapor {
    @Test
    public void test02(){
        HomePage homePage=new HomePage();
        extentTest=extentReports.createTest(" consults kısmında mesaj gönderilememesi testi");

        extentTest .pass ("Ziyaretçi HauseHeaven url girer.");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));



        extentTest .pass(" Ziyaretçi HauseHeaven anasayfaya eriştiğini görür. header da listing linkini tıklar. " );
        Assert.assertTrue(homePage.hauseheavenlogo.isDisplayed());
        homePage.listingButonu.click();


        extentTest.pass(" Ziyaretçi listing sayfasına ulaşır ");
        Assert.assertTrue(homePage.listingseciliilan.isDisplayed());


        extentTest.pass("Ziyaretçi mülk listesinden birini seçer ve tıklar.");
        homePage.listingseciliilan.click();


        extentTest.pass("Ziyaretçi mülk ayrıntılarını görür ve consults kısmına gelir . ");
        ReusableMethods.hover(homePage.listingsendmesajbutonu);
        Assert.assertTrue(homePage.listingconsultnamekutusu.isDisplayed());

        extentTest.pass("Ziyaretçi consults kısmında name kutusuna isim , email kutusuna email,phone kutusuna telefon numarsası ve message kısmına  da gondermek istedediği mesaja yazar . ");

        homePage.listingconsultnamekutusu.sendKeys("naci");
        homePage.listingphonebutonu.sendKeys("05554443322");
        homePage.listingmesajkutusu.sendKeys("ilaniniz hakkinda bilgi almak istiyorum");

        homePage.listingsendmesajbutonu.click();
        ReusableMethods.bekle(3);

       extentTest.pass("  Ziyaretçi Email is required penceresini görür ve mesajın gitmediğini doğrular");

        Assert.assertTrue(homePage.listingmesajuyaributonu.isDisplayed());
       extentTest.pass("  Ziyaretçi açtığı sekmeyi kapatır.");

       Driver.getDriver().quit();

    }
}
