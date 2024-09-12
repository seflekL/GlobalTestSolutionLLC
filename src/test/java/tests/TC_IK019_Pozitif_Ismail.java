package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TeamPages.IsmailPage;
import utilities.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TC_IK019_Pozitif_Ismail extends TestBaseRapor {

    @Test
    public void test05() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        extentTest = extentReports.createTest("Kullanıcı olarak siteye giriş yapıp kendi sayfam üzerinden credi satın alma işlemini gerçekleştrip admin sayfasından kontrol etmek istiyorum");
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));
        extentTest.pass("Kullanıcı Hause Heaven sayfasına erişir");

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy" + "-" + "MM" + "-" + "dd");
        String formattedDate = localDateTime.format(timeFormatter);

        IsmailPage ismailPage = new IsmailPage();
        if (ismailPage.allowCookies.isDisplayed()){
            ismailPage.allowCookies.click();
            extentTest.pass("Ziyaretçi sitede bulunan cookies'i kabul eder");
        }
        ismailPage.signInButonu.click();
        extentTest.pass("Kullanıcı header bölümünde yer alan Sign In butonuna basar");

        IsmailMethods.hauseHeavenLogin(ismailPage,"ismailkaya@hauseheaven.com","Hven.150820");

        ismailPage.usernamePage.click();
        extentTest.pass("Kullanıcı kendi profil sayfasına erişir");
        ismailPage.buyCredit.click();
        extentTest.pass("Kullanıcı yan menüde bulunan Buy credits butonuna basar");

        WebElement paketFiyati = Driver.getDriver().findElement(By.xpath("(//*[@class='list-group-item'])[4]"));
        String paketFiyatiString = paketFiyati.getText();
        paketFiyatiString = paketFiyatiString.replaceAll("//D", "");
        paketFiyatiString = paketFiyatiString.replace("$", "");
        paketFiyatiString = paketFiyatiString.replace(",", "");
        paketFiyatiString = paketFiyatiString.substring(0, 4);

        ismailPage.besPostsCell.click();
        extentTest.pass("Kullanıcı listelenen paketlerden herhangi birini seçip altında bulunan PURCHASE butonuna basar");

        String name = "İsmail Kaya";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stripe-number")));

        ReusableMethods.erisimTesti("https://qa.hauseheaven.com/account/packages/3/subscribe");
        extentTest.pass("Kullanıcı Ödeme sayfasına eriştiğini doğrular");

        jse.executeScript("window.scrollTo(0, 100);");

        ismailPage.cardNumber.sendKeys("4242424242424242");
        extentTest.pass("Kullanıcı Card number textbox'a belirlenmiş kart numarasını girer");
        extentTest.info("4242 4242 4242 4242");
        ismailPage.ayYil.sendKeys("0229");
        extentTest.pass("Kullanıcı MM/YY textbox'a belirlenmiş tarih numarasını girer");
        extentTest.info("02/29");
        ismailPage.fullName.sendKeys(name);
        extentTest.pass("Kullanıcı Full name textbox'a sistemde kayıt olduğu ismi girer");
        extentTest.info(name);
        ismailPage.cvc.sendKeys("379");
        extentTest.pass("Kullanıcı CVC textbox'a belirlenmiş cvc numarasını girer");
        extentTest.info("379");
        ismailPage.checkoutButonu.click();
        extentTest.pass("Kullanıcı Checkout butonuna basarak işlemi onaylar");

        WebElement alertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert-container")));

        String expectedMessage = "Add credit successfully!";
        String actualMessage = alertMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
        extentTest.pass("Kullanıcı alert'te çıkan yazıyı doğrular");

        wait.until(ExpectedConditions.visibilityOf(ismailPage.logoutButonu));
        ismailPage.logoutButonu.click();
        extentTest.pass("Kullanıcı header bölümünde yer alan Logout butonuna basar");

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        ReusableMethods.erisimTesti(ConfigReader.getProperty("hauseAdminUrl"));
        extentTest.pass("Kullanıcı admin sayfasına erişir");

        IsmailMethods.hauseHeavenAdminLogin(ismailPage, "ismailkaya.admin@hauseheaven.com", "Hven.150820");

        ismailPage.paymentsButonu.click();
        extentTest.pass("Kullanıcı Payments butonuna basar");
        ismailPage.transactionsButonu.click();
        extentTest.pass("Kullanıcı açılan menüdeki Transactions Butonuna basar");

        // Kart bilgileri ile girdiğimiz ismi admin sayfasındaki isimle karşılaştırma
        List<WebElement> paymentIsimList = Driver.getDriver().findElements(By.xpath("//tbody/tr[1]/td[4]"));
        List<String> isimlerinStringList = ReusableMethods.getStringList(paymentIsimList);

        for (int i = 1; i < isimlerinStringList.size(); i++) {
            isimlerinStringList.get(i).equals(name);
        }

        // Paket almadan önceki zaman(2024-08-21) ile admin sayfasındaki alınan zamanın karşılaştırılması
        WebElement timePayment = Driver.getDriver().findElement(By.xpath("(//*[normalize-space(@class)='column-key-created_at'])[1]"));
        String paymentText = timePayment.getText();
        Assert.assertEquals(paymentText, formattedDate);

        // Aldığımız paketin fiyatı ile admin sayfasındaki fiyatın karşılaştırılması
        WebElement paymentFiyati = Driver.getDriver().findElement(By.xpath("(//*[normalize-space(@class)='text-start column-key-amount'])[1]"));
        String paymentStringFiyat = paymentFiyati.getText();
        paymentStringFiyat = paymentStringFiyat.replaceAll("//D", "");
        paymentStringFiyat = paymentStringFiyat.substring(0, 4);

        Assert.assertTrue(paketFiyatiString.contains(paymentStringFiyat));
        extentTest.pass("Kullanıcı satın aldı işlemi görür ve doğrular ");

        Driver.quitDriver();
        extentTest.pass("Kullanıcı browser'ı kapatır.");

    }
}
