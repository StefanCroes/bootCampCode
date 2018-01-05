package chapterSix;

import browser.BrowserFactory;
import browser.BrowserFactoryAdvanced;
import exercises.EnumExample;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestShopScenario {

    protected WebDriver driver;

    @BeforeMethod
        public void SetUp() {
        driver = BrowserFactoryAdvanced.getDriver(BrowserFactoryAdvanced.Browser.FIREFOX);

            //public void SetUp() {
     //           driver = BrowserFactory.getDriver("chrome");

        //ChromeDriverManager.getInstance().setup();
        //driver = new ChromeDriver();

       //open the website
       driver.get("https://techblog.polteq.com/testshop/index.php");
       driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}



