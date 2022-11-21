package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog1(){
        //Given
        Logger.getInstance();
        //When
        Logger.getInstance().log("Log 1");
        Logger.getInstance().log("Log 2");
        //Then
        assertEquals("Log 2",Logger.getInstance().getLastLog());

    }
}
