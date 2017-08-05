package com.ingthor.Stacks_2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.management.OperationsException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 17/06/2017.
 */
class StackTest {
    @Test
    void isEmpty() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.IsEmpty());
        stack.Push(2);
        Assert.assertTrue(stack.IsEmpty() == false);
        try {
            Assert.assertEquals(2, stack.Pop());
            Assert.assertTrue(stack.IsEmpty());
        } catch (OperationsException e) {
        }
    }

    @Test
    void push() {
        Stack stack = new Stack();
        stack.Push(2);
        try {
            Assert.assertEquals(2, stack.Pop());
        } catch (OperationsException e) {
        }
    }

}