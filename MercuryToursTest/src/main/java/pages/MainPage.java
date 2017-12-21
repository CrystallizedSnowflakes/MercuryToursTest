package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class MainPage {
    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='SIGN-ON'])")
    WebElement signOnButton;

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='REGISTER'])")
    WebElement registerButton;

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='SUPPORT'])")
    WebElement supportButton;

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='CONTACT'])")
    WebElement contactButton;

    @FindBy(name = "userName")
    WebElement userName;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(name = "login")
    WebElement signInButton;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[3]/td[1]/img")
    WebElement findAFlightImg;

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='Flights'])")
    WebElement flightsButton;

    public SignOnPage signOnButtonClick() {
        signOnButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), SignOnPage.class);
    }

    public RegistrationPage registerBttnClick() {
        registerButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), RegistrationPage.class);
    }

    public SupportPage suportButtonClick() {
        supportButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), SupportPage.class);
    }

    public ContactPage contactButtonClick() {
        contactButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), ContactPage.class);
    }

    public FlightsSearchPage flightsButtonClick() {
        flightsButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), FlightsSearchPage.class);

    }

    public FlightsSearchPage quickLogInToFlightSearch() {

        userName.sendKeys("ngg");
        passwordInput.sendKeys("123");
        signInButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), FlightsSearchPage.class);
    }
    public Boolean homePageIsDisplayed(){
        return findAFlightImg.isDisplayed();
    }

}
