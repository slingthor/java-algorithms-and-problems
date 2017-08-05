package com.ingthor.interview_cake;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 11/06/2017.
 */
class Rand7Test {
    @Test
    void getRand()
    {
        ArrayList<Integer> possibleOutcomes = new ArrayList<>();
        for(int i = 0; i < 10000;i++)
        {
            possibleOutcomes.add(Rand7.GetRand());
        }

        for(Integer possibleOutcome : possibleOutcomes)
        {
            Assert.assertTrue(possibleOutcome < 8 && possibleOutcome > 0);
        }
        for(int i = 1; i < 8; i++)
        {
            Assert.assertTrue(possibleOutcomes.contains(i));
        }
    }

}