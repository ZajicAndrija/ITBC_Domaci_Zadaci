package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    @FindBy (css = "#app > div > div > header > div > div.v-toolbar__items > a:nth-child(4)")
    WebElement signUpBtn;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);
    }
    public HomePage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
        return this;
    }
}
