package com.bridgelabz.userRegistration;
/**
 *  author Shreyash Jadhav
 */
public class Main {
    /**
     *  main method to run project
     */
    public static void main(String[] args) {
        /*
         *  created object of class UserRegistration
         *  calling validFirstName method
         *  calling validLastName method
         */
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
    }
}