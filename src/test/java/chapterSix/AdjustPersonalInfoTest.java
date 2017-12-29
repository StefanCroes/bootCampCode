package chapterSix;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdjustPersonalInfoTest extends TestShopScenario {

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("stefan.croes@polteq.com");
        driver.findElement(By.id("passwd")).sendKeys("Z9E/Kcvw ");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.xpath(".//*[@title='Manage my personal information']")).click();

       String checkName = driver.findElement(By.id("firstname")).getAttribute("value");

        if (checkName.matches("Stefan")) {

            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("Alexander");
            driver.findElement(By.xpath(".//*[@name='submitIdentity']")).click();

            Assert.assertTrue(driver.findElement(By.xpath(".//*[p@class='alert alert-success']"))).isDisplayed();


        }

            else {

                driver.findElement(By.id("firstname")).clear();
                driver.findElement(By.id("firstname")).sendKeys("Stefan");
                driver.findElement(By.xpath(".//*[@name='submitIdentity']")).click();

                //Assert.assertTrue(driver.findElement(By.className("alert alert-success")).isDisplayed());


            }


           }
    }


