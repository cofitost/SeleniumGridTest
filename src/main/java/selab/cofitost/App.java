package selab.cofitost;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App {
    // Capabilities chromeCapabilities = DesiredCapabilities.chrome();
    // Capabilities firefoxCapabilities = DesiredCapabilities.firefox();

    // DesiredCapabilities caps = new DesiredCapabilities();

    public static void main(String[] args) {
        DesiredCapabilities chromeCaps = DesiredCapabilities.chrome();
        // chromeCaps.setBrowserName("chrome");

        RemoteWebDriver chrome;
        try {
            chrome = new RemoteWebDriver(new URL("http://140.134.26.76:38101/wd/hub"), chromeCaps);
            chrome.get("https://www.google.com");
            System.out.println(chrome.getTitle());
            chrome.quit();
    
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
