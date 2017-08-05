package com.ingthor.moderate;

/**
 * Created by Ingthor on 27/06/2017.
 */
public class Subsort
{
    public Pair FindLongestUnsortedRoutine(int[] arr)
    {
        int startSortedIndex = 0;
        int endSortedIndex = arr.length-1;
        //take into account if the array is sorted
        while(startSortedIndex < arr.length-1 && arr[startSortedIndex] < arr[startSortedIndex+1])
        {
            startSortedIndex++;
        }
        while(endSortedIndex > 0 && arr[endSortedIndex] > arr[endSortedIndex-1])
        {
            endSortedIndex--;
        }


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = startSortedIndex+1;i < endSortedIndex;i++)
        {
            if(arr[i] < min )
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        while(startSortedIndex > 0 && arr[startSortedIndex] > min)
        {
            startSortedIndex--;
        }

        while(endSortedIndex < arr.length-1 && arr[endSortedIndex+1] < max)
        {
            endSortedIndex++;
        }

        return new Pair(startSortedIndex, endSortedIndex);
    }
}

