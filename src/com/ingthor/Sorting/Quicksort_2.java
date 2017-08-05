package com.ingthor.Sorting;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ingthor on 13/05/2017.
 */
public class Quicksort_2
{
    public void QuickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int p = Partition(arr, low, high);
            if(p > 0)
            {
                QuickSort(arr, low, p-1);
            }
            if(p < arr.length)
            {
                QuickSort(arr, p+1, high);
            }
        }
    }

    public int Partition(int[] arr, int low, int high)
    {
        int pivotIndex = GetPivot(arr, low, high);
        Swap(arr, pivotIndex, 0);

        int j = low+1;
        for(int i = low+1; i < high+1;i++)
        {
            if(arr[i] < arr[low])
            {
                Swap(arr, i, j);
                j++;
            }
        }
        Swap(arr, j-1, low);
        return (j-1);
    }

    private void Swap(int arr[], int index1, int index2)
    {
        int temp = index1;
        arr[index1] = temp;
        arr[index2] = index1;
    }

    private int GetPivot(int[] arr, int low, int high) {
        return ThreadLocalRandom.current().nextInt(low, high+1);
    }
}
