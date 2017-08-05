package com.ingthor.Sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 30/04/2017.
 */
class SortTests {
    @Test
    void sort() {
        int[] arrayToTest = new int[10];
        arrayToTest[0] = 5;
        arrayToTest[1] = 10;
        arrayToTest[2] = 7;
        arrayToTest[3] = 2;
        arrayToTest[4] = 19;
        arrayToTest[5] = 17;
        arrayToTest[6] = 1;
        arrayToTest[7] = 13;
        arrayToTest[8] = 18;
        arrayToTest[9] = 20;
        Sort sort = new QuickSort();
        sort.Sort(arrayToTest);
        boolean broken = false;
        for(int i = 0; i < 10; i++)
        {
            if(i > 0)
            {
                if(arrayToTest[i] > arrayToTest[i-1])
                    broken = true;
            }
        }
        Assert.assertFalse(broken);
    }

    @Test
    void SortedMergeTest()
    {
        int[] A = new int[10];
        int[] B = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 4;
        A[3] = 9;
        A[4] = 11;

        B[0] = 3;
        B[1] = 5;
        B[2] = 7;
        B[3] = 8;
        B[4] = 12;

        int[] expected = new int[10];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
        expected[5] = 7;
        expected[6] = 8;
        expected[7] = 9;
        expected[8] = 11;
        expected[9] = 12;

        SortedMerge_10_1 sortedMerge = new SortedMerge_10_1();
        sortedMerge.SortedMerge(A,B);

        Assert.assertTrue(Arrays.equals(A, expected));
    }
}