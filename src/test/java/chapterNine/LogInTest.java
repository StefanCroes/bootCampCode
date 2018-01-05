package chapterNine;

import chapterSix.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageLogin;

public class LogInTest extends TestShopScenario {

    @Test
    public void LoginTest() {

        HomePage homePage= new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("bootcamper@feelthepain.com", "1qazxsw2");

        //Assertions.assertThat(contactUsPage.getMessage()).as("Melding drie komt niet overeen").contains("The message cannot be blank.");

    }
}
