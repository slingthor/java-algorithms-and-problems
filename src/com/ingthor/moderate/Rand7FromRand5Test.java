package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 28/06/2017.
 */
class Rand7FromRand5Test {
    @Test
    void rand7FromRand5() {
        Rand7FromRand5 rand = new Rand7FromRand5();
        for(int i = 0; i < 200; i++)
        {
            int num = rand.Rand7FromRand5();

            System.out.println(num);
        }
    }

}