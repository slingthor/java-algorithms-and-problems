package com.ingthor.dynamic_programming;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 07/05/2017.
 */
class TripleStep_8_1Test
{
    @Test
    public void TestSteps()
    {
        TripleStep_8_1 steps = new TripleStep_8_1();
        int actual = steps.TripleStep(8);
        int expected = 32;
        Assert.assertTrue(expected == actual);
    }
}