package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 27/06/2017.
 */
class SubsortTest {
    @Test
    void findLongestUnsortedRoutine()
    {
        Subsort subsort = new Subsort();
        int[] arr = new int[]{1,2,4,7,10,11,7,12,6,7,16,18,19};
        Pair indicies = subsort.FindLongestUnsortedRoutine(arr);
        Assert.assertTrue(indicies.First == 3 && indicies.Second == 9);
    }

}