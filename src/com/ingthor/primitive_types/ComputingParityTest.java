package com.ingthor.primitive_types;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class ComputingParityTest {
    @Test
    void parity()
    {
        ComputingParity computingParity = new ComputingParity();
        Assert.assertTrue(computingParity.Parity(4));
    }

}