package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By logInButton = By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void enterDataToUsernameField(String text) {
        getDriver().findElement(usernameField).sendKeys(text);
    }

    public void clearUsernameField() {
        getDriver().findElement(usernameField).clear();
    }

    public void enterDataToPasswordField(String text) {
        getDriver().findElement(passwordField).sendKeys(text);
    }

    public void clearPasswordField() {
        getDriver().findElement(passwordField).clear();
    }

    public void clickLogInButton() {
        getDriver().findElement(logInButton).click();
    }

    public void open() {
        getDriver().get("https://demo.opensource-socialnetwork.org/login");
    }
}
