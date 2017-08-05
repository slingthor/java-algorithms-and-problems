package com.ingthor.dynamic_programming;

/**
 * Created by Ingthor on 07/05/2017.
 */
public class TripleStep_8_1
{
    int TripleStep(int steps)
    {
        if(steps == 0)
            return 0;
        if(steps == 1)
            return 1;
        if(steps == 2)
            return 2;
        if(steps  == 3)
            return 4;
        if(steps > 3)
        {
            return 4*(TripleStep(steps-3));
        }
        return 0;
    }

}
