package chapterNine;

import chapterSix.TestShopScenario;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageLogin;

public class LogInFails extends TestShopScenario {

    @Test
    public void LoginFailOne() {

        HomePage homePage = new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("", "1qazxsw2");

        Assertions.assertThat(homePageLogin.getMessage()).as("Melding een komt niet overeen").contains("An email address required.");
    }

    @Test
    public void LoginFailTwo() {

        HomePage homePage = new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("bootcamper@feelthepain.com", "");

        Assertions.assertThat(homePageLogin.getMessage()).as("Melding twee komt niet overeen").contains("Password is required.");

    }

    @Test
    public void LoginFailThree() {

        HomePage homePage = new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("bootcamper@feelthepain.com", "aydgsauadbhaudas");

        Assertions.assertThat(homePageLogin.getMessage()).as("Melding drie komt niet overeen").contains("Authentication failed.");

    }

    @Test
    public void LoginFailFour() {

        HomePage homePage = new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("bootcamper@feelthepain.com", "a");

        Assertions.assertThat(homePageLogin.getMessage()).as("Melding vier komt niet overeen").contains("Invalid password.");

    }

    @Test
    public void LoginFailFive() {

        HomePage homePage = new HomePage(driver);
        homePage.toLogIn();

        HomePageLogin homePageLogin = new HomePageLogin(driver);
        homePageLogin.submitForm("bootcamper", "a");

        Assertions.assertThat(homePageLogin.errorShown()).as("Geen foutmelding getoond").isTrue();


    }

 }

