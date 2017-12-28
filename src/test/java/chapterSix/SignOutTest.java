package chapterSix;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignOutTest {

    @Test
    public void signInAndOut () {

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://techblog.polteq.com/testshop/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("stefan.croes@polteq.com");
        driver.findElement(By.id("passwd")).sendKeys("Z9E/Kcvw ");
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement InlogNaam = driver.findElement(By.className("account"));
        Assertions.assertThat(InlogNaam.getText()).as("Loginnaam komt niet overeen").isEqualTo("Stefan Croes");
        driver.findElement(By.className("logout")).click();

        //Twee verschillende assertions om te controleren dat user is uitgelogd.
        
        WebElement SignInText = driver.findElement(By.className("login"));
        Assertions.assertThat(SignInText.getText()).as("The displayed text is not correct").isEqualTo("Sign in");
        Assert.assertTrue(driver.findElement(By.className("login")).isDisplayed());
        driver.quit();
        }
}
