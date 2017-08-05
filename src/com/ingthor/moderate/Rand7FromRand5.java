package com.ingthor.moderate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ingthor on 28/06/2017.
 */
public class Rand7FromRand5 {

    int sampleSpace = (int) Math.pow(5, 7);
    public int Rand7FromRand5() {

        int event = Rand5()+1;
        for(int i = 0; i < 6; i++)
        {
            event = event*Rand5()+1;
        }
        float newSampleSpace = sampleSpace/5;
        float newEventSpace = event/5;
        return (int) (newSampleSpace/newEventSpace);
    }

    private int Rand5()
    {
        return ThreadLocalRandom.current().nextInt(6);
    }
}
