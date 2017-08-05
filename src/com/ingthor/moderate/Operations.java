package com.ingthor.moderate;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class Operations
{
    public int Subtract(int a, int b)
    {
        //we want to find a c where c+b = a

        int min = 0;
        int high = a;
        return Search(min, high, a, b);
    }

    //oops this operation is not allowed
    int Search(int min, int high, int total, int partOfSum)
    {
        int middle = (min+high)/2;
        int sum = middle + partOfSum;
        if(sum == total)
            return middle;
        if( sum > total)
        {
            return Search(min, middle-1, total, partOfSum);
        }
        return Search(middle+1, high, total, partOfSum);
    }

    public int Divide(int a, int b)
    {
        return 0;
    }

    public int Multiply(int a, int b)
    {
        int total = 0;
        for(int i = 0; i < b; i++)
        {
            total+=a;
        }
        return total;
    }
}
