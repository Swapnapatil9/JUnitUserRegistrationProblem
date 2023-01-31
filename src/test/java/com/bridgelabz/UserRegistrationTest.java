package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstNameWhenProperShouldReturnTrue(){
        UserRegistration userValidator = new UserRegistration();
        boolean firstName =userValidator.validateFirstName("Swapna");
        Assertions.assertEquals("true",firstName);
    }
    @Test
    void givenLastNameWhenProperShouldReturnTrue(){
        UserRegistration userValidator = new UserRegistration();
        boolean lastName =userValidator.validateLastName("Patil");
        Assertions.assertEquals("True",lastName);
    }
    @Test
    void givenEmailWhenProperShouldReturnTrue(){
        UserRegistration userValidator = new UserRegistration();
        boolean email=userValidator.validateEmail("swapnapatil629@gmail.com");
        Assertions.assertEquals("True",email);
    }
    @Test
    void givenMobileFormatWhenProperShouldReturnTrue(){
        UserRegistration userValidator = new UserRegistration();
        boolean mobileFormat =userValidator.validateMobileFormat("91 7894561202");
        Assertions.assertEquals("True",mobileFormat);
    }
    @Test
    void givenPasswordWhenProperShouldReturnTrue(){
        UserRegistration userValidator = new UserRegistration();
        boolean password =userValidator.validatePassword("#Swapna1@Patil");
        Assertions.assertEquals("True",password);
    }
}
