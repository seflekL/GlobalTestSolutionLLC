package utilities;

import pages.HomePage;
import pages.TeamPages.MustafaPage;

public class MustafaMethods extends TestBaseRapor{

    public static void hauseHeavenLogin(String username, String password){
        HomePage homePage = new HomePage();
        homePage.signinButonu.click();
        extentTest.pass("Sign in butonuna tıklandı.");

        homePage.emailTextbox.sendKeys(username);
        extentTest.pass("Mail text box'a mail girildi.");
        extentTest.info(username);

        homePage.passwordTextbox.sendKeys(password);
        extentTest.pass("Password text box'a password girildi.");
        extentTest.info(password);

        homePage.loginButonu.click();
        extentTest.pass("Login butonu tıklandı.");

    }

    public static void adminPageLogin(String adminUsername, String adminPassword){

        MustafaPage mustafaPage = new MustafaPage();

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Hause Heaven admin sayfasına gidildi.");

        mustafaPage.adminEmailTextBox.sendKeys(adminUsername);
        mustafaPage.adminPasswordTextBox.sendKeys(adminPassword);
        extentTest.pass("Email ve password bilgileri girildi.");

        mustafaPage.adminSigninButonu.click();
        extentTest.pass("Sign in butonu tıklandı.");


    }

}
