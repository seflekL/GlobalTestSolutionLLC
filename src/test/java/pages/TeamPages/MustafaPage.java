package pages.TeamPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MustafaPage {

    public MustafaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@title=\"credits\"]")
    public WebElement buyCreditsButonu;

    @FindBy (xpath = "(//*[@class=\"btn btn-primary mt-2\"])[1]")
    public WebElement singlePostPurchaseButonu;

    @FindBy (xpath = "(//*[@class=\"btn btn-primary mt-2\"])[2]")
    public WebElement fivePostPurchaseButonu;

    @FindBy (xpath = "//*[@placeholder=\"Card number\"]")
    public WebElement cardNumberTextBox;

    @FindBy (xpath = "//*[@placeholder=\"MM/YY\"]")
    public WebElement mmYYTextBox;

    @FindBy (xpath = "//*[@placeholder=\"Full name\"]")
    public WebElement fullNameTextBox;

    @FindBy (xpath = "//*[@placeholder=\"CVC\"]")
    public WebElement cvcTextBox;

    @FindBy (xpath = "//*[@for=\"payment_stripe\"]")
    public WebElement payOnlineviaStripeText;

    @FindBy (xpath = "//li[@class=\"list-group-item\"]")
    public WebElement frame;

    @FindBy (xpath = "//*[@class=\"payment-checkout-btn btn btn-info\"]")
    public WebElement buyCreditsCheckoutButonu;

    @FindBy (xpath = "//*[@class=\"badge badge-info\"]")
    public WebElement yourCreditsText;

    @FindBy (xpath = "//*[@href=\"https://qa.hauseheaven.com/account/security\"]")
    public WebElement securityButton;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement newPasswordTextBox;

    @FindBy (xpath = "//*[@id=\"password_confirmation\"]")
    public WebElement confirmationPasswordTextBox;

    @FindBy (xpath = "//*[@class=\"btn btn-theme-light-2\"]")
    public WebElement updatePasswordButton;

    @FindBy (xpath = "//*[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement passwordChangedAlert;

    @FindBy (xpath = "(//*[@class=\"form-control\"])[1]")
    public WebElement adminEmailTextBox;

    @FindBy (xpath = "(//*[@class=\"form-control\"])[2]")
    public WebElement adminPasswordTextBox;

    @FindBy (xpath = "//*[@class=\"signin\"]")
    public WebElement adminSigninButonu;

    @FindBy (xpath = "//*[@class=\"breadcrumb-item active\"]")
    public WebElement adminDashboardText;

    @FindBy (xpath = "(//*[@class=\"nav-link nav-toggle\"])[5]")
    public WebElement adRealEstateTitle;

    @FindBy (xpath = "//*[@href=\"https://qa.hauseheaven.com/admin/real-estate/property-features\"]")
    public WebElement adRealEstateFeatures;








}
