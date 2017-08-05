package com.ingthor.moderate;

import java.util.Arrays;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class SmallestDifference
{
    public OutPutPair FindDifference(int[] arr1, int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int firstIter = 0;
        int secondIter = 0;

        int minDifference = Integer.MAX_VALUE;
        OutPutPair ownerOfMinDifference = null;

        while(firstIter < arr1.length && secondIter < arr2.length)
        {
            int currDifference = Math.abs(arr1[firstIter]-arr2[secondIter]);
            if(currDifference < minDifference)
            {
                minDifference = currDifference;
                ownerOfMinDifference = new OutPutPair(arr1[firstIter], arr2[secondIter]);
            }


            if((arr1[firstIter] < arr2[secondIter] && firstIter < arr1.length) || secondIter >= arr2.length)
            {
                firstIter++;
            }
            else
            {
                secondIter++;
            }
        }
        return ownerOfMinDifference;
    }

    public class OutPutPair
    {
        public int Num1;
        public int Num2;

        public OutPutPair(int num1, int num2) {
            Num1 = num1;
            Num2 = num2;
        }
    }
}
