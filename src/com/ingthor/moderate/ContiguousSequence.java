package com.ingthor.moderate;

/**
 * Created by Ingthor on 27/06/2017.
 */
public class ContiguousSequence
{
    //byrja med naive backtracking

    public int FindSequence(int arr[])
    {
        int maxSum = 0;
        int currSum = 0;
        //try all sample space
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]+currSum > 0)
            {
                currSum+= arr[i];
                if(currSum > maxSum)
                    maxSum = currSum;
            }
            else
            {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
