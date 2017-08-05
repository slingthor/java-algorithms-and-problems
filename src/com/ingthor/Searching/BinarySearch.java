package com.ingthor.Searching;

/**
 * Created by Ingthor on 11/05/2017.
 */
public class BinarySearch {

    public boolean Search(int[] array, int value)
    {
        int max = array.length-1;
        int min = 0;
        while(min <= max)
        {
            int middle = (max+min)/2;
            int middleValue = array[middle];
            if(middleValue == value)
                return true;
            if(middleValue < value)
            {
                min = middle+1;
            }
            else
            {

                max = middle-1;
            }
        }
        return false;
    }
}
