package com.ingthor.hackerrank;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 11/06/2017.
 */
class FactorialTest {
    @Test
    void get() {
        Factorial factorial = new Factorial(7);
        int actual = factorial.Get();
        int expected = 5040;
        Assert.assertTrue(actual == expected);
    }

}