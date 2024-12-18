package com.codedifferently.labs.partB.ex04;

public class Extraction {

    public static String extraction(){
        String response = "";
        String greeting = "Learning Java is a good time!";

        /* Your code goes here*/
        String part1 = greeting.substring(0, 5);
        String part2 = greeting.substring(5, 10);
        String part3 = greeting.substring(10);

        response = part1 + "\n" + part2 + "\n" + part3;

        return response;

    }
    public static void main(String[] args) {
        String extractionOutput = extraction();
        System.out.println(extractionOutput);
    }
}
