package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static utilities.Driver.driver;

public class TC_M025_Negatif_Mehmet extends TestBaseRapor {

    @Test
    public void Test25 (){

        extentTest = extentReports.createTest("Admin giriş sayfasında " +
                "geçersiz kimlik veya geçersiz şifre bilgileri ile giriş yapılamadığı testi");

        //Ziyaretçi browser’ı açar, HauseHeaven Admin giriş URL’ini girer ve enter’a basar

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.info("Hause Heaven Admin giriş sayfasına gidildi.");


        //HauseHeaven Admin giriş sayfasında olduğunu doğrular.
        String expectedUrl="https://qa.hauseheaven.com/admin/login";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Hause Heaven Admin giriş sayfasında olduğu test edildi.");

        //Admin Login sayfasında geçersiz kimlik ve geçerli şifre bilgilerini girer ve Log in linkine tıklar
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.usernameTextbox.sendKeys("mehmetyilmaz@hauseheaven.com");
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.150820");
        adminDashboard.signInButonu.click();
        extentTest.info("Admin Login sayfasında geçersiz kimlik ve geçerli şifre bilgileri girildi ve Log in linkine tıklandı.");

        //Açılan sayfanın Admin Login sayfasında olduğunu test eder.
        Assert.assertTrue(adminDashboard.signInButonu.isDisplayed());
        extentTest.pass("Tekrar Admin Login sayfasının açıldığı test edildi.");

        //Admin Login sayfasında geçersiz kimlik ve geçersiz şifre bilgilerini girer ve Log in linkine tıklar
        adminDashboard.usernameTextbox.clear();
        adminDashboard.usernameTextbox.sendKeys("mehmetyilmaz@hauseheaven.com");
        adminDashboard.passwordAdminTextbox.clear();
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.1508200");
        adminDashboard.signInButonu.click();
        extentTest.info("Admin Login sayfasında geçersiz kimlik ve geçersiz şifre bilgileri girildi ve Log in linkine tıklandı.");

        //Açılan sayfanın Admin Login sayfasında olduğunu test eder.
        Assert.assertTrue(adminDashboard.signInButonu.isDisplayed());
        extentTest.pass("Tekrar Admin Login sayfasının açıldığı test edildi.");

        //Admin Login sayfasında geçerli kimlik ve geçersiz şifre bilgilerini girer ve Log in linkine tıklar
        adminDashboard.usernameTextbox.clear();
        adminDashboard.usernameTextbox.sendKeys("mehmetyilmaz.admin@hauseheaven.com");
        adminDashboard.passwordAdminTextbox.clear();
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.1508200");
        adminDashboard.signInButonu.click();
        extentTest.info("Admin Login sayfasında geçerli kimlik ve geçersiz şifre bilgileri girildi ve Log in linkine tıklandı.");

        //Açılan sayfanın Admin Login sayfasında olduğunu test eder.
        Assert.assertTrue(adminDashboard.signInButonu.isDisplayed());
        extentTest.pass("Tekrar Admin Login sayfasının açıldığı test edildi.");


        //Sayfayı kapatır
        Driver.quitDriver();
        extentTest.info("Sayfa kapatıldı.");

}
}
