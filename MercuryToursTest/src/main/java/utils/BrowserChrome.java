package utils;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserChrome {

     static ChromeDriver browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        browser = new ChromeDriver();
        browser.manage()
                .window()
                .maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static ChromeDriver getBrowser() {
        return browser;
    }
}

