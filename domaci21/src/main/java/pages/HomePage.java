package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private WebElement signUpBtn;
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getSignUpBtn(){
        signUpBtn = getDriver().findElement(By.cssSelector("#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4)"));
        return signUpBtn;
    }
    public HomePage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
        return this;
    }
}
