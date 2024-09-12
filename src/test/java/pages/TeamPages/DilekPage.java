package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DilekPage {

    public DilekPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
