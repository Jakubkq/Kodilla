package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog1(){
        //Given
        Logger.getInstance();
        //When
        Logger.getInstance().log("Log 1");
        Logger.getInstance().log("Log 2");
        //Then
        Assert.assertEquals("Log 2",Logger.getInstance().getLastLog());

    }
}
