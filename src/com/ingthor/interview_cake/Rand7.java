package com.ingthor.interview_cake;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ingthor on 11/06/2017.
 */
public class Rand7 {
    public static int GetRand()
    {
        int totalRand = 0;
        for(int i = 0; i < 8;i++)
        {
            totalRand += rand5();
        }
        return totalRand/5;
    }

    private static int rand5()
    {
        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }

}
