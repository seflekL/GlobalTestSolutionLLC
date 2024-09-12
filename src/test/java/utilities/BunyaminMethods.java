package utilities;

import org.testng.Assert;
import pages.AdminDashboard;

public class BunyaminMethods {

    public static void adminGiris (){

        AdminDashboard adminDashboard=new AdminDashboard();

        Driver.getDriver().get(ConfigReader.getProperty("hauseAdminUrl"));

        adminDashboard.usernameTextbox.sendKeys("bunyaminsait");
        adminDashboard.passwordAdminTextbox.sendKeys("Hven.150820");

        adminDashboard.signInButonu.click();

        String expectedUrl="https://qa.hauseheaven.com/admin";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }

}
