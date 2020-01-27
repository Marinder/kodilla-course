package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {2,2,2,2,2,5,5,5,5,5,1,1,1,1,1,10,10,10,10,10};

        //When
        double average1 = 4.5;
        double average2 = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(average1,average2,0.001);


    }
}
