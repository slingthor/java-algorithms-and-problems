package com.ingthor.bit_manipulation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/05/2017.
 */
class BitUtilsTest {
    @Test
    void getBit() {
        int bitMask = 1;
        boolean isOne = BitUtils.GetBit(bitMask, 0);
        Assert.assertTrue(isOne);
    }

    @Test
    void getBit2() {
        int bitMask = 1;
        boolean isOne = BitUtils.GetBit(bitMask, 1);
        Assert.assertFalse(isOne);
    }

    @Test
    void TestToString()
    {
        //2^31
        int bitMask = 1073741824;
        String bitMaskString = BitUtils.MaskToString(bitMask);
        System.out.println(bitMaskString);
        Assert.assertTrue(bitMaskString.compareTo("01000000000000000000000000000000") == 0);
    }

    @Test
    void TestBuildBitMaskRange()
    {
        int start = (1 << 3);
        int end = (1 << 0);
        int expected = 0;
        for(int i = 0; i < 4; i++)
        {
            expected = BitUtils.SetBit(expected,i);
        }
        int actual = BitOperations.BuildBitMaskRange(start,end);
        Assert.assertTrue(expected == actual);
    }

    @Test
    void TestInsertion()
    {
        int start = (1 << 3);
        int end = (1 << 0);
        //actual er 00000000 00000000 00000000 00001111
        int from = 110;
        //from er 00000000 00000000 00000000 01101110
        int to = 1100;
        //to er 00000000 00000000 00000100 01001100
        int expected = 1102;
        //expected er 00000000 00000000 00000100 01001110
        int actual = BitOperations.Insertion(from, to, start,end);
        Assert.assertTrue(expected == actual);
    }

    @Test
    void FlipBitToWin()
    {
        int actualMaxLength = BitOperations.FlipBitToWin(1775);
        int expectedLength = 8;
        Assert.assertTrue(actualMaxLength == expectedLength);
    }

}