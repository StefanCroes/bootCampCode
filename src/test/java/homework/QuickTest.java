package homework;

import chapterSix.TestShopScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;




    public class QuickTest extends TestShopScenario {

        @Test
        public void test() {
            WebDriverWait wait = new WebDriverWait(driver, 15);

            driver.findElement(By.className("login")).click();
            driver.findElement(By.id("email")).sendKeys("stefan@croes.com");
            driver.findElement(By.id("passwd")).sendKeys("1qazxsw2");
            driver.findElement(By.id("SubmitLogin")).click();

            driver.findElement(By.className("lnk_wishlist")).click();


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitWishlist")));
            driver.findElement(By.id("name")).sendKeys("Feel the pain");
            driver.findElement(By.id("submitWishlist")).click();

            driver.navigate().refresh();
            ((JavascriptExecutor) driver).executeScript("window.focus();");


            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[.//a[contains(text(), 'Feel the pain')]]//td[7]/a")));
            driver.findElement(By.xpath("//tr[.//a[contains(text(), 'Feel the pain')]]//td[7]/a")).click();
            driver.switchTo().alert().accept();

            driver.navigate().refresh();
            ((JavascriptExecutor) driver).executeScript("window.focus();");

            //Assert.assertFalse(driver.findElement(By.xpath("//tr[.//a[contains(text(), 'Feel the p')]]")).isDisplayed());

        }

    }





