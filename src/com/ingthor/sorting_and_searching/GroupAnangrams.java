package com.ingthor.sorting_and_searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class GroupAnangrams
{
    public String[] Group(String[] words)
    {
        for(int i = 0; i < words.length; i++)
        {
            char[] asCharArray = words[i].toCharArray();
            QuickSort qs = new QuickSort();
            qs.Sort(asCharArray);
            //this can obviously be made more efficient
            words[i] = new String(asCharArray);
        }

        Arrays.sort(words, String::compareTo);
        return words;
    }

}
