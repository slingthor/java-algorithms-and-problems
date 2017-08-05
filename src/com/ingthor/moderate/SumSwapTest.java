package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 28/06/2017.
 */
class SumSwapTest {
    @Test
    void swapSums() {
        int[] a = new int[]{4,1,2,1,1,2};
        int[] b = new int[]{3,6,3,3};
        SumSwap sumSwap = new SumSwap();
        Pair actualOutput = sumSwap.SwapSums(a,b);
        Assert.assertTrue(IntStream.of(a).sum() -actualOutput.First+actualOutput.Second == IntStream.of(b).sum() - actualOutput.Second + actualOutput.First);
    }

}