package com.ingthor.chef;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by Ingthor on 05/06/2017.
 */
class KnapSackTest {
    @Test
    void getCost()
    {
        KnapSack knapSack = new KnapSack("knapsack.txt");
        Integer[] costs = knapSack.GetCost();
        Integer[] expected = new Integer[]{1,5,6,9,10,12,13,14,15};
        Assert.assertTrue(Arrays.equals(costs, expected));
    }

}