package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 27/06/2017.
 */
class ContiguousSequenceTest {
    @Test
    void findSequence() {
        ContiguousSequence contiguousSequence = new ContiguousSequence();
        int[] testArr = new int[]{2,-8,3,-2,4,-10};
        int sum = contiguousSequence.FindSequence(testArr);
        Assert.assertTrue(sum == 5);
    }

}