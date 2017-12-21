package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class FlightsSearchPage {
    //@FindBy(xpath = "//img[contains(@src,’mast_flightfinder.gif’)]")
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")
    WebElement flightFinderImg;

    @FindBy(xpath = "//input[@value='roundtrip']")
    WebElement tripType;

    @FindBy(name = "passCount")
    WebElement passengers;

    @FindBy(name = "fromPort")
    WebElement originDestination;

    @FindBy(name = "fromMonth")
    WebElement departureMonth;

    @FindBy(name = "fromDay")
    WebElement departureDate;

    @FindBy(name = "toPort")
    WebElement arrivalDestination;

    @FindBy(name = "toMonth")
    WebElement arrivalMonth;

    @FindBy(name = "toDay")
    WebElement arrivalDay;

    @FindBy(xpath = "//input[@value='Coach']")
    WebElement serviceClass;

    @FindBy(name = "findFlights")
    WebElement continiueButton;

    public Boolean flightFinderImgExist(){
        return flightFinderImg.isDisplayed();
    }

    public FlightSelectPage searchFlight(){
        tripType.click();
        passengers.sendKeys("1");
        originDestination.sendKeys("Frankfurt");
        departureMonth.sendKeys("January");
        departureDate.sendKeys("20");
        arrivalDestination.sendKeys("San Francisco");
        arrivalMonth.sendKeys("February");
        arrivalDay.sendKeys("10");
        serviceClass.click();
        continiueButton.click();
        return PageFactory.initElements(BrowserChrome.getBrowser(), FlightSelectPage.class);
    }
}
