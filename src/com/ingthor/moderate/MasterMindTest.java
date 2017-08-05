package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 26/06/2017.
 */
class MasterMindTest {

    @Test
    void TestMasterMind()
    {
        MasterMind masterMind = new MasterMind(Color.Red,Color.Green, Color.Blue, Color.Yellow);
        MasterMind.Answer answer = masterMind.Guess(Color.Green, Color.Green, Color.Red, Color.Red);

        Assert.assertTrue(answer.FullGuesses == 1 && answer.PseudoGuesses == 1);
    }
}