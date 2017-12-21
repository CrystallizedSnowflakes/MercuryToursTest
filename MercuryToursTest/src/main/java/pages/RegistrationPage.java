package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class RegistrationPage {

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(id = "userName")
    WebElement eMail;

    @FindBy(name = "address1")
    WebElement address;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "state")
    WebElement state;

    @FindBy(name = "postalCode")
    WebElement postalCode;

    @FindBy(name = "country")
    WebElement country;

    @FindBy(id = "email")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(name = "register")
    WebElement registrationButon;

    public RegistrationValidationPage Register() {
        firstName.sendKeys("Nadezhda");
        lastName.sendKeys("Georgieva");
        phone.sendKeys("0888000000");
        eMail.sendKeys("nadezhda.georgieva2@gmail.com");
        address.sendKeys("1325 Borregas Ave.");
        city.sendKeys("Sunnyvale");
        state.sendKeys("CA");
        postalCode.sendKeys("94089");
        country.sendKeys("UNITED STATES");
        userName.sendKeys("ngg");
        password.sendKeys("123");
        confirmPassword.sendKeys("123");
        registrationButon.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), RegistrationValidationPage.class);
    }
}
