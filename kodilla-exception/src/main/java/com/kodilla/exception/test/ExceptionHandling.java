package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
             System.out.println(secondChallenge.probablyIWillThrowException(2,2.5));
        } catch (Exception e){
            System.out.println("Oh no! Something went wrong! Enter other values for x or y.");
        } finally {
            System.out.println("END");
        }
    }
}
