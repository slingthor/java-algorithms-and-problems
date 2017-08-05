package com.ingthor.RandomProblems;

/**
 * Created by Ingthor on 06/06/2017.
 */
public class Factorial
{
    private int n;
    public Factorial(int n)
    {
        this.n = n;
    }

    public int GetFactorial()
    {
        return fac(0, 0);
    }

    private int fac(int m, int currVal)
    {
        if(m > n)
        {
            return currVal;
        }
        if(m == 0)
           return fac(1, 1);
        else
        {
           return fac(m+1,currVal*m);
        }
    }
}
