package tests;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    @Test
    public void checkUrl() {
        signUpPage().checkURL();
    }
    @Test
    public void checkEmailFieldType(){
        signUpPage().emailFieldType();
    }
    @Test
    public void checkPasswordFieldType(){
        signUpPage().passwordFieldType();
    }
    @Test
    public void checkInvalidEmail(){
        signUpPage().invalidEmailMessage();
    }
    @Test
    public void checkInvalidPassword(){
        signUpPage().invalidPasswordMessage();
    }
}
