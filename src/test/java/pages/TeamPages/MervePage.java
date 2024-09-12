package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MervePage {

    public MervePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
