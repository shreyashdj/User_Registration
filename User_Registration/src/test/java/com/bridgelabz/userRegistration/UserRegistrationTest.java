package com.bridgelabz.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author - Shreyash Jadhav
 */
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();     // created object of class UserRegistration
    /**
     *  created validFirstNameTest method to test for valid first name
     */
    @Test
    public void validFirstNameTest() throws CustomException {
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
    public void validLastNameTest() throws CustomException {
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
    public void validMobileNumberTest() throws CustomException {
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
    public void validPasswordTest() throws CustomException {
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
     *  used ParameterizedTest and ValueSource to test multiple EmailID's
     */
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc1.com", "abc+100@gmail.com"})
    public void validEmailIdTest(String emailId) throws CustomException {
        /*
         *  calling validEmailId method and
         *  using assertTrue method of class Assertions
         *  checking expected (true) and actual output are equal or not
         *  if true then Test passed otherwise failed
         */
        boolean result = userRegistration.validEmailId(emailId);
        Assertions.assertTrue(result);
    }
}
