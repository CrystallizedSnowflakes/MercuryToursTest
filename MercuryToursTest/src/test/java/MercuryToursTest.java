import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserChrome;
import utils.SiteNavigator;

import static org.testng.Assert.assertTrue;

public class MercuryToursTest {

    @BeforeMethod(alwaysRun = true)
    public void BeforeTest() {
        BrowserChrome.openBrowser();
    }

    @Test
    public void LogInTest() throws InterruptedException {
        Boolean logInSuccessful = SiteNavigator.openMainPage()
                .signOnButtonClick()
                .logIn()
                .hasSignOutButton();
        assertTrue(logInSuccessful);
    }

    @Test
    public void RegistrationTest() {
        Boolean registrationSuccessful = SiteNavigator.openMainPage()
                .registerBttnClick()
                .Register()
                .textFromParagraphIsValid();
        assertTrue(registrationSuccessful);
    }

    @Test
    public void LogOutTest() throws InterruptedException {
        Boolean logOutSuccessful = SiteNavigator.openMainPage()
                .signOnButtonClick()
                .logIn()
                .logOut()
                .hasSignOnButton();
        assertTrue(logOutSuccessful);
    }

    @Test
    public void QuickLogInToFlightSearchTest(){
        Boolean quickLogInSuccessful = SiteNavigator.openMainPage()
                .quickLogInToFlightSearch()
                .flightFinderImgExist();
        assertTrue(quickLogInSuccessful);
    }

    @Test
    public void FlightPurchaseTest() throws InterruptedException {
        Boolean flightPurchaseSuccessful = SiteNavigator.openMainPage()
                .quickLogInToFlightSearch()
                .searchFlight()
                .reserveFlight()
                .purchaseFlight()
                .flightConfirmationImgExist();
        assertTrue(flightPurchaseSuccessful);
    }

    @Test
    public void SupportIsUnderConstructionTest(){
        Boolean supportPageIsUnderConstruction = SiteNavigator.openMainPage()
                .suportButtonClick()
                .supportPageUnderConstructionMassege();
        assertTrue(supportPageIsUnderConstruction);
    }

    @Test
    public void RedirectToHomePageFromSupportPageTest(){
        Boolean redirectionToHomePageFromSupportPageSuccessful = SiteNavigator.openMainPage()
                .suportButtonClick()
                .redirectToMainPageFromSupportPage()
                .homePageIsDisplayed();
        assertTrue(redirectionToHomePageFromSupportPageSuccessful);
    }

    @Test
    public void ContactIsUnderConstructionTest() {
        Boolean contactIsUnderConstruction = SiteNavigator.openMainPage()
                .contactButtonClick()
                .contactPageUnderConstructionMessage();
        assertTrue(contactIsUnderConstruction);
    }

    @Test
    public void RedirectToHomePageFromContactPageTest(){
        Boolean redirectionToHomePageFromContactPageSuccessful = SiteNavigator.openMainPage()
                .contactButtonClick()
                .redirectToMainPageFromContactPage()
                .homePageIsDisplayed();
        assertTrue(redirectionToHomePageFromContactPageSuccessful);
    }

    @Test
    public void FlightsButtonIsWorkingTest(){
        Boolean openFlightSelectPageSuccessful = SiteNavigator.openMainPage()
                .flightsButtonClick()
                .flightFinderImgExist();
        assertTrue(openFlightSelectPageSuccessful);
        //I found a BUG :)
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        BrowserChrome.closeBrowser();
    }
}
