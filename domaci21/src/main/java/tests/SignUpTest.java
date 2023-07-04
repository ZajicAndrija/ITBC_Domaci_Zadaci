package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpTest extends BaseTest{

    @Test
    public void checkURL(){
        signUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }
    @Test
    public void checkEmailType() throws InterruptedException {
        signUpPage().open();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage().getEmailField().getAttribute("type"), "email");
    }
    @Test
    public void checkPasswordType() throws InterruptedException {
        signUpPage().open();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage().getPasswordField().getAttribute("type"), "password");

    }
    @Test
    public void invalidEmail() {
        signUpPage().open()
                .enterEmail("invalidemail");
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(signUpPage().getInvalidEmailMsg())).isDisplayed());

    }
    @Test
    public void invalidPassword() {
        signUpPage().open()
                .enterPassword("123");
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(signUpPage().getInvalidPasswordMsg())).isDisplayed());
    }
}