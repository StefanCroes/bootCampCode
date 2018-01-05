package sandbox;

import browser.BrowserFactory;
import browser.BrowserFactoryAdvanced;
import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserDriven {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
        public void SetUp(BrowserFactoryAdvanced.Browser browser) {
        driver = BrowserFactoryAdvanced.getDriver(browser);

    }
            @Test
            public void SetUp() {
        //open the website
       driver.get("https://techblog.polteq.com/testshop/index.php");
       driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}



