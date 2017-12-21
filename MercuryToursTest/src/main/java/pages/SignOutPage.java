package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class SignOutPage {

    @FindBy(xpath = "(//*[@class='mouseOut']//*[text()='SIGN-OFF'])")
    WebElement signOffButton;

    public SignOnPage logOut() throws InterruptedException {
        signOffButton.click();
        Thread.sleep(3000);
        return PageFactory.initElements(BrowserChrome.getBrowser(), SignOnPage.class);
    }

    public Boolean hasSignOutButton() { return signOffButton.isDisplayed(); }
}
