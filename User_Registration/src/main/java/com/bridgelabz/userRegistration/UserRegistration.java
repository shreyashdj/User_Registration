package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *  author Shreyash Jadhav
 */
public class UserRegistration {
    Scanner scan = new Scanner(System.in);      // scan object of Scanner class
    /**
     *  method to check for valid first name
     */
    public void validFirstName() {
        /*
         *  Taking user input for first name
         *  Checking Whether first name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         */
        System.out.print("\n Enter First Name : ");
        String firstName = scan.next();
        System.out.println(" First name is valid : " + Pattern.matches("[A-Z][a-z]{2,}",firstName));
    }
    /**
     *  method to check for valid last name
     */
    public void validLastName() {
        /*
         *  Taking user input for last name
         *  Checking Whether last name contains first letter Capital and else are small
         *  and should have minimum 3 characters
         */
        System.out.print("\n Enter Last Name : ");
        String lastName = scan.next();
        System.out.println(" Last name is valid : " + Pattern.matches("[A-Z][a-z]{2,}",lastName));
    }
    /**
     *  method to check for valid Email ID
     */
    public void validEmailId() {
        /*
         *  Taking user input for Email ID
         *  Checking Whether email ID is valid or not for below conditions
         *  Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
         *  with precise @ and . positions
         *  Given Email Example is  abc.xyz@bl.co.in
         */
        System.out.print("\n Enter Email ID : ");
        String emailID = scan.next();
        String regexPattern = "[a-zA-Z0-9]+([.][a-zA-z]+)*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        System.out.println(" Email ID is valid : " + Pattern.matches(regexPattern,emailID));
    }
    /**
     *  method to check for valid Mobile Number
     */
    public void validMobileNumber() {
        /*
         *  Taking user input for Mobile Number
         *  Checking Whether Mobile Number is valid or not for below conditions
         *  2 digit country code follow by space and 10 digits number
         *  Example for Mobile Format is  "91 9919819801"
         */
        System.out.print("\n Enter Mobile Number : ");
        scan.nextLine();
        String mobileNumber = scan.nextLine();
        String regexPattern = "\\d{2}\\s\\d{10}";
        System.out.println(" Mobile Number is valid : " + Pattern.matches(regexPattern,mobileNumber));
    }
    /**
     *  method to check for valid Password
     */
    public void validPassword() {
        /*
         *  Taking user input for Password
         *  Checking Whether Password is valid or not for below conditions
         *  It should contain minimum 8 characters and At least 1 Upper Case
         */
        System.out.print("\n Enter Password : ");
        String password = scan.next();
        String regexPattern = "^(?=.{8,})(?=.*?[A-Z]).*$";
        System.out.println(" Password is valid : " + Pattern.matches(regexPattern,password));
    }
}