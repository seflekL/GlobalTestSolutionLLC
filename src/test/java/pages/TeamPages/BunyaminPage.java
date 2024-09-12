package pages.TeamPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BunyaminPage {

    public BunyaminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "m-0")
    public WebElement listingUrunSayisi;

    @FindBy (xpath = "//*[@class='prt-link-detail'][1]")
    public WebElement listingUrunIsim;

    @FindBy (xpath = "//a[@class='btn btn-likes']")
    public WebElement urunShareButton;

    @FindBy (xpath = "//*[@id='app']/section/div[2]/div[1]/div[2]/div[1]/ul/li[2]")
    public WebElement urunSaveButton;

    @FindBy (xpath = "//*[@id='main-wrapper']/div[1]/div/div/div[2]/div[1]/a")
    public WebElement wishlistButton;

    @FindBy (xpath = "//*[@id='app']/div[2]/section/div/div/div/div[2]/div[1]/div/div[1]/h4/a")
    public WebElement wishlistUrunIsim;

    @FindBy (xpath = "//*[@id='clTen']/div/form/div[2]/div[1]/div/textarea")
    public WebElement urunYorumMesajKutusu;

    @FindBy (xpath = "//*[@id='clTen']/div/form/div[2]/div[2]/div")
    public WebElement yorumMesajKutusuSubmitButonu;

    @FindBy (className = "cl-facebook")
    public WebElement shareFacebook;

    @FindBy (className = "cl-twitter")
    public WebElement shareTwitter;

    @FindBy (className = "cl-linkedin")
    public WebElement shareLinkedin;

    @FindBy (xpath = "//*[@id='app']/section/div[2]/div[1]/div[2]/div[2]/div/div[2]")
    public WebElement urunSahibiMesajKutusu;

    @FindBy (xpath = "//*[@id='name']")
    public WebElement mesajKutusuName;

    @FindBy (xpath = "//*[@id='consult-form']/div/div[2]/input")
    public WebElement mesajKutusuPhone;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement mesajKutusuEmail;

    @FindBy (xpath = "//*[@id=\"consult-form\"]/div/div[5]/textarea")
    public WebElement mesajKutusuMessage;

    @FindBy (xpath = "//*[@id=\"consult-form\"]/div/div[6]/button")
    public WebElement mesajSendButonu;

    @FindBy (xpath = "//*[@class='alert alert-success alert-dismissible']")
    public WebElement mesajGonderildiAlert;

    @FindBy (className = "blog-body")
    public WebElement blogUrunBody;

    @FindBy (className = "blog-thumb")
    public WebElement blogUrunResim;

    @FindBy (xpath = "//*[@id=\"main-wrapper\"]/footer/div[1]/div/div/div[2]/div/div[1]/div/ul/li[2]/a")
    public WebElement footerContactUs;

    @FindBy (className = "contact-info")
    public WebElement contactGetInTouch;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]")
    public WebElement contactMesajSablon;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[1]/div[1]/div/input")
    public WebElement contactMesajName;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[1]/div[2]/div/input")
    public WebElement contactMesajEmail;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[2]/div[1]/div/input")
    public WebElement contactMesajSubject;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[2]/div[2]/div/input")
    public WebElement contactMesajPhone;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[3]/textarea")
    public WebElement contactMesajMessage;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[1]/form/div[5]/button")
    public WebElement contactSendMessage;

    @FindBy (xpath = "//*[@class='place-name']")
    public WebElement contactHaritaUzeriAdres;

    @FindBy (xpath = "//*[@id=\"contact\"]/div[2]/div/div[1]/div[2]")
    public WebElement contactReachUsAdres;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-tables-property-table_info\"]/span/span[2]")
    public WebElement propertiesSayisi;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-tables-property-table_wrapper\"]/div[2]/button[1]/span/span")
    public WebElement propertiesCreate;

    @FindBy (xpath = "//*[@id=\"name\"]")
    public WebElement propertiesCreateTitle;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[1]/div[1]/div/div[5]/div[3]/div[2]/div")
    public WebElement propertiesCreateContent;

    @FindBy (xpath = "//*[@id=\"location\"]")
    public WebElement propertiesCreatePropertyLocation;

    @FindBy (xpath = "//*[@id=\"type_id\"]")
    public WebElement propertiesCreateType;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement propertiesCreateSaveExit;

    @FindBy (xpath = "//*[@id=\"type_id\"]/option[2]")
    public WebElement propertiesCreateTypeForSale;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-tables-property-table\"]/tbody/tr[1]/td[8]/div/a[1]/i")
    public WebElement propertiesEditButon;

    @FindBy (xpath = "//*[@id=\"botble-real-estate-tables-property-table\"]/tbody/tr[1]/td[8]/div/a[2]/i")
    public WebElement propertiesDeleteButon;

    @FindBy (xpath = "(//*[@class=\"btn btn-icon btn-sm btn-primary\"])[1]")
    public WebElement sonEklenenPropertiesIlanEdit;

    @FindBy (xpath = "(//*[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"])[1]")
    public WebElement sonEklenenPropertiesIlanDelete;

    @FindBy (xpath = "(//*[@class=\"float-end btn btn-danger delete-crud-entry\"])[1]")
    public WebElement confirmDeleteDelete;










}
