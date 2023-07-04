package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage{

    @FindBy (id = "email")
    WebElement emailField;
    @FindBy (id = "password")
    WebElement passwordField;
    @FindBy (xpath = "//div[contains(text(), 'Valid email is required')]")
    WebElement invalidEmailMsg;
    @FindBy (xpath = "//div[contains(text(), 'This field must have no less than 5')]")
    WebElement invalidPasswordMsg;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement signInBtn;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(),this);
    }

    public SignUpPage enterEmail(String email){
        emailField.sendKeys(email);
        return this;
    }
    public SignUpPage enterPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }
    public SignUpPage invalidEmailMessage(){
        open();
        enterEmail("invalidEmail");
        Assert.assertTrue(invalidEmailMsg.isDisplayed());
        return this;
    }
    public SignUpPage invalidPasswordMessage(){
        open();
        enterPassword("123");
        Assert.assertTrue(invalidPasswordMsg.isDisplayed());
        return this;
    }
    public SignUpPage checkURL(){
        open();
        getDriver().getCurrentUrl().contains("/signup");
        return this;
    }
    public SignUpPage emailFieldType(){
        Assert.assertEquals(open().emailField.getAttribute("type"), "email");
        return this;
    }
    public SignUpPage passwordFieldType(){
        Assert.assertEquals(open().passwordField.getAttribute("type"),"password");
        return this;
    }
    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
