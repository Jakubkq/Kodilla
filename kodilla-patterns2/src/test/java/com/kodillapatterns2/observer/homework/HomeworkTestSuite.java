package com.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testTaskQueues() {
        //Given
        Homework junior = new Junior();
        Homework mid = new Mid();

        Mentor bjarneS = new Mentor("Kacper Rozmaryn");
        Mentor dennisR = new Mentor("Kuba Rozmaryn");

        junior.registerTaskObserver(bjarneS);
        mid.registerTaskObserver(dennisR);

        //When
        junior.addTask("First mid for junior");
        junior.addTask("Second mid for junior");

        mid.addTask("first test mid");
        mid.addTask("second test mid");

        //Then
        assertEquals(2, bjarneS.getTaskCount());
        assertEquals(2, dennisR.getTaskCount());
    }
}
