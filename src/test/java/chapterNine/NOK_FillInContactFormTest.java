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

public class NOK_FillInContactFormTest extends TestShopScenario{

    ContactUsPage contactUsPage = new ContactUsPage(driver);
    HomePage homePage = new HomePage(driver);

    @Test
    public void contactFormErrorOne() {

        //Test 1
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickContactUs();
        contactUsPage.submitForm("Customer service", "<nope>", "4321234", "Help!");
        Assert.assertTrue(driver.findElement(By.className("alert")).isDisplayed());
        Assertions.assertThat(contactUsPage.getMessage()).as("Melding komt niet overeen").contains("Invalid email address.");
    }

    @Test
    public void contactFormErrorTwo() {

        //Test 2
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickContactUs();
        contactUsPage.submitForm("-- Choose --", "test@test.com", "4321234", "boodschap");
        Assertions.assertThat(contactUsPage.getMessage()).as("Melding twee komt niet overeen").contains("Please select a subject from the list provided.");
   }

    @Test
       public void contactFormErrorThree() {
       //test 3
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickContactUs();
        contactUsPage.submitForm("Customer service", "test@test.com", "4321234","");

        Assertions.assertThat(contactUsPage.getMessage()).as("Melding drie komt niet overeen").contains("The message cannot be blank.");

    }


}
