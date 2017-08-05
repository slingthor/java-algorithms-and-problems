package com.ingthor.LastPrep;

import java.util.Arrays;

/**
 * Created by Ingthor on 10/07/2017.
 */
public class Fibonacci
{
    int[] memo;

    public int GetFib(int n)
    {
        memo = new int[n];
        Arrays.fill(memo, -1);
        return FibRecursive(n-1);
    }

    public int FibRecursive(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(memo[n] != -1)
        {
            return memo[n];
        }
        else
        {
           memo[n] = FibRecursive(n-1)+FibRecursive(n-2);
           return memo[n];
        }
    }

}
