package chapterSix;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmptyCartTest extends TestShopScenario {

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        boolean cartIsEmptyCheck = driver.findElement(By.className("ajax_cart_no_product")).isDisplayed();

        if (cartIsEmptyCheck) {

        WebElement EmptyCart = driver.findElement(By.className("shopping_cart"));
        Assertions.assertThat(EmptyCart.getText()).as("The cart is empty").isEqualTo("Cart (empty)");

        driver.findElement(By.cssSelector("[title='More about ipod']")).click();

        driver.findElement(By.xpath(".//*[@id='product_list']/li[2]/div/div[2]/h5/a")).click();

        driver.findElement(By.xpath(".//*[@class='exclusive']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@title='Proceed to checkout']")));

        driver.findElement(By.xpath(".//*[@title='Proceed to checkout']")).click();

        WebElement ItemInCart = driver.findElement(By.className("shopping_cart"));
        Assertions.assertThat(ItemInCart.getText()).as("The cart is empty").isEqualTo("Cart 1 Product");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='icon-trash']")));

        driver.findElement(By.xpath(".//*[@class='icon-trash']")).click(); }

        else {

            System.out.println("Cart was not empty");
        }


        driver.navigate().refresh();

        WebElement EmptyCartFinal = driver.findElement(By.className("shopping_cart"));
        Assertions.assertThat(EmptyCartFinal.getText()).as("The cart is empty").isEqualTo("Cart (empty)");



    }

}
