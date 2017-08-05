package com.ingthor.sorting_and_searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by Ingthor on 24/06/2017.
 */
class SortedMergeTest {
    @Test
    void sortMerge() {
        int[] a = new int[]{0,2,4,6,8,-1,-1,-1};
        int[] b = new int[]{1,3,5};
        SortedMerge sortedMerge = new SortedMerge();
        sortedMerge.SortMerge(a,b);
        int[] expected = new int[]{0,1,2,3,4,5,8};
        Assert.assertTrue(Arrays.equals(a, expected));
    }

}