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
        System.out.print(" Enter First Name : ");
        String firstName = scan.next();
        System.out.println(" First name is valid : " + Pattern.matches("[A-Z][a-z]{2,}",firstName));
    }
}
