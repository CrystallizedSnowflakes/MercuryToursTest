package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class SignOnPage {
    @FindBy(name = "userName")
    WebElement userName;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(name = "login")
    WebElement submitButton;

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='SIGN-ON'])")
    WebElement signOnButton;

    public SignOutPage logIn() throws InterruptedException {

        userName.sendKeys("ngg");
        passwordInput.sendKeys("123");
        submitButton.click();
        Thread.sleep(3000);
        return PageFactory.initElements(BrowserChrome.getBrowser(), SignOutPage.class);
    }

    public Boolean hasSignOnButton() {
        return signOnButton.isDisplayed();
    }
}
