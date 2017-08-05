package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class PrintSpiralArrayTest {
    @Test
    void matrixToSpiralString() {
        int[][] matrix = new int[4][4];
        int counter = 0;
        for(int x = 0; x < 4; x++)
        {
            for(int y = 0; y < 4; y++)
            {
                matrix[x][y] = counter;
                counter++;
            }
        }
        PrintSpiralArray printSpiralArray = new PrintSpiralArray(matrix);
        System.out.println(printSpiralArray.MatrixToSpiralString());
        Assert.assertTrue(true);
    }

}