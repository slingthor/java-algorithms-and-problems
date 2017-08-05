package com.ingthor.moderate;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ingthor on 29/06/2017.
 */
public class PairsWithSum
{
    ArrayList<Pair> FindPairsWithSum(int wantedSum, int[] arr)
    {
        ArrayList<Pair> foundPairs = new ArrayList<>();
        HashSet<Integer> hashedValues = new HashSet<Integer>((int)(arr.length*1.45));
        for (int i : arr) {
            hashedValues.add(i);
        }

        for(int i : arr){
            int wantedValue = wantedSum-i;
            if(hashedValues.contains(wantedValue))
            {
                foundPairs.add(new Pair(i,wantedValue));
            }
        }
        return foundPairs;
    }
}
