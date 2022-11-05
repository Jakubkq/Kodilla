package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertFalse(shopping.isTaskExecuted());
        Assert.assertEquals("Task shopping is executed. You need buy 8.0 onions", shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());

    }

    @Test
    public void testPaintingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertFalse(painting.isTaskExecuted());
        Assert.assertEquals("Task painting is executed. You need to paint on white colour garage", painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());

    }

    @Test
    public void testDrivingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertFalse(driving.isTaskExecuted());
        Assert.assertEquals("Task driving is executed. You need go by car to Cracov", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());

    }


}

