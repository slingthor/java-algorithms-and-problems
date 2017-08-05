package com.ingthor.bit_manipulation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class BitSwapTest {
    @Test
    void swapBits() {
        int swapFrom = 1234567891;
        System.out.println(Integer.toBinaryString(swapFrom));
        BitSwap bitSwap = new BitSwap();
        int swapped = bitSwap.SwapBits(swapFrom, 0, 3);
        System.out.println(Integer.toBinaryString(swapped));
        Assert.assertTrue(true);
    }

}