package browser;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver getDriver (String browser){
        switch(browser.toLowerCase()){
            case "firefox":
              getFirefoxDriver();
              break;
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        return driver;

    }

    private static WebDriver getFirefoxDriver() {
        FirefoxDriverManager.getInstance().setup();
        return driver = new FirefoxDriver();
    }

}
