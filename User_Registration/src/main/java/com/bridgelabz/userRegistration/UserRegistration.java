package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;
/**
 *  author Shreyash Jadhav
 */
public class UserRegistration {
    /**
     *  created validFirstName method to check for valid first name and method have return type boolean
     */
    public boolean validFirstName() {
        /*
         *  Taking first name as "Shreyash"
         *  Checking Whether first name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         *  if Pattern matches firstName return true else return false
         */
        String firstName = "Shreyash";
        return Pattern.matches("[A-Z][a-z]{2,}",firstName);
    }
    /**
     *  created validLastName method to check for valid last name and method have return type boolean
     */
    public boolean validLastName() {
        /*
         *  Taking last name as "Jadhav"
         *  Checking Whether last name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         *  if Pattern matches lastName return true else return false
         */
        String lastName = "Jadhav";
        return Pattern.matches("[A-Z][a-z]{2,}",lastName);
    }
    /**
     * created validEmailId method to check for valid Email ID and method have return type boolean
     */
    public boolean validEmailId(String emailID) {
        /*
         *  Taking Email ID as "shreyash1234@gmail.com"
         *  Checking Whether email ID is valid or not for below conditions
         *  Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
         *  with precise @ and . positions
         *  Given Email Example is  abc.xyz@bl.co.in
         *  if Pattern matches emailID return true else return false
         */
        String regexPattern = "[A-z\\d]+[.]?[-+A-z\\d]+@[A-z\\d]+[.]?[A-z]*[.][A-z,]{2,}";
        return Pattern.matches(regexPattern,emailID);
    }
    /**
     * created validMobileNumber method to check for valid Mobile Number and method have return type boolean
     */
    public boolean validMobileNumber() {
        /*
         *  Taking Mobile Number "91 9876543210"
         *  Checking Whether Mobile Number is valid or not for below conditions
         *  2 digit country code follow by space and 10 digits number
         *  Example for Mobile Format is  "91 9919819801"
         *  if Pattern matches mobileNumber return true else return false
         */
        String mobileNumber = "91 9876543210";
        String regexPattern = "\\d{2}\\s\\d{10}";
        return Pattern.matches(regexPattern,mobileNumber);
    }
    /**
     * created validPassword method to check for valid Password and method have return type boolean
     */
    public boolean validPassword() {
        /*
         *  Taking Password as "Shreyash@12345"
         *  Checking Whether Password is valid or not for below conditions
         *  It should have minimum 8 characters and At least 1 Upper Case
         *  It should have At least 1 numeric number and exactly 1 special character
         *  if Pattern matches password return true else return false
         */
        String password = "Shreyash@12345";
        String regexPattern = "^(?=.{8,})(?=.*?[A-Z])(?=.*?\\d)(?=.*\\W).*$";
        return Pattern.matches(regexPattern,password);
    }
}