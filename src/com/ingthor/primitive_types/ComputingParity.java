package com.ingthor.primitive_types;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class ComputingParity
{
    boolean Parity(int integer)
    {
        int oneCount = 0;
        for(int i = 0; i < Integer.SIZE;i++)
        {
            int mask = 1 << i;
            if((integer & mask) != 0)
                oneCount++;
        }
        return oneCount%2 == 1;
    }
}
