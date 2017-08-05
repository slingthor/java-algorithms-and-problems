package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class LongestContiguousIncreasingSubArray
{
    public int[] LongestIncreasingSubArray(int[] arr)
    {
        int bestStartingIndex = 0;
        int bestEndingIndex = 0;
        int currStartingIndex = 0;
        int currEndingIndex =0;
        int maxLength = 0;
        int last = arr[0];
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] > last)
            {
                currEndingIndex = i;
            }
            else
            {
                int currLength = currEndingIndex - currStartingIndex;
                if((currLength) > maxLength)
                {
                    bestStartingIndex = currStartingIndex;
                    bestEndingIndex = currEndingIndex;
                    maxLength = currLength;
                }
                currStartingIndex = i;
                currEndingIndex = i;
            }

            int currLength = currEndingIndex - currStartingIndex;
            if((currLength) > maxLength)
            {
                bestStartingIndex = currStartingIndex;
                bestEndingIndex = currEndingIndex;
                maxLength = currLength;
            }
        }

        return new int[]{bestStartingIndex, bestEndingIndex};
    }
}
