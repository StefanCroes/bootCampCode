package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(css = "[title='contact']")
    private WebElement contactLink;

    @FindBy(className = "login")
    private WebElement toLogin;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public void clickContactUs() {
        contactLink.click();

    }

    public void toLogIn() {
        toLogin.click();

    }

}