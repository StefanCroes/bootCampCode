package exercises;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void logInSuccesFull () {

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.get("https://techblog.polteq.com/testshop/index.php");
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("stefan.croes@polteq.com");
        driver.findElement(By.id("passwd")).sendKeys("Z9E/Kcvw ");
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement InlogNaam = driver.findElement(By.className("account"));
        Assertions.assertThat(InlogNaam.getText()).as("Loginnaam komt niet overeen").isEqualTo("Stefan Croes");

        driver.quit();
    }
}
