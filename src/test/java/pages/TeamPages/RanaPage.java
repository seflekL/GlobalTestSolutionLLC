package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RanaPage {

    public RanaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
