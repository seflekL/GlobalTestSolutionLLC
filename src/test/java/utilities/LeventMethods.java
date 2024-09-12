package utilities;

import org.testng.Assert;
import pages.AdminDashboard;
import pages.HomePage;

import java.util.List;

public class LeventMethods {

    public static void  footerhomepageScroll () {

        HomePage homePage=new HomePage();

        //Ziyaretci hausehaen Url'ine giris saglar
        Driver.getDriver().get(ConfigReader.getProperty("hauseUrl"));

        //Ziyaretci ana sayfa yuklendikten sonra sayfa sonunda yer alan footer bolumune scroll yapar
        ReusableMethods.hover(homePage.SefFooterElementi);
        homePage.sefUsercookies.click();
        ReusableMethods.wait(2);


    }

    public  static void footerOgeKarsilastirma(){
    HomePage homePage=new HomePage();
        List<String> footerAltUstDizinList = ReusableMethods.getStringList(homePage.sefFooterGenelList);
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

    }
    public static void windowsHanldes( int sayi){

       // int winHandleTimes = sayi;
        Assert.assertEquals(Driver.getDriver().getWindowHandles().size(), sayi);
    }

    public static void admingirisDashboard (){

        AdminDashboard adminDashboard=new AdminDashboard();
        //Admin admin hauseheaven'url erisim saglar
        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan Email/Username box'ina  saglanan email yazar
        adminDashboard.usernameTextbox.click();
        adminDashboard.usernameTextbox.sendKeys("leventseflek.admin@hauseheaven.com");
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan Password box'ina onceden verilmis passoword'u  yazar
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.150820");
        //Adminhausehaven Login sayfasinda Login box kutusu icerseinde  yer alan  Login Butonuna
        adminDashboard.signInButonu.click();
        //Adminhausehaven admin sitesine basarili sekilde giris yapildigini kontrol eder
        String expectedUrl="https://qa.hauseheaven.com/admin";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }


    public static  void adminLogoutTesti (){
        AdminDashboard adminDashboard=new AdminDashboard();
        //Admin Headerlda yer alan "User Name " tiklar
        adminDashboard.sefadminHeaderUserNameButtonu.click();
        //Admin acilan dropdown menude "Log out " tiklar
        adminDashboard.sefadminHeaderLogoutButtonu.click();
        //Admin basari sekilde cikis yapildigini kontrol eder
        ReusableMethods.waitForVisibility(adminDashboard.sefadminLogoutConfirmMsgelementi,10);
        Assert.assertTrue(adminDashboard.sefadminLogoutConfirmMsgelementi.isDisplayed());
        //Admin taraciyi kapatir
        Driver.quitDriver();

    }

    public static void urlTest(String expectedurl){
       String  actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedurl);
    }



}
