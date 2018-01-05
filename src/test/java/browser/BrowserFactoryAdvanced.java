package browser;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactoryAdvanced {

    static WebDriver driver;

    public enum Browser{
        CHROME,
        FIREFOX;

    }

    public static WebDriver getDriver(Browser browser) {
        switch (browser) {

            case CHROME:
                getChromeDriver();
                break;
            case FIREFOX:
                getFirefoxDriver();
                break;
            default:
                getChromeDriver();
                break;

        }
        return driver;

    }

            private static WebDriver getFirefoxDriver() {
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                FirefoxDriverManager.getInstance().setup();
                return driver = new FirefoxDriver(capabilities);
            }

            private static WebDriver getChromeDriver() {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                ChromeDriverManager.getInstance().setup();
                return driver = new ChromeDriver(options);

            }
        }

