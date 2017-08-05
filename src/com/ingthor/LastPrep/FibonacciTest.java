package com.ingthor.LastPrep;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 10/07/2017.
 */
class FibonacciTest {
    @Test
    void getFib() {
        Fibonacci fib = new Fibonacci();
        int actual = fib.GetFib(40);
        Assert.assertTrue(actual == 63245986 );
    }

}