package com.ingthor.moderate;

/**
 * Created by Ingthor on 28/06/2017.
 */
public class SumSwap
{
    //We can use a hashtable with all a value differences and then look for that difference in b
    Pair SwapSums(int a[], int b[])
    {
        int totalSumA = 0;
        for (int i : a) {
            totalSumA+=i;
        }
        int totalSumB = 0;
        for (int i : b) {
            totalSumB+=i;
        }

        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < b.length; j++)
            {
                if((totalSumA - a[i] + b[j]) == (totalSumB-b[j]+a[i]))
                {
                    return new Pair(a[i], b[j]);
                }
            }
        }
        return null;
    }
}
