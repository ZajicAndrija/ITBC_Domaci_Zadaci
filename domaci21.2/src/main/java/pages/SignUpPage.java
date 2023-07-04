package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage{
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement invalidEmailMsg;
    private WebElement invalidPasswordMsg;
    private WebElement signInBtn;
    private WebDriverWait wait;
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        passwordField = getDriver().findElement(By.id("password"));
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
    public SignUpPage checkURL(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
        return this;
    }
    public SignUpPage checkEmailType(){
        Assert.assertEquals(getDriver().findElement(By.id("email")).getAttribute("type"), "email");
        return this;
    }
    public SignUpPage checkPasswordType(){
        Assert.assertEquals(getDriver().findElement(By.id("password")).getAttribute("type"), "password");
        return this;
    }
    public SignUpPage invalidEmaill() {
        getEmailField().sendKeys("invalidEmail");
        Assert.assertTrue(getInvalidEmailMsg().isDisplayed());
        return this;
    }
    public SignUpPage invalidPasswordd() {
        getPasswordField().sendKeys("123");
        Assert.assertTrue(getInvalidPasswordMsg().isDisplayed());
        return this;
    }
    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
