package com.ingthor.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by Ingthor on 10/06/2017.
 */
public class RotateArray
{
    private int[] array;
    public RotateArray(int[] array)
    {
        this.array = array;
    }

    public int[] Rotate(int ammount)
    {
        int index = 0;
        int temp = array[index];
        for(int i = 0; i < array.length;i++)
        {
            index = (index+ammount)%array.length;
            int temp2 = array[index];
            array[index] = temp;

            temp = temp2;
        }
        return Arrays.copyOf(array, array.length);
    }
}
