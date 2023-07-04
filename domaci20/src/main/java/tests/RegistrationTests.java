package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest {

    @Test
    public void verifyUserCanRegister() throws InterruptedException {
        getRegistrationPage().open();
        getRegistrationPage().enterFirstName("Ben");
        getRegistrationPage().enterLastName("Dover");
        Thread.sleep(3000);
    }
}
