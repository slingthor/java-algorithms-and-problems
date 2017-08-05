package com.ingthor.sorting_and_searching;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class SortedSearchNoSize
{
    public boolean Search(int[] arr, int value)
    {
        int high = FindHigh(arr);
        int low = 0;
        BinarySearch bs = new BinarySearch();
        return bs.Search(arr, value);
    }

    private int FindHigh(int[] arr)
    {
        int low = 0;
        int high = Integer.MAX_VALUE;
        return FindHighRecursive(arr, low, high);
    }

    private int FindHighRecursive(int[] arr, int low, int high)
    {
        int middle = (low+high)/2;

        if(arr[middle-1] != -1 && arr[middle] == -1)
            return middle;
        if(arr[middle+1] == -1 && arr[middle] != -1)
            return middle+1;
        if(arr[middle] == -1)
        {
            return FindHighRecursive(arr, low, middle-1);
        }
        return FindHighRecursive(arr, middle+1, high);
    }
}
