package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbersList = new int[5];
        numbersList[0] = 5;
        numbersList[1] = 5;
        numbersList[2] = 5;
        numbersList[3] = 5;
        numbersList[4] = 0;
        //When
        double result = ArrayOperations.getAverage(numbersList);
        System.out.println(result);
        //Then
        Assert.assertEquals(4, result, 0.001);
    }
}
