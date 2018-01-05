package browser;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver getDriver (String browser){
        switch(browser.toLowerCase()){
            case "firefox":
              return getFirefoxDriver();

            case "chrome": default:
                ChromeDriverManager.getInstance().setup();
                return ChromeDriver();


        }


    }

    private static WebDriver getFirefoxDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        FirefoxDriverManager.getInstance().setup();
        return driver = new FirefoxDriver(capabilities);
    }

    private static WebDriver ChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriverManager.getInstance().setup();
        return driver = new ChromeDriver(options);

    }
}
