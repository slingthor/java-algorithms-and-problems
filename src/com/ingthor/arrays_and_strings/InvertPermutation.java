package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class InvertPermutation {
    public int[] GetInverse(int[] arr)
    {
        int currentIndex = 0;
        for(int i = 0; i < arr.length;i++)
        {
            int temp = arr[arr[currentIndex]];
            arr[arr[currentIndex]] = currentIndex;
            currentIndex = temp;
        }
        return arr;
    }
}
