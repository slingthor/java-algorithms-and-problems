package com.ingthor.sorting_and_searching;

//first rotate A so sort is more efficient. Then perform a merge operation
public class SortedMerge
{
    public int[] SortMerge(int[] a, int[] b)
    {
        int aLength = a.length-b.length;

        Rotate(a, aLength-1);

        int aStart = b.length;

        int aIter = aStart;
        int bIter = 0;


        int totalIndex = 0;
        while(aIter < a.length || bIter < b.length )
        {
            if(bIter == b.length || (a[aIter] < b[bIter] && aIter < a.length) )
            {
                a[totalIndex] = a[aIter];

                aIter++;
                totalIndex++;
                continue;
            }
            if(bIter < b.length)
            {
                a[totalIndex] = b[bIter];
                bIter++;
                totalIndex++;
            }
        }
        return a;
    }

    private void Rotate(int[] a, int endPos) {
        int actualEndPos = a.length-1;
        for(int i = endPos; i > -1;i--)
        {
            a[actualEndPos] = a[i];
            actualEndPos--;
        }
    }
}
