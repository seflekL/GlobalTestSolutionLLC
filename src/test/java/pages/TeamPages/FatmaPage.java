package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FatmaPage {

    public FatmaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
