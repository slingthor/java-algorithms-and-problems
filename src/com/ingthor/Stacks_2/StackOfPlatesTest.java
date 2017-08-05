package com.ingthor.Stacks_2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.management.OperationsException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 17/06/2017.
 */
class StackOfPlatesTest {
    @Test
    void isEmpty() {
        StackOfPlates stack = new StackOfPlates(10);
        Assert.assertTrue(stack.IsEmpty());
        stack.Push(2);
        Assert.assertTrue(stack.IsEmpty() == false);
        try {
            Assert.assertEquals(2, stack.Pop());
        } catch (OperationsException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(stack.IsEmpty());
    }

    @Test
    void push() {
        StackOfPlates stack = new StackOfPlates(10);
        stack.Push(2);
        try {
            Assert.assertEquals(2, stack.Pop());
        } catch (OperationsException e) {
            e.printStackTrace();
        }
    }

}