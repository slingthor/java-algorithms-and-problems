package com.ingthor.interview_cake;

/**
 * Created by Ingthor on 11/06/2017.
 */
public class FindDublicate
{
    int[] integers;
    FindDublicate(int[] integers)
    {
        this.integers = integers;
    }

    public Integer FindTheDublicate()
    {
        for(int i=0; i < integers.length;i++)
        {
            for(int j = i+1; j < integers.length;j++)
            {
                if(integers[i] == integers[j])
                    return integers[i];
            }
        }
        return null;
    }
}
