package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class LongestContiguousIncreasingSubArrayTest {
    @Test
    void longestIncreasingSubArray()
    {
        LongestContiguousIncreasingSubArray longestSequence = new LongestContiguousIncreasingSubArray();

        int[] testArray = new int[]{0,1,0,2,3,4,5,0,2,3,4,5,6,7,9};
        int[] results = longestSequence.LongestIncreasingSubArray(testArray);

        Assert.assertTrue(results[0] == 7 && results[1] == 14);
    }

}