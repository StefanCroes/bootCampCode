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

public class DeleteWishListTest extends TestShopScenario {

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

         //List<WebElement> WishlistItems = driver.findElements(By.xpath("//tr[contains(@id,'wishlist_')]"));
           // List<String> all_elements_text = new ArrayList<>();
            //for (int i = 0; i < WishlistItems.size(); i++) {

               // loading text of each element in to array all_elements_text
               // all_elements_text.add(WishlistItems.get(i).getText());

                //to print directly
                System.out.println("Bestaat al");


            //}

        }

        else {

           wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitWishlist")));
            driver.findElement(By.id("name")).sendKeys("Feel the pain");
          driver.findElement(By.id("submitWishlist")).click();

           driver.navigate().refresh();

        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[.//a[contains(text(), 'Feel the pain')]]//td[7]/a")));
        driver.findElement(By.xpath("//tr[.//a[contains(text(), 'Feel the pain')]]//td[7]/a")).click();
        driver.switchTo().alert().accept();

        driver.navigate().refresh();

        String FeelThePainDeleted = driver.findElement(By.id("block-history")).getText();
        Assert.assertFalse(FeelThePainDeleted.contains("Feel the pain"));


    }

    }

