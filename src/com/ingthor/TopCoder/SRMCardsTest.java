package com.ingthor.TopCoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 14/05/2017.
 */
class SRMCardsTest {
    @Test
    void maxTurns()
    {
        int[] testArr = new int[2];
        testArr[0] = 498;
        testArr[1] = 499;
        SRMCards cards = new SRMCards();
        int actual = cards.maxTurns(testArr);
        int expected = 1;
        Assert.assertEquals(1, expected);
    }


    @Test
    void maxTurns2()
    {
        int[] testArr = new int[6];
        testArr[0] = 491;
        testArr[1] = 492;
        testArr[2] = 495;
        testArr[3] = 497;
        testArr[4] = 498;
        testArr[5] = 499;
        SRMCards cards = new SRMCards();
        int actual = cards.maxTurns(testArr);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }
}