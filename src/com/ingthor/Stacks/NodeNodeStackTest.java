package com.ingthor.Stacks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 08/04/2017.
 */
class NodeNodeStackTest {
    @Test
    void pop() {
        Stack stack = new NodeNodeStack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        Assert.assertTrue(stack.Pop() == 3);
        Assert.assertTrue(stack.Count() == 2);
    }

    @Test
    void push() {
        Stack stack = new NodeNodeStack();
        stack.Push(2);
        Assert.assertTrue(stack.Peek() == 2);
    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty1() {
        Stack stack = new NodeNodeStack();
        Assert.assertTrue(stack.isEmpty());
    }
    @Test
    void isEmpty2() {
        Stack stack = new NodeNodeStack();
        stack.Push(1);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    void isEmpty3() {
        Stack stack = new NodeNodeStack();
        stack.Push(1);
        stack.Pop();
        Assert.assertTrue(stack.isEmpty());
    }

}