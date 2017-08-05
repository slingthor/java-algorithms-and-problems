package com.ingthor.Sorting;

/**
 * Created by Ingthor on 11/05/2017.
 */
public class SortedMerge_10_1
{
    //Yoiu are given two sorted arrays, A and B where A has a large enough buffer at the end to hold B.
    // Write a method to merge B into A in sorted order
    public void SortedMerge (int[] A, int[] B)
    {
        int C[] = new int[A.length];

        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        while(aIndex < B.length && bIndex < B.length)
        {
            int aValue = A[aIndex];
            int bValue = B[bIndex];
            if((aValue < bValue || bIndex >= B.length) && aIndex < B.length)
            {
                C[cIndex] = aValue;
                aIndex++;
                cIndex++;
            }
            if((bValue < aValue || aIndex >= B.length) && bIndex < B.length)
            {
                C[cIndex] = bValue;
                bIndex++;
                cIndex++;
            }
        }
        for(int i = 0; i < A.length; i++)
        {
            A[i] = C[i];
        }
    }
}
