package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class FlightSelectPage {
    @FindBy(xpath = "//input[@value='Blue Skies Airlines$360$270$5:03']")
    WebElement outFlight;

    @FindBy(xpath = "//input[@value='Unified Airlines$633$303$18:44']")
    WebElement inFlight;

    @FindBy(name = "reserveFlights")
    WebElement reserveFlightButton;

    public FlightPurchasePage reserveFlight(){
        outFlight.click();
        inFlight.click();
        reserveFlightButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), FlightPurchasePage.class);
    }
}
