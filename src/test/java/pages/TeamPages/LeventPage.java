package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LeventPage {

    public LeventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
