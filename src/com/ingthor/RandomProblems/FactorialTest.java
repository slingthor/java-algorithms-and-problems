package com.ingthor.RandomProblems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 06/06/2017.
 */
class FactorialTest {
    @Test
    void getFactorial() {
        Factorial factorial = new Factorial(4);
        int fac4 = factorial.GetFactorial();
        Assert.assertEquals(24, fac4);
    }

}