package com.ingthor.Searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 11/05/2017.
 */
class SearchTest {
    @Test
    void BinarySearchTest()
    {
        BinarySearch binarySearch = new BinarySearch();

        int[] arr = new int[10];

        for(int i = 0; i < 10;i++)
        {
            arr[i] = i;
        }

        boolean found = binarySearch.Search(arr, 5);
        Assert.assertTrue(found);
    }

    @Test
    void BinarySearchOddTest()
    {
        BinarySearch binarySearch = new BinarySearch();

        int[] arr = new int[9];

        for(int i = 0; i < 9;i++)
        {
            arr[i] = i;
        }

        boolean found = binarySearch.Search(arr, 2);
        Assert.assertTrue(found);
    }

}