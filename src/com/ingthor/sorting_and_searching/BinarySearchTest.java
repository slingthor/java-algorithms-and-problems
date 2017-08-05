package com.ingthor.sorting_and_searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 24/06/2017.
 */
class BinarySearchTest {
    @Test
    void search() {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        BinarySearch bs = new BinarySearch();
        Assert.assertTrue(bs.Search(arr, 5));
    }

    @Test
    void searchNotFound() {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        BinarySearch bs = new BinarySearch();
        Assert.assertFalse(bs.Search(arr, 11));
    }
}