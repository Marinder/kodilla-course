package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        TaskQueue taskQueueJohnMac = new TaskQueue("John Mac");
        TaskQueue taskQueueKatrinaMec = new TaskQueue("Katrina Mec");
        Master johnSmith = new Master("John Smith");
        Master ivoneEscobar = new Master("Ivone Escobar");

        taskQueueJohnMac.registerObserver(johnSmith);
        taskQueueKatrinaMec.registerObserver(ivoneEscobar);

        // When
        taskQueueJohnMac.addTask("Task 23.2");
        taskQueueJohnMac.addTask("Task 23.4");
        taskQueueKatrinaMec.addTask("Task 2.2");
        taskQueueJohnMac.addTask("Task 23.3");
        taskQueueKatrinaMec.addTask("Task 2.3");
        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
    }
}
