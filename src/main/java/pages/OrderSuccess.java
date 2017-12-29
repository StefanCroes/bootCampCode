package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSuccess {

    private WebDriver driver;

    @FindBy(css = "[class*=alert-success]")
    private WebElement successText;

    public OrderSuccess(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public boolean isMessageDisplayed() {
        return successText.isDisplayed();
    }

}


