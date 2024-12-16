package com.codedifferently.labs.partB.ex02;

public class Concatenate {
    public static String concatenateStrings() {
            String response = "";
        /* Your code goes here*/

        //first and last name variables
        String firstName = "Abe";
        String lastName = "Lincoln";

        String fullName = firstName + " " + lastName;

        response = fullName;

        return response;
    }

    public static void main(String[] args) {
        String stringOutput = concatenateStrings();
        System.out.println(stringOutput);

    }
}
