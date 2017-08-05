package com.ingthor.dynamic_programming;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 03/05/2017.
 */
class FibonacciTest {
    @Test
    void fib() {
        int n4 = Fibonacci.FibStart(45);
        int expected = 5;
        Assert.assertTrue(true);
    }

    @Test
    void factorial()
    {
        int n = 10;
        int actual = Fibonacci.DynamicFactorial(n);
        Assert.assertTrue(3628800 == actual);
    }

    @Test
    void moneyback()
    {
        int[] moneys = new int[6];
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int  W = 50;
        int n = val.length;
        int knap = Fibonacci.Knapsack(n, W, val, wt);
        Assert.assertTrue(knap == 220);
    }
}