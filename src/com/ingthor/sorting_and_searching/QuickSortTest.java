package com.ingthor.sorting_and_searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 24/06/2017.
 */
class QuickSortTest {
    @Test
    void sort() {

        char[] arr = new char[]{'c','b','a','e'};
        //QuickSort.Sort(arr);
        char[] expected = new char[]{'a','b','c','e'};
        Assert.assertTrue(Arrays.equals(arr,expected));
    }

}