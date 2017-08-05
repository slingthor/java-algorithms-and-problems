package com.ingthor.TopCoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 03/06/2017.
 */
class TriangleEasyTest {
    @Test
    void find() {
        TriangleEasy triangleEasy = new TriangleEasy();
        int n = 6;
        int[] x = {0,0,2};

        int[] y = {3,1,4};
        int missing = triangleEasy.find(n,x,y);
        Assert.assertEquals(missing, 1);
    }

}