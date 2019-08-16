package com.kodilla.exception.test;

public class ExceptionHandling extends java.lang.Exception {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyWillThrowException(1.5, 2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Dobre praktyki");
        }
    }
}
