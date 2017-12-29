package chapterSix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateSupplierProductTest extends TestShopScenario {

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 15);

    Select dropdown = new Select(driver.findElement(By.xpath(".//*[@name='supplier_list']")));

    dropdown.selectByVisibleText("Apple Computer, Inc");

    List<WebElement> allOptions = driver.findElements(By.cssSelector("[itemprop='name']>a"));

    //for WebElement product : allOptions




    }

}
