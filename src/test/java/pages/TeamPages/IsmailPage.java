package pages.TeamPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IsmailPage {

    public IsmailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".js-cookie-consent-agree.cookie-consent__agree")
    public WebElement allowCookies;

    @FindBy(xpath = "//*[normalize-space(text())='Sign In']")
    public WebElement signInButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement projeSayisiElementi;

    @FindBy(xpath = "//*[normalize-space(text())='Projects']")
    public WebElement homeProjectsButonu;

    @FindBy(xpath = "//*[@class='h3']")
    public WebElement urunIsmi;

    @FindBy(xpath = "//*[@class='prt-price-fix mt-3']")
    public WebElement urunFiyati;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "(//*[normalize-space(text())='Login'])[3]")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()='İsmail  Kaya']")
    public WebElement usernamePage;

    @FindBy(xpath = "//*[@title='credits']")
    public WebElement buyCredit;

    @FindBy(xpath = "(//*[text()='Purchase'])[2]")
    public WebElement besPostsCell;

    @FindBy(id = "stripe-number")
    public WebElement cardNumber;

    @FindBy(id = "stripe-exp")
    public WebElement ayYil;

    @FindBy(id = "stripe-name")
    public WebElement fullName;

    @FindBy(id = "stripe-cvc")
    public WebElement cvc;

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkoutButonu;

    @FindBy(id = "filter_country_id")
    public WebElement countryDropbox;

    @FindBy(className = "select2-search__field")
    public WebElement countrySearch;

    @FindBy(id = "select2-filter_state_id-container")
    public WebElement stateDropbox;

    @FindBy(xpath = "//*[@aria-live='assertive']")
    public WebElement elementBulunmuyor;

    @FindBy(id = "select2-filter_city_id-container")
    public WebElement cityDropbox;

    @FindBy(xpath = "//*[@id='ptypes']")
    public WebElement categoryDropbox;

    @FindBy(xpath = "//*[text()='Search']")
    public WebElement searchButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Real Estate']")
    public WebElement realEstateButonu;

    @FindBy(id = "cms-plugins-property")
    public WebElement propertiesButonu;

    @FindBy(id = "cms-plugins-project")
    public WebElement projectsButonu;

    @FindBy(id = "cms-plugins-re-feature")
    public WebElement featuresButonu;

    @FindBy(id = "cms-plugins-facility")
    public WebElement facilitiesButonu;

    @FindBy(id = "cms-plugins-investor")
    public WebElement investorsButonu;

    @FindBy(id = "cms-plugins-real-estate-category")
    public WebElement categoriesButonu;

    @FindBy(id = "cms-plugins-real-estate-type")
    public WebElement typesButonu;

    @FindBy(id = "cms-real-estate-review")
    public WebElement reviewsButonu;

    @FindBy(id = "cms-plugins-real-estate-settings")
    public WebElement settingsButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement sayfaDogrulama;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordAdminTextbox;

    @FindBy(className = "signin")
    public WebElement adminSignInButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Payments']")
    public WebElement paymentsButonu;

    @FindBy(xpath = "(//*[@class='nav-link'])[14]")
    public WebElement transactionsButonu;

    @FindBy(xpath = "//*[@name='botble-real-estate-tables-investor-table_length']")
    public WebElement kayitGoruntuleme;

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement createButonu;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement nameTextbox;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement codeTextbox;

    @FindBy(xpath = "//*[@name='slug']")
    public WebElement slugTextbox;

    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement orderTextbox;

    @FindBy(id = "description")
    public WebElement descriptionTextbox;

    @FindBy(xpath = "(//*[@value='save'])[1]")
    public WebElement saveExit;

    @FindBy(xpath = "(//*[text()='Delete'])[2]")
    public WebElement deleteButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement settingsSayfaDogrulama;

    @FindBy(id = "name-error")
    public WebElement nameHataMesaji;

    @FindBy(id = "slug-error")
    public WebElement slugHataMesaji;

    @FindBy(xpath = "//*[@class='h3']")
    public WebElement projeUrunIsmi;

    @FindBy(xpath = "//*[@class='prt-price-fix mt-3']")
    public WebElement projeUrunFiyati;

}
