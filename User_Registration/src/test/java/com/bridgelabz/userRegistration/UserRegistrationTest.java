package com.bridgelabz.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author - Shreyash Jadhav
 */
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();     // created object of class UserRegistration
    /**
     *  created validFirstNameTest method to test for valid first name
     */
    @Test
    public void validFirstNameTest(){
        /*
         *  calling validFirstName method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validFirstName();
        Assertions.assertTrue(result);
    }
    /**
     *  created validLastNameTest method to test for valid last name
     */
    @Test
    public void validLastNameTest(){
        /*
         *  calling validLastName method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validLastName();
        Assertions.assertTrue(result);
    }
    /**
     *  created validMobileNumberTest method to test for valid MobileNumber
     */
    @Test
    public void validMobileNumberTest(){
        /*
         *  calling validMobileNumber method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validMobileNumber();
        Assertions.assertTrue(result);
    }
    /**
     *  created validPasswordTest method to test for valid Password
     */
    @Test
    public void validPasswordTest(){
        /*
         *  calling validPassword method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validPassword();
        Assertions.assertTrue(result);
    }
    /**
     *  created validEmailIdTest method to test for valid EmailId
     */
    @Test
    public void validEmailIdTest(){
        /*
         *  calling validEmailId method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validEmailId();
        Assertions.assertTrue(result);
    }
}
