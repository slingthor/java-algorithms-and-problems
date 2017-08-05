package com.ingthor.LastPrep;

/**
 * Created by Ingthor on 10/07/2017.
 */
public class BS {

    public boolean search(int[] arr, int val)
    {
        int high = arr.length-1;
        int low = 0;
        while(high >= low)
        {
            int middle = (high+low)/2;
            if(arr[middle] > val)
            {
                high = middle-1;
            }
            else if(arr[middle] < val)
            {
                low = middle+1;
            }
            else if(arr[middle] == val)
            {
                return true;
            }
        }
        return false;
    }
}
