package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void enterFirstName(String text) {
        getDriver().findElement(firstNameField).sendKeys(text);
    }

    public void enterLastName(String text) {
        getDriver().findElement(lastNameField).sendKeys(text);
    }

    public void open() {
        getDriver().get("https://demo.opensource-socialnetwork.org/");
    }
}
