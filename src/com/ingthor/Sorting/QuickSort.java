package com.ingthor.Sorting;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ingthor on 30/04/2017.
 */
public class QuickSort implements Sort
{
    @Override
    public void Sort(int[] arrayToSort) {
        DoQuickSort(arrayToSort, 0, arrayToSort.length);
    }

    private void DoQuickSort(int[] arrayToSort, int low, int high)
    {
        if(arrayToSort.length == 1) return;
        if(high > low)
        {
            int pivotIndex = Partition(arrayToSort, low, high);
            DoQuickSort(arrayToSort,low, pivotIndex);
            DoQuickSort(arrayToSort, pivotIndex+1, high);
        }
    }


    public static int Partition(int[] arrayToSort, int min, int max)
    {
        int i = min+1;
        int pivotIndex = GetPivotIndex(min, max);
        int pivotValue = arrayToSort[pivotIndex];
        //put pivot in first place of array
        Swap(arrayToSort, min, pivotIndex);
        for(int j = min+1; j < max; j++)
        {
            if(arrayToSort[j] < pivotValue)
            {
                Swap(arrayToSort, j, i);
                i++;
            }
        }
        Swap(arrayToSort, min, i-1);
        return i-1;
    }

    private static void Swap(int[] arrayToSort, int index1, int index2)
    {
        int temp = arrayToSort[index1];
        arrayToSort[index1] = arrayToSort[index2];
        arrayToSort[index2] = temp;
    }

    static int GetPivotIndex(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}

interface Sort
{
    void Sort(int[] arrayToSort);
}