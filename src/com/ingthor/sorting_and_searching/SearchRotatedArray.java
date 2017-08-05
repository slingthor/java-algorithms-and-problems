package com.ingthor.sorting_and_searching;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class SearchRotatedArray
{
    // rest is straight forward
    //assuming big arrays
    public void Search(int[] arr)
    {
        int pivot = FindPivot(arr, 0, arr.length);
    }

    private int FindPivot(int[] arr, int low, int high)
    {
        if (high < low)  return -1;
        if (high == low) return low;

        int middle = (low+high)/2;

        if(arr[middle] < arr[middle-1])
        {
            return middle;
        }
        if(arr[low] >= arr[middle])
        {
            return FindPivot(arr, low, middle-1);
        }
        return FindPivot(arr, middle+1, high);
    }
}
