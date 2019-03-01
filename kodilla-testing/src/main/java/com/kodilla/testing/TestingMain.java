package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = ((SimpleUser) simpleUser).getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy: ");
        Calculator calculator = new Calculator(3, 8);
        int result1 = calculator.getAdd();
        int result2 = calculator.getSubtract();
        if (result1==11 && result2==5) {
            System.out.println("pierwszy test jednostkowy ok");
        } else {
            System.out.println("pierwszy test jednostkowy - error !");
        }

    }
}
