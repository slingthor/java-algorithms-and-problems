package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class TicTacWinTest {
    @Test
    void anyVictory()
    {
        char[][] table = new char[3][3];

        table[0][0] = 'x';
        table[0][1] = 'x';
        table[0][2] = 'x';

        TicTacWin ticTacWin = new TicTacWin(table);
        Assert.assertTrue(ticTacWin.AnyVictory());
    }

    @Test
    void notnyVictory()
    {
        char[][] table = new char[3][3];

        table[0][0] = 'x';
        table[0][1] = 'x';

        TicTacWin ticTacWin = new TicTacWin(table);
        Assert.assertFalse(ticTacWin.AnyVictory());
    }

    @Test
    void TestingSomeCode()
    {
        System.out.println(1000%100);
        Assert.assertFalse(false);
    }

}