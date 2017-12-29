package chapterNine;

import chapterSix.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import pages.OrderSuccess;

public class FillInContactFormTest extends TestShopScenario {

    @Test
    public void fillInContactForm() {

        HomePage homePage = new HomePage(driver);
        homePage.clickContactUs();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.submitForm("Webmaster", "test@test.com", "12345", "Dit is de boodschap");

        OrderSuccess orderSuccess = new OrderSuccess(driver);
        Assertions.assertThat(orderSuccess.isMessageDisplayed()).as("Melding niet getoond").isTrue();
    }
}
