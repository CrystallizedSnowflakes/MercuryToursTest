package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserChrome;

public class FlightPurchasePage {
    @FindBy(name = "passFirst0")
    WebElement passengerFirstName;

    @FindBy(name = "passLast0")
    WebElement passengerLastName;

    @FindBy(name = "pass.0.meal")
    WebElement meal;

    @FindBy(name = "creditCard")
    WebElement cardType;

    @FindBy(name = "creditnumber")
    WebElement creditCardNumber;

    @FindBy(name = "cc_exp_dt_mn")
    WebElement expirationMonth;

    @FindBy(name = "cc_exp_dt_yr")
    WebElement expirationYear;

    @FindBy(name = "billAddress1")
    WebElement billingAddress;

    @FindBy(name = "billCity")
    WebElement billingCity;

    @FindBy(name = "billState")
    WebElement billingState;

    @FindBy(name = "billZip")
    WebElement billingZip;

    @FindBy(name = "billCountry")
    WebElement billingCountry;

    @FindBy(name = "delAddress1")
    WebElement deliveryAddress;

    @FindBy(name = "delCity")
    WebElement deliveryCity;

    @FindBy(name = "delState")
    WebElement deliveryState;

    @FindBy(name = "delZip")
    WebElement deliveryZip;

    @FindBy(name = "delCountry")
    WebElement deliveryCountry;

    public FlightConfirmationPage purchaseFlight() throws InterruptedException {
        passengerFirstName.sendKeys("Nadezhda");
        passengerLastName.sendKeys("Georgieva");
        meal.sendKeys("Vegeterian");
        cardType.sendKeys("Visa");
        creditCardNumber.sendKeys("4444111122223333");
        expirationMonth.sendKeys("12");
        expirationYear.sendKeys("2010");
//        billingAddress.sendKeys("1325 Borregas Ave.");
//        billingCity.sendKeys("Sunnyvale");
//        billingState.sendKeys("CA");
//        billingZip.sendKeys("94089");
//        billingCountry.sendKeys("UNITED STATES");
//        Thread.sleep(3000);
//        deliveryAddress.sendKeys("1325 Borregas Ave.");
//        deliveryCity.sendKeys("Sunnyvale");
//        deliveryState.sendKeys("CA");
//        deliveryZip.sendKeys("94089");
//        deliveryCountry.sendKeys("UNITED STATES");
        Thread.sleep(3000);
        return PageFactory.initElements(BrowserChrome.getBrowser(), FlightConfirmationPage.class);
    }
}
