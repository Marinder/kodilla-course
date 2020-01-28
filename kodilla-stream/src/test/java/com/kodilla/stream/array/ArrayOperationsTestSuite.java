package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {2,2,2,2,2,5,5,5,5,5,1,1,1,1,1,10,10,10,10,10};

        //When
        double result  = 4.5;
        double expected  = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(result,expected ,0.001);


    }
}
