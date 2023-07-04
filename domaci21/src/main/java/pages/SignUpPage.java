package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement invalidEmailMsg;
    private WebElement invalidPasswordMsg;
    private WebElement signInBtn;
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        passwordField = getDriver().findElement(By.xpath("//input[@id='password']"));
        return passwordField;
    }
    public WebElement getInvalidEmailMsg(){
        invalidEmailMsg = getDriver().findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        return invalidEmailMsg;
    }
    public WebElement getInvalidPasswordMsg(){
        invalidPasswordMsg = getDriver().findElement(By.xpath("//div[contains(text(), 'This field must have no less than 5')]"));
        return invalidPasswordMsg;
    }
    public WebElement getSignInBtn(){
        signInBtn = getDriver().findElement(By.xpath("//button[@type='submit']"));
        return signInBtn;
    }

    public SignUpPage enterEmail(String email){
        getEmailField().sendKeys(email);
        return this;
    }
    public SignUpPage enterPassword(String password){
        getPasswordField().sendKeys(password);
        return this;
    }
    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
