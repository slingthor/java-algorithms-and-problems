package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.invoke.MutableCallSite;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class OperationsTest {
    @Test
    void subtract()
    {
        Operations operations = new Operations();
        int actual = operations.Subtract(4, 2);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }


    @Test
    void subtract2()
    {
        Operations operations = new Operations();
        int actual = operations.Subtract(222, 22);
        int expected = 200;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void multiply()
    {
        Operations operations = new Operations();
        int actual = operations.Multiply(2,4);
        int expected = 8;
        Assert.assertEquals(actual, expected);
    }
}