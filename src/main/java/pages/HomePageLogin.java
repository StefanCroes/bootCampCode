package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageLogin {

    private WebDriver driver;


    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(className = "alert")
    private WebElement errorMessage;

    @FindBy(className = "form-error")
    private WebElement errorShown;

    public HomePageLogin(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);


    }

    public void submitForm(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();


    }

    public String getMessage() {
        return errorMessage.getText();

    }

    public boolean errorShown() {
        return errorShown.isDisplayed();
    }

}



