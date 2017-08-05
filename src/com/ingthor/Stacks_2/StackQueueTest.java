package com.ingthor.Stacks_2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.management.OperationsException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 17/06/2017.
 */
class StackQueueTest {
    @Test
    void Test()
    {
        StackQueue stackQueue = new StackQueue();
        try {
            stackQueue.Enqueue(1);
            stackQueue.Enqueue(2);
            Assert.assertEquals(stackQueue.Deque(), 1);
            Assert.assertEquals(stackQueue.Deque(), 2);
        } catch (OperationsException e) {
            e.printStackTrace();
        }
    }
}