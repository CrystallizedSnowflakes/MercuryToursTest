package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationValidationPage {
    @FindBy(xpath = "//*[contains(text(), 'Thank you for registering.')]")
    WebElement registrationSuccessMessage;

    public Boolean textFromParagraphIsValid(){
        return registrationSuccessMessage.isDisplayed();
    }
}
