package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class b2_TC_F016_Pozitif_Fatma extends TestBaseRapor {

    @Test
    public void test16(){


        extentTest = extentReports.createTest("Kategoriler sayfasındaki kategorilerin yeniden düzenlenmesi testi ");
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.info("Admin Login sayfasina gider");

        AdminDashboard adminDashboard=new AdminDashboard();

        ReusableMethods.hover(adminDashboard.adminUsername);
        adminDashboard.adminUsername.sendKeys(ConfigReader.getProperty("gecerliAdminUsername"));

        ReusableMethods.hover(adminDashboard.adminPassword);
        adminDashboard.adminPassword.sendKeys(ConfigReader.getProperty("gecerliPassword"));


        ReusableMethods.hover(adminDashboard.adminSignin);
        adminDashboard.adminSignin.click();
        extentTest.info("Admin Login sayfasinda Username, Password girer ve Admin Dashboard sayfasina gider");


        //Admin Real Estate butonuna tiklar
        ReusableMethods.hover(adminDashboard.RealEstate);
        adminDashboard.RealEstate.click();
        ReusableMethods.bekle(2);
        extentTest.info("Admin Real Estate butonuna tiklar.");

        //Admin Categories butonuna tiklar
        ReusableMethods.hover(adminDashboard.Categories);
        adminDashboard.Categories.click();
        ReusableMethods.bekle(2);
        extentTest.info("Admin Categories butonuna tiklar.");

        //Admin Categories butonuna tiklar
        ReusableMethods.hover(adminDashboard.RealEstateEdit);
        adminDashboard.RealEstateEdit.click();
        ReusableMethods.bekle(2);
        extentTest.info("Admin duzenlemek istedigi kategorinin uzerinde Edit ikonunu tiklar.");

        ReusableMethods.hover(adminDashboard.RealEstateCreateName);
        adminDashboard.RealEstateCreateName.sendKeys("Townhouse X");
        extentTest.info("Gerekli duzenlemeyi yapar.");

        ReusableMethods.hover(adminDashboard.RealEstateSaveExit);
        adminDashboard.RealEstateSaveExit.click();
        ReusableMethods.bekle(2);
        extentTest.info("Degisikligi kaydeder ve cikar.");

        Assert.assertTrue(adminDashboard.RealEstateSuccess.isDisplayed());
        extentTest.pass("duzenlemenin basariyla gerceklestigini test eder.");

        Driver.quitDriver();
    }
}
