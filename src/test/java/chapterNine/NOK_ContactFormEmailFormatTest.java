package chapterNine;

import chapterSix.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import pages.OrderSuccess;

public class NOK_ContactFormEmailFormatTest extends TestShopScenario {

    @Test
    public void contactFormErrorTwo() {

        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.submitForm("Customer service", "nope", "4321234", "Help!");


        Assert.assertTrue(driver.findElement(By.className("alert")).isDisplayed());

        WebElement faultMessageOne = driver.findElement(By.className("alert"));
        Assertions.assertThat(faultMessageOne.getText()).as("Melding komt niet overeen").contains("Invalid email address.");

        contactUsPage.clearForm();
        contactUsPage.submitForm("Customer service", "nope@correct.com", "4321234", "Help!");

        OrderSuccess orderSuccess = new OrderSuccess(driver);
        Assertions.assertThat(orderSuccess.isMessageDisplayed()).as("Melding niet getoond").isTrue();
    }

}
