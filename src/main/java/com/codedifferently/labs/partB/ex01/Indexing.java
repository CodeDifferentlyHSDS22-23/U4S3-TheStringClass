package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "";
        String myStr = "Hello planet earth, you are a great planet.";
        /* Your code goes here*/

        //find the index of the first 'e'
        int firstEIndex = myStr.indexOf("e");

        //find the index of 'e' after the first one
        int nextEIndex = myStr.indexOf("e", firstEIndex + 1);

        response = String.valueOf(nextEIndex);
        return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


