package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 27/06/2017.
 */
class PondSizesTest {
    @Test
    void findPondSize()
    {
        int[][] landscape = new int[4][4];
        landscape[0][0] = 0;
        landscape[1][0] = 2;
        landscape[2][0] = 1;
        landscape[3][0] = 0;
        landscape[0][1] = 0;
        landscape[1][1] = 1;
        landscape[2][1] = 0;
        landscape[3][1] = 1;
        landscape[0][2] = 1;
        landscape[1][2] = 1;
        landscape[2][2] = 0;
        landscape[3][2] = 1;
        landscape[0][3] = 0;
        landscape[1][3] = 1;
        landscape[2][3] = 0;
        landscape[3][3] = 1;

        PondSizes pondSizes = new PondSizes();
        ArrayList<Integer> actualSizes = pondSizes.FindPondSize(landscape);
        Assert.assertTrue(actualSizes.get(0) == 2);
        Assert.assertTrue(actualSizes.get(1) == 1);
        Assert.assertTrue(actualSizes.get(2) == 4);
    }

}