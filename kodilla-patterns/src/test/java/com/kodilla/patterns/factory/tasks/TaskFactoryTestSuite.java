package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertFalse(shopping.isTaskExecuted());
        assertEquals("Task shopping is executed. You need buy 8.0 onions", shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());

    }

    @Test
    public void testPaintingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertFalse(painting.isTaskExecuted());
        assertEquals("Task painting is executed. You need to paint on white colour garage", painting.executeTask());
        assertTrue(painting.isTaskExecuted());

    }

    @Test
    public void testDrivingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertFalse(driving.isTaskExecuted());
        assertEquals("Task driving is executed. You need go by car to Cracov", driving.executeTask());
        assertTrue(driving.isTaskExecuted());

    }


}

