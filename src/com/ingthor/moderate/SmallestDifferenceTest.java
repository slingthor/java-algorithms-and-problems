package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class SmallestDifferenceTest {
    @Test
    void findDifference()
    {
        int[] testArr1 = new int[]{1,3,15,11,2};
        int[] testArr2 = new int[]{23,127,235,19,8};

        SmallestDifference smallestDifference = new SmallestDifference();
        SmallestDifference.OutPutPair difference = smallestDifference.FindDifference(testArr1, testArr2);
        Assert.assertEquals(difference.Num1, 11);
        Assert.assertEquals(difference.Num2, 8);
    }

}