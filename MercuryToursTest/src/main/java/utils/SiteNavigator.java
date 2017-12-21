package utils;

import org.openqa.selenium.support.PageFactory;
import pages.*;

public class SiteNavigator {
    public static MainPage openMainPage(){
        BrowserChrome.getBrowser().navigate().to("http://newtours.demoaut.com");
        return PageFactory.initElements(BrowserChrome.getBrowser(), MainPage.class);
    }
}
