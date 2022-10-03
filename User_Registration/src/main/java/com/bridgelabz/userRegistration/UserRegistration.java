package com.bridgelabz.userRegistration;

import java.util.regex.Pattern;
/**
 *  author Shreyash Jadhav
 */
public class UserRegistration {
    /**
     *  created validFirstName method to check for valid first name and method have return type boolean
     */
    public boolean validFirstName() throws CustomException {
        /*
         *  Taking first name as "Shreyash"
         *  Checking Whether first name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         *  if Pattern matches firstName return true
         *  else throw CustomException and print message to enter valid details
         */
        String firstName = "Shreyash";
        if (Pattern.matches("[A-Z][a-z]{2,}",firstName) == false) {
            throw new CustomException("\n Enter valid First Name");
        }
        return true;
    }
    /**
     *  created validLastName method to check for valid last name and method have return type boolean
     */
    public boolean validLastName() throws CustomException {
        /*
         *  Taking last name as "Jadhav"
         *  Checking Whether last name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         *  if Pattern matches lastName return true
         *  else throw CustomException and print message to enter valid details
         */
        String lastName = "jadhav";
        if (Pattern.matches("[A-Z][a-z]{2,}",lastName) == false) {
            throw new CustomException("\n Enter valid Last Name");
        }
        return true;
    }
    /**
     * created validEmailId method to check for valid Email ID and method have return type boolean
     */
    public boolean validEmailId(String emailID) throws CustomException {
        /*
         *  Taking Email ID as "shreyash1234@gmail.com"
         *  Checking Whether email ID is valid or not for below conditions
         *  Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
         *  with precise @ and . positions
         *  Given Email Example is  abc.xyz@bl.co.in
         *  if Pattern matches emailID return true
         *  else throw CustomException and print message to enter valid details
         */
        String regexPattern = "[A-z\\d]+[.]?[-+A-z\\d]+@[A-z\\d]+[.]?[A-z]*[.][A-z,]{2,}";
        if (Pattern.matches(regexPattern,emailID) == false) {
         throw new CustomException("\n Enter valid EmailID");
        }
        return true;
    }
    /**
     * created validMobileNumber method to check for valid Mobile Number and method have return type boolean
     */
    public boolean validMobileNumber() throws CustomException {
        /*
         *  Taking Mobile Number "91 9876543210"
         *  Checking Whether Mobile Number is valid or not for below conditions
         *  2 digit country code follow by space and 10 digits number
         *  Example for Mobile Format is  "91 9919819801"
         *  if Pattern matches mobileNumber return true
         *  else throw CustomException and print message to enter valid details
         */
        String mobileNumber = "91 9876543210";
        String regexPattern = "\\d{2}\\s\\d{10}";
        if (Pattern.matches(regexPattern,mobileNumber) == false) {
            throw new CustomException("\n Enter valid Mobile Number");
        }
        return true;
    }
    /**
     * created validPassword method to check for valid Password and method have return type boolean
     */
    public boolean validPassword() throws CustomException {
        /*
         *  Taking Password as "Shreyash@12345"
         *  Checking Whether Password is valid or not for below conditions
         *  It should have minimum 8 characters and At least 1 Upper Case
         *  It should have At least 1 numeric number and exactly 1 special character
         *  if Pattern matches password return true
         *  else throw CustomException and print message to enter valid details
         */
        String password = "Shreyash@12345";
        String regexPattern = "^(?=.{8,})(?=.*?[A-Z])(?=.*?\\d)(?=.*\\W).*$";
        if (Pattern.matches(regexPattern,password) == false) {
            throw new CustomException("\n Enter valid Password");
        }
        return true;
    }
}