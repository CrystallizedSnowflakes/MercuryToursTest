package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class ContactPage {
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/img")
    WebElement underConstructionMessage;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")
    WebElement backToHomeButton;

    public Boolean contactPageUnderConstructionMessage(){
        return underConstructionMessage.isDisplayed();
    }

    public MainPage redirectToMainPageFromContactPage(){
        backToHomeButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), MainPage.class);
    }
}
