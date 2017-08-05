package com.ingthor.moderate;

import jdk.nashorn.internal.runtime.BitVector;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class DivingBoard {

    int k;
    int smallSize;
    int biggerSize;

    HashMap<ArrayList<Boolean>, Integer> cache;

    public DivingBoard(int k, int smallSize, int biggerSize) {
        this.k = k;
        this.smallSize = smallSize;
        this.biggerSize = biggerSize;
        cache = new HashMap<>();
    }

    ArrayList<Integer> possible;

    public ArrayList<Integer> PossibleLengths()
    {
        possible = new ArrayList<>();
        ArrayList<Boolean> bitMask = new ArrayList<>();
        cache.put(bitMask, 0);
        SimulatePossibleLengths(bitMask, true, k);
        SimulatePossibleLengths(bitMask, false, k);
        return  possible.stream().distinct().collect(Collectors.toCollection(ArrayList<Integer>::new));
    }

    void SimulatePossibleLengths(ArrayList<Boolean> bitMask, boolean takeBig, int kLeft)
    {
        //update bitvector
        int recentSum = cache.get(bitMask);
        bitMask = new ArrayList<>(bitMask);
        bitMask.add(takeBig);
        if(cache.containsKey(bitMask))
            return;
        cache.put(bitMask, recentSum + (takeBig ? biggerSize : smallSize));
        if (kLeft != 1) {
            SimulatePossibleLengths(bitMask, true, kLeft-1);
            SimulatePossibleLengths(bitMask, false, kLeft-1);
        } else {
            possible.add(recentSum+ (takeBig ? biggerSize : smallSize));
        }
    }
}
