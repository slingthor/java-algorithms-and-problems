package com.ingthor.moderate;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class FactorialZeroes
{

    public int NumberOFTrailingZeroes(int factorialNumber)
    {
        if(factorialNumber < 10)
            return 0;

        int count = 0;
        int modNum = 1;

        while(true)
        {
            modNum*=10;
            if(factorialNumber%modNum == 0)
            count++;
            else break;
        }
        return count;
    }

    public int GetFactorial(int n)
    {
        int totalFactorial = 1;

        if(n == 0 || n == 1)
            return 1;

        for(int i = 2; i < n+1;i++)
        {
            totalFactorial = totalFactorial*i;
        }
        return  totalFactorial;
    }
}
