package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void saveLog(){
        Logger.getInstance().log("Log 1");
        Logger.getInstance().log("Log 2");
        Logger.getInstance().log("Log 3");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("Log 3", lastLog);
    }
}
