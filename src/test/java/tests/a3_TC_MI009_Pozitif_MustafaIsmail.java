package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TeamPages.MustafaPage;
import utilities.*;

import java.time.Duration;

import static utilities.Driver.driver;

public class a3_TC_MI009_Pozitif_MustafaIsmail extends TestBaseRapor {

    @Test
    public void test09(){

        extentTest = extentReports.createTest("Şifre değiştirme testi");

        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Tarayıcı açıldı ve hause heaven web sitesine gidildi.");

        MustafaMethods.hauseHeavenLogin(ConfigReader.getProperty("MIusername"),ConfigReader.getProperty("MIpassword"));

        HomePage homePage =new HomePage();
        ReusableMethods.waitForVisibility(homePage.sefUsercookies,5);
        homePage.sefUsercookies.click();
        MustafaPage mustafaPage = new MustafaPage();
        Faker faker = new Faker();

        homePage.accountDashboardButonu.click();
        extentTest.pass("Account dashboard butonu tıklandı.");

        Assert.assertTrue(mustafaPage.securityButton.isDisplayed());
        extentTest.pass("Security butonu görüntülendi.");


        ReusableMethods.hover(mustafaPage.securityButton);
        ReusableMethods.wait(1);
        mustafaPage.securityButton.click();
        extentTest.pass("Security butonu tıklandı.");

        String newPassword = faker.internet().password();
        extentTest.info("Yeni bir şifre oluşturuldu. :"+newPassword);

        Assert.assertTrue(mustafaPage.newPasswordTextBox.isDisplayed());
        extentTest.pass("New password text box görüntülendi");

        mustafaPage.newPasswordTextBox.sendKeys(newPassword);
        extentTest.pass("New password text box'a yeni şifre girildi.");

        Assert.assertTrue(mustafaPage.confirmationPasswordTextBox.isDisplayed());
        extentTest.pass("Confirmation Password text box görüntülendi.");

        mustafaPage.confirmationPasswordTextBox.sendKeys(newPassword);
        extentTest.pass("Confirmation text box'a aynı şifre girildi.");

        Assert.assertTrue(mustafaPage.updatePasswordButton.isDisplayed());
        extentTest.pass("Update password butonu görüntülendi.");

        mustafaPage.updatePasswordButton.click();
        extentTest.pass("Update password butonuna tıklandı.");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(mustafaPage.passwordChangedAlert));

        String exceptedAlert = "Password successfully changed";
        String actualAlert = mustafaPage.passwordChangedAlert.getText();

        Assert.assertEquals(actualAlert,exceptedAlert);
        extentTest.pass("Şifre değişikliği çıkan alert üzerinden doğrulandı.");

        mustafaPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("MIpassword"));
        mustafaPage.confirmationPasswordTextBox.sendKeys(ConfigReader.getProperty("MIpassword"));
        extentTest.pass("New password text box ve confirmation text box'a eski şifre girildi.");
        mustafaPage.updatePasswordButton.click();
        extentTest.pass("Update password butonuna tıklandı ve şifre eski haline getirildi.");

        Driver.getDriver().quit();
        extentTest.pass("Tarayıcı kapatıldı");

    }

}
