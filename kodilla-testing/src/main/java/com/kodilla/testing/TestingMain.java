package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args) {
        // dlatego, że mel
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = ((SimpleUser) simpleUser).getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        System.out.println("Test - pierwszy test jednostkowy: ");
        /* dlatego, że metoda statyczna, odwołuję się bezpośrednio przez nazwę klasy
        (zmienne statyczne klasy dotyczą wszystkich jej obiektów) */
        int result1 = Calculator.add(3,8);
        int result2 = Calculator.subtract(3,8);
        if (result1==11 && result2==5) {
            System.out.println("pierwszy test jednostkowy ok");
        } else {
            System.out.println("pierwszy test jednostkowy - error !");
        }

    }
}
