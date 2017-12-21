package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightConfirmationPage {

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/img")
    WebElement flightConfirmationMessage;

    public Boolean flightConfirmationImgExist(){
        return flightConfirmationMessage.isDisplayed();
    }
}
