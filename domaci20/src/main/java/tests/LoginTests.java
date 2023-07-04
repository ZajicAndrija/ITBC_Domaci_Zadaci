package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void verifyUserCanLogIn() {
        getLoginPage().open();
        getLoginPage().clearUsernameField();
        getLoginPage().enterDataToUsernameField("administrator");
        getLoginPage().clearPasswordField();
        getLoginPage().enterDataToPasswordField("administrator");
        getLoginPage().clickLogInButton();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("home"));
    }
}
