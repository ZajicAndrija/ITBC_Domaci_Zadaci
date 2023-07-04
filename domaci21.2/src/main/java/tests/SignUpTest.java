package tests;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void checkUrl(){
        signUpPage().open().checkURL();
    }
    @Test
    public void emailFieldType(){
        signUpPage().open().checkEmailType();
    }
    @Test
    public void passwordFieldType(){
        signUpPage().open().checkPasswordType();
    }
    @Test
    public void invalidEmail(){
        signUpPage().open().invalidEmaill();
    }
    @Test
    public void invalidPassword() {
        signUpPage().open().invalidPasswordd();
    }
}
