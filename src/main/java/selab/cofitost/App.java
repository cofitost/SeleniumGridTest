package selab.cofitost;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    Capabilities chromeCapabilities = DesiredCapabilities.chrome();
    Capabilities firefoxCapabilities = DesiredCapabilities.firefox();

    public static void main( String[] args )
    {
        RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
        RemoteWebDriver firefox = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxCapabilities);
    
        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());
    
        // run against firefox
        firefox.get("https://www.google.com");
        System.out.println(firefox.getTitle());
      
        chrome.quit();
        firefox.quit();
    }
}
