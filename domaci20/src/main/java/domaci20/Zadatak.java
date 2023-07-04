package domaci20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//rilak//OneDrive//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void beforeEachTest() {
        driver.get("https://vue-demo.daniel-avellaneda.com/signup");
    }

    @Test
    public void checkURL() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
    }

    @Test
    public void EmailInput() {
        Assert.assertEquals(driver.findElement(By.id("email")).getAttribute("type"), "email");
    }

    @Test
    public void PasswordInput() {
        Assert.assertEquals(driver.findElement(By.id("password")).getAttribute("type"), "password");
    }

    @Test
    public void InvalidEmail() {
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("invalidEmail");

        WebElement signUpBtn = driver.findElement(By.cssSelector("button[type=submit]"));
        signUpBtn.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(), 'Valid email is required')]"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void ShortPassword() {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("abcd");

        WebElement signUpBtn = driver.findElement(By.cssSelector("button[type=submit]"));
        signUpBtn.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(), 'no less than 5 characters')]"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
