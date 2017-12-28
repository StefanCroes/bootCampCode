package chapterSix;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FillCartTest {

    @Test
    public void FillCart () {

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://techblog.polteq.com/testshop/index.php");
        driver.manage().window().maximize();
        boolean cartDisplayed=driver.findElement(By.className("shopping_cart")).isDisplayed();

    }
}
