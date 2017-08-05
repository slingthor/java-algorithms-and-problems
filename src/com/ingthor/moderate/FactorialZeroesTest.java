package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class FactorialZeroesTest {
    @Test
    void numberOFTrailingZeroes() {
        FactorialZeroes factorialZeroes = new FactorialZeroes();
        int fac = factorialZeroes.GetFactorial(10);
        Assert.assertTrue(factorialZeroes.NumberOFTrailingZeroes(fac) == 2);
    }

    @Test
    void getFactorial() {
        FactorialZeroes factorialZeroes = new FactorialZeroes();
        int fac = factorialZeroes.GetFactorial(10);
        Assert.assertTrue(fac == 3628800);
    }

}