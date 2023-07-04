package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.SignUpPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    public WebDriverWait wait;
    private HomePage homePage;
    private SignUpPage signUpPage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public HomePage homePage(){
        return homePage;
    }
    public SignUpPage signUpPage(){
        return signUpPage;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C://Users//rilak//OneDrive//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage(driver, wait);
        signUpPage = new SignUpPage(driver, wait);
    }

    @BeforeMethod
    public void beforeEachTest(){
        getDriver().manage().window().maximize();
    }
    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
    @AfterClass
    public void cleanUp(){
        getDriver().close();
    }
}
