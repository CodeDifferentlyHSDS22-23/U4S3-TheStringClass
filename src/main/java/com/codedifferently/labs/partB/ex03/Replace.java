package com.codedifferently.labs.partB.ex03;

public class Replace {
    public static String sentence(){
        String response = "Using StRing Replace to Replace chaRacteR";
        String sentence = "Using String replace to replace character";
        /** Your code goes here*/
        String newString = sentence.replaceFirst("r", "R");

        //response += newString;

        return response;
    }
    public static void main(String[] args) {
        String sentenceOutput = sentence();
        System.out.println(sentenceOutput);
    }
}
