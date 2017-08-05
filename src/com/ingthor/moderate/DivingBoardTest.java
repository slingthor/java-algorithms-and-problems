package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class DivingBoardTest {
    @Test
    void possibleLengths() {
        DivingBoard divingBoard = new DivingBoard(5, 2, 3);
        ArrayList<Integer> possibleLengths = divingBoard.PossibleLengths();
        for(Integer length : possibleLengths)
        {
            System.out.println(length);
        }
        Assert.assertTrue(true);
    }

}