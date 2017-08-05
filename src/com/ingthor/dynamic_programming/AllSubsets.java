package com.ingthor.dynamic_programming;

import java.util.ArrayList;

/**
 * Created by Ingthor on 10/05/2017.
 */
public class AllSubsets {

    public ArrayList<ArrayList<Integer>> GetAllSubsets(ArrayList<Integer> set)
    {

        //return expected;
        return null;
    }

    void SetSubset(ArrayList<ArrayList<Integer>> finalSet, ArrayList<ArrayList<Integer>> currentSet)
    {
        ArrayList<ArrayList<Integer>> newSubset = new ArrayList<>();
        int length = newSubset.size();
        for(int i = 0; i < length;i++)
        {
            for(int j = i; j < length;j++)
            {
                ArrayList<Integer> newSubSubset = currentSet.get(i);
                newSubSubset.addAll(currentSet.get(j));
                newSubset.add(newSubSubset);
            }
        }
        finalSet.addAll(newSubset);
        SetSubset(finalSet, newSubset);
    }
}
