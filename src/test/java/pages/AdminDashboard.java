package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDashboard {

    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //yeni
    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement adminUsername;
    @FindBy (xpath = "(//*[@class='form-control'])[2]")
    public WebElement adminPassword;
    @FindBy (xpath = "//*[@class='signin']")
    public WebElement adminSignin;
    @FindBy (xpath = "//*[@class='fa fa-bed']")
    public WebElement RealEstate;
    @FindBy (xpath = "//*[@id='cms-plugins-real-estate-category']")
    public WebElement Categories;
    //------------------------------------------------
    // [Hause Heaven Admin] - [Login fonksiyonu] Bölümünün elementleri

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordAdminTextbox;

    @FindBy(className = "signin")
    public WebElement signInButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement settingsSayfaDogrulama;

    //---------------İsmail Kaya---------------\\
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

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public  WebElement RealEstateDelete;

    @FindBy (xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public  WebElement RealEstateConfirmDelete;

    @FindBy (xpath = "//*[@id='stack-footer']")
    public  WebElement RealEstateSuccess;

    @FindBy (xpath = "//*[@class='fa fa-edit']")
    public WebElement blog;

    @FindBy (xpath = "//li[@id='cms-plugins-blog-post']")
    public WebElement posts;

    @FindBy (xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement create;

    @FindBy (xpath = "//input[@id='name']")
    public WebElement createNewpostName;

    @FindBy (xpath = "(//*[@class='mb-2'])[3]")
    public WebElement createHousedesign;

    @FindBy (xpath = "(//input[@type='checkbox']")
    public  WebElement createHouseArchitecture;

    @FindBy (xpath = "(//*[@class='btn btn-info'])[1]")
    public WebElement createSaveExit;

    @FindBy (xpath = "//*[@class='text-start column-key-name sorting']")
    public WebElement PostName;

    @FindBy (xpath = "(//*[@class='fa fa-edit'])[2]")
    public WebElement PostEdit;

    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement PostNameError;

    @FindBy (xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement elemTexts;

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement PostsDelete;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement ConfirmDelete;

    @FindBy (xpath = "//div[@id='stack-footer']")
    public WebElement Success;


    @FindBy (xpath = "//tr[@role='row']")
    public  List<WebElement> CategoriesList;


    @FindBy (xpath = "//*[@data-action='create']")
    public  WebElement RealEstateCreate;

    @FindBy (xpath = "//*[@id='name']")
    public  WebElement RealEstateCreateName;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public  WebElement RealEstateSaveExit;


    @FindBy (xpath = "(//*[@class='fa fa-edit'])[2]")
    public  WebElement RealEstateEdit;













    //-------------İsmail Kaya Son--------------\\

    //---------------Levent Seflek---------------\\

    @FindBy (xpath = "test01")
    public WebElement  seftestelementbuttonuElementi;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[3]")
    public WebElement sefadminsideDashBlogButtonElementi;

    @FindBy (xpath = "(//*[@class='sub-menu  hidden-ul '])[1]")
    public List<WebElement> sefadminsideDashBlogList;

    @FindBy (xpath = "//*[@class='username d-none d-sm-inline']")
    public WebElement sefadminHeaderUserNameButtonu;

    @FindBy (xpath = "//*[@class='btn-logout']")
    public WebElement sefadminHeaderLogoutButtonu;


    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement sefadminLogoutConfirmMsgelementi;

    @FindBy (id = "cms-plugins-blog-post")
    public WebElement sefSidenNavPostselementi;

    @FindBy (xpath = "//*[@class=' text-start column-key-name']")
    public List<WebElement> sefadminPostPageList;

    @FindBy (xpath = "//*[@class='page-sidebar-menu page-header-fixed '] ")
    public WebElement sefadminSidedDashElementi;

    @FindBy (id = "cms-plugins-blog-tags")
    public WebElement sefAdminTagButton;

    @FindBy (id= "cms-plugins-location")
    public WebElement sefadminLocationButtonElementi;

    @FindBy (id= "cms-plugins-country")
    public WebElement sefadminCountiresButtonElementi;

    @FindBy (xpath = "//*[@class=' text-start column-key-name']")
    public List<WebElement> sefadminCountiresUlkeList;

    @FindBy (xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement sefadminCountiresCreateButtonElementi;

    @FindBy (xpath = "//span[normalize-space()='Reload']")
    public WebElement sefadminCountiresReloadButtonElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement sefadminCountiresNameBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[2]")
    public WebElement sefadminCountiresNationalityElementi;

    @FindBy (xpath = "//*[@id=\"code\"]")
    public WebElement sefadminCountiresISOBoxElementi;

    @FindBy (xpath = "//*[@id='dial_code']" )
    public WebElement sefadminCountiresDialCodeBoxElementi;

    @FindBy (xpath = "//*[@id='order']")
    public WebElement sefadminCountiresOrderBoxElementi;

    @FindBy (xpath = "//*[@id='select2-status-container']")
    public WebElement sefadminCountiresStatusBoxElementi;

    @FindBy(xpath = "//select[@class='form-control select-full ui-select select2-hidden-accessible']")
    public WebElement sefadminCountiresPublishedselectElementi;

    @FindBy(xpath = "(//*[@class='btn btn-success'])[1]")
    public WebElement sefadminCountiresSaveElementi;

    @FindBy(xpath = "//*[@id=\"botble-location-forms-country-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement sefadminCountiresSaveExitElementi;

    @FindBy(xpath = "//*[@data-bs-original-title='Edit']")
    public WebElement sefadminCountiresEditButtonElementi;

    @FindBy (xpath = "//input[@placeholder='Search...']")
    public WebElement sefadminSearchboxElementi;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement sefadminCreateEditPageKayyitMSGElementi;

    @FindBy (xpath = "//tr[@class='even']//a[@role='button']")
    public WebElement sefadminDeleteButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div[2]/div/div/div[3]/button[2]")
    public WebElement sefadminDeleteConfirmMsg;











    //---------------Levent Seflek Son------------\\

    //---------------Dilek---------------\\
    @FindBy (xpath = "//*[@name='username']")
    public WebElement adminUSerNameKutusu;

    @FindBy (xpath = "//*[@name='password']")
    public WebElement adminPasswordKutusu;

    @FindBy (xpath = "//*[@class='signin']")
    public WebElement adminSigInButonu;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[5]")
    public WebElement adminRealEstateButonu;

    @FindBy (xpath = "(//*[@class='nav-link'])[5]")
    public WebElement adminProjectsLink;

    @FindBy (xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement projectsayfasiProjectYazisi;

    @FindBy (xpath = "//*[@class='fa fa-plus']")
    public WebElement projectCreateButonu;

    @FindBy (xpath = "//*[@id='name']")
    public WebElement projectFOrmuNameKutusu;

    @FindBy (xpath = "//*[@class='ck-placeholder']")
    public WebElement projectFormuContentKutusu;

    @FindBy (xpath = "//*[@id='location']")
    public WebElement projectFOrmulocationKutusu;

    @FindBy (xpath = "(//*[@class='btn btn-info'])[2]")
    public WebElement projectFormuSaveExitButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement projectFormUpdatesSuccessfullyYazisi;

    @FindBy (xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement projectFormuDeleteButonu;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement projectSayfasiConfirmDeleteButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement projectSayfasiProjesilindiktensonraSuccessfullyMesaji;

    @FindBy (xpath = "(//*[@class='nav-link'])[11]")
    public WebElement reviewLinki;

    @FindBy (xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement reviewSayfasiReviewYazisi;

    @FindBy (xpath = "//*[@title='Star']")
    public WebElement reviewSayfasiStarYazisi;

    @FindBy (xpath = "//*[@title='User']")
    public WebElement reviewSayfasiUserYazisi;

    @FindBy (xpath = "//*[@title='Comment']")
    public WebElement reviewSayfasiCommetnYazisi;

    @FindBy (xpath = "//*[@title='Created At']")
    public WebElement reviewSayfasiCreatedAtYazisi;

    @FindBy (xpath = "//*[@title='Operations']")
    public WebElement reviewSayfasiOperationsYazisi;

    @FindBy (xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement reviewSayfasiDeleteBUtonu;

    @FindBy(xpath = "//*[@title='Profile']")
    public WebElement daschboardLinki;
    @FindBy (xpath = "//*[@title='Product']")
    public WebElement reviewSayfasiProductButonu;

    @FindBy (xpath = "//*[@title='ID']")
    public WebElement reviewSayfasiIDButonu;
    @FindBy (xpath = "//*[@type='search']")
    public WebElement dilekSearchKutusu;

    @FindBy (xpath = "//*[@class='dataTables_empty']")
    public WebElement dilekNoreccordyazisi;
    @FindBy (xpath = "(//*[@class='d-none d-sm-inline'])[2]")
    public WebElement dilekShovFromYazisi;







    //---------------Dilek Son---------------\\

    //---------------Mustafa İsmail--------------\\

    @FindBy (xpath = "(//*[@class='dashboard-stat dashboard-stat-v2 text-white'])[1]")
    public WebElement adminDashboardBodyActivePropertiesLinki;

    @FindBy (xpath = "(//*[@class='dashboard-stat dashboard-stat-v2 text-white'])[2]")
    public WebElement adminDashboardBodyPendingPropertiesLinki;

    @FindBy (xpath = "(//*[@class='dashboard-stat dashboard-stat-v2 text-white'])[3]")
    public WebElement adminDashboardBodyExpiredPropertiesLinki;

    @FindBy (xpath = "(//*[@class='dashboard-stat dashboard-stat-v2 text-white'])[4]")
    public WebElement adminDashboardBodyAgentsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[1]")
    public WebElement adminSidebarDashboardLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[3]")
    public WebElement adminSidebarBlogLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[4]")
    public WebElement adminSidebarTestimonialsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[5]")
    public WebElement adminSidebarRealEstateLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[7]")
    public WebElement adminSidebarNewslettersLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[8]")
    public WebElement adminSidebarConsultsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[9]")
    public WebElement adminSidebarAccountsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[10]")
    public WebElement adminSidebarPackagesLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[13]")
    public WebElement adminSidebarContactLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[14]")
    public WebElement adminSidebarPaymentsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[15]")
    public WebElement adminSidebarLocationsLinki;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[16]")
    public WebElement adminSidebarMediaLinki;

    @FindBy (xpath = "//*[@class='col-md-6']")
    public WebElement adminDashboardCopyrightLinki;

    @FindBy (xpath = "//*[@class='col-md-6 text-end']")
    public WebElement adminDashboardPageLoadLinki;

    //---------------Mustafa İsmail Son---------------\\

    //---------------Rana Nur---------------\\

    @FindBy (xpath = "(//*[@class='title'])[7]")
    public WebElement adminNewsletter;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[1]")
    public WebElement adminSearch;

    @FindBy (xpath = "(//*[@class='d-none d-sm-inline'])[1]")
    public WebElement showFromYazisi;

    @FindBy (xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement adminDashboardNewsletterDeleteButonu;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement newsletterDeleteConfirmButonu;

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement deleteSuccesfullyMessage;

    @FindBy (xpath = "//*[@class='fa fa-download']")
    public WebElement exportButonu;

    @FindBy (xpath = "//*[@class='dt-button dropdown-item buttons-csv']")
    public WebElement CSVFormatIndirme;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[2]")
    public WebElement mesajlariSiralamaButonu;

    @FindBy (xpath = "//*[@class='far fa-envelope']")
    public WebElement adminContactLink;

    @FindBy (xpath = "//*[@class='breadcrumb-item active']")
    public WebElement adminContactYazisiDogrulama;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[1]")
    public WebElement adminContactSeacrhKutusu;

    @FindBy (xpath = "//*[@class='dataTables_empty']")
    public WebElement adminContactNoRecordYazisi;

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement adminContactSayfasiDeleteButonu;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement adminContactSayfasiConfirmDeleteButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement adminContactDeletedSuccessfullyYazisi;

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement adminContactEditButonu;

    @FindBy (xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement adminContactEditViewContactYazisi;

    @FindBy (xpath = "//*[@id='status']")
    public WebElement contactEditPageStatusDDM;

    @FindBy (xpath = "//*[@class='btn btn-info']")
    public WebElement contactSayfasiEditSaveExitButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement contactSayfasiUpdatedSuccessfullyYazisi;

    @FindBy (xpath = "//*[@class='fa fa-download']")
    public WebElement adminContactExport;

    @FindBy (xpath = "//*[@class='fas fa-file-csv']")
    public WebElement adminContactCSV;

    @FindBy (xpath = "//*[@name='botble-contact-tables-contact-table_length']")
    public WebElement contactSayfasiMesajSIralama10lu;


    //---------------Rana Nur Son---------------\\

    //---------------Bünyamin---------------\\

    //---------------Bünyamin Son---------------\\

    //---------------Fatma (FDM)---------------\\

    //---------------Fatma (FDM) Son---------------\\

    //---------------Mehmet Muavviz---------------\\

    @FindBy (xpath = "(//*[@class='d-none d-sm-inline'])[1]")
    public WebElement adminViewWebsiteLinki;

    @FindBy (xpath = "//*[@class='fas fa-bell']")
    public WebElement adminHeaderNotificationsLinki;

    @FindBy (xpath = "//*[@class='sidebar show-notification-sidebar']")
    public WebElement adminDashboardNotificationsLinki;

    @FindBy (xpath = "//*[@class='close-btn']")
    public WebElement adminDashboardNotificationsCloseButtonLinki;

    @FindBy (xpath = "(//*[@class='icon-envelope-open'])[1]")
    public WebElement adminDashboardNewMessagesLinki;

    @FindBy (xpath = "(//*[@class='icon-envelope-open'])[2]")
    public WebElement adminDashboardNewConsultsLinki;

    @FindBy (xpath = "//*/h3[text()=' New Messages']")
    public WebElement adminDashboardNewMessagesDropdownLinki;

    @FindBy (xpath = "//*/h3[text()=' New Consults']")
    public WebElement adminDashboardNewConsultsDropdownLinki;

    //---------------Mehmet Muavviz Son---------------\\

    //---------------Merve Nur---------------\\

    @FindBy (xpath = "//span[normalize-space()='Consult information']")
    public WebElement adminconsults;

    //---------------Merve Nur Son---------------\\

}
