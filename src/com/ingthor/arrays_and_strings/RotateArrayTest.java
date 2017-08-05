package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 10/06/2017.
 */
class RotateArrayTest {
    @Test
    void rotate()
    {
        int[] arr = new int[]{1,2,3,4,5};
        int[] expected = new int[]{4,5,1,2,3};
        RotateArray rotateArray = new RotateArray(arr);
        int[] rotated = rotateArray.Rotate(2);
        Assert.assertTrue(Arrays.equals(expected,rotated));
    }

}