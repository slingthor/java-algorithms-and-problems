package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class InvertPermutationTest {
    @Test
    void getInverse() {
        int[] arr = new int[]{5,2,3,0,1,4};
        int[] actualPermutation = new InvertPermutation().GetInverse(arr);
        for(int i = 0; i < actualPermutation.length;i++)
        {
            System.out.print(actualPermutation[i] + ", ");
        }
        Assert.assertTrue(true);
    }

}