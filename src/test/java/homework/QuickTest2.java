package homework;

import chapterSix.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickTest2 extends TestShopScenario {

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("stefan@croes.com");
        driver.findElement(By.id("passwd")).sendKeys("1qazxsw2");
        driver.findElement(By.id("SubmitLogin")).click();

        driver.findElement(By.className("lnk_wishlist")).click();

        //first check if item exists

        String FeelThePainPresent = driver.findElement(By.id("block-history")).getText();

        if (FeelThePainPresent.contains("Feel the pain")) {


            System.out.println("Bestaat al");


            }



        else {
            System.out.print("Bestaat niet");
        }
    }

}
