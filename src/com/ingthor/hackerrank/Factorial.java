package com.ingthor.hackerrank;

/**
 * Created by Ingthor on 11/06/2017.
 */
public class Factorial
{
    int n;
    public Factorial(int n)
    {
        this.n = n;
    }

    public int Get()
    {
        return RecursiveFactorial(n, 1);
    }

    private int RecursiveFactorial(int n, int current)
    {
        if(n == 0)
            return current;
        else
            return RecursiveFactorial(n-1, current*n);
    }
}

