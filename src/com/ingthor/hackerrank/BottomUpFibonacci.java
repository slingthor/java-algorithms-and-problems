package com.ingthor.hackerrank;

import java.util.ArrayList;

/**
 * Created by Ingthor on 11/06/2017.
 */

public class BottomUpFibonacci
{
    int n;
    ArrayList<Integer> cache;

    public BottomUpFibonacci(int n)
    {
        this.n = n;
        BuildCache();
    }

    public int Get(int n)
    {
        return cache.get(n);
    }

    private void BuildCache()
    {
        cache = new ArrayList<>();
        cache.add(0);
        cache.add(1);
        for(int i = 2; i < n+1;i++)
        {
            cache.add(cache.get(i-1)+cache.get(i-2));
        }
    }
}
