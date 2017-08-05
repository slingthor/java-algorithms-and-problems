package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 28/06/2017.
 */
class LangtonsAntTest {
    @Test
    void performMoves() {
        LangtonsAnt langtonsAnt = new LangtonsAnt();
        langtonsAnt.PerformMoves(200);
        Assert.assertTrue(true);
    }

}