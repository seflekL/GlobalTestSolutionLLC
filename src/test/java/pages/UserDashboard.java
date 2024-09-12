package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserDashboard {
    public UserDashboard(){ PageFactory.initElements(Driver.getDriver(),this);}

    //---------------İsmail Kaya---------------\\

    //-------------İsmail Kaya Son--------------\\

    //---------------Levent Seflek---------------\\

    @FindBy (xpath = "//*[@class='listing-locate']")
    public List<WebElement> sefUsersearchedList;

    //---------------Levent Seflek Son------------\\

    //---------------Dilek---------------\\

    //---------------Dilek Son---------------\\

    //---------------Mustafa İsmail--------------\\

    @FindBy (xpath = "//div[@class=\"col-lg-4 col-md-6 col-sm-12\"]")
    public WebElement agentsPageAllAgentsList;

    @FindBy (xpath = "//div[@class=\"fr-grid-footer\"]")
    public WebElement agentsPropertiesTextsList;

    //---------------Mustafa İsmail Son---------------\\

    //---------------Rana Nur---------------\\

    //---------------Rana Nur Son---------------\\

    //---------------Bünyamin---------------\\

    //---------------Bünyamin Son---------------\\

    //---------------Fatma (FDM)---------------\\

    @FindBy (xpath = "//input[@id='email']")
    public WebElement kayitliKullaniciUsernameButonu;

    @FindBy (xpath = "(//input[@id='password']")
    public WebElement kayitliKullaniciPasswordButonu;

    @FindBy (xpath = "//*[@class='btn btn-md full-width btn-theme-light-2 rounded']")
    public WebElement KayitliKullaniciLoginButonu;

    @FindBy (xpath = "//a[@rel='nofollow'][normalize-space()='Logout']")
    public WebElement Logout;

    @FindBy (xpath = "//a[normalize-space()='Sign In']")
    public WebElement SignIn;

    //---------------Fatma (FDM) Son---------------\\

    //---------------Mehmet Muavviz---------------\\

    //---------------Mehmet Muavviz Son---------------\\

    //---------------Merve Nur---------------\\

    //---------------Merve Nur Son---------------\\

}
