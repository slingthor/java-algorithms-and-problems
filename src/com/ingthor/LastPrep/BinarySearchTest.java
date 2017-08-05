package com.ingthor.LastPrep;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 10/07/2017.
 */
class BinarySearchTest {

    @Test
    public void Test()
    {
        int[] arr = new int[]{0,3,6,2,4,9};
        BS bs = new BS();
        boolean found = bs.search(arr, 0);
        Assert.assertTrue(found);
    }
}