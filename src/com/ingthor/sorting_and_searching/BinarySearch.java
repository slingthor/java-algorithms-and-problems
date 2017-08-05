package com.ingthor.sorting_and_searching;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class BinarySearch
{
    public boolean Search(int[] arr, int value)
    {
        int hi = arr.length-1;
        int lo = 0;
        return search(arr, value, lo, hi);
    }

    private boolean search(int[] arr, int value, int low, int high)
    {
        int middle = (low+high)/2;
        if(arr[middle] == value)
            return true;
        if(low < high)
        {
            if(arr[middle] < value)
            {
                return search(arr, value, middle+1, high);
            }
            else
            {
                return search(arr, value, low, middle-1);
            }
        }
        return false;
    }
}
