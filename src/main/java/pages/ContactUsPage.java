package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    private WebDriver driver;


    @FindBy(id="id_contact")
    private WebElement subjectHeading;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="id_order")
    private WebElement orderField;

    @FindBy(id="message")
    private WebElement messageField;

    @FindBy(id="submitMessage")
    private WebElement sendButton;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);


    }

    public void submitForm(String header, String email, String order, String message ){
        Select dropdown = new Select(subjectHeading);
        dropdown.selectByVisibleText(header);
        emailField.sendKeys(email);
        orderField.sendKeys(order);
        messageField.sendKeys(message);
        sendButton.click();

    }
}
