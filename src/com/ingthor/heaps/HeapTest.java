package com.ingthor.heaps;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 01/07/2017.
 */
class HeapTest {
    @Test
    void maxHeapify()
    {
        Integer[] someArray = new Integer[]{20,2,14,28,30,43,27,19,11};
        ArrayList<Integer> someArrayList = new ArrayList<>( Arrays.asList(someArray));
        Heap heap = new Heap(someArrayList);
        System.out.println(heap.toString());
        Assert.assertTrue(true);
    }

    @Test
    void testInsert()
    {
        Integer[] someArray = new Integer[]{20,2,14,28,30,43,27,19,11};
        Heap heap = new Heap(someArray.length);
        for (Integer integer : someArray) {
            heap.Insert(integer);
        }
        System.out.println(heap.toString());
        Assert.assertTrue(true);
    }

    @Test
    void heapSortTest()
    {
        Integer[] someArray = new Integer[]{20,2,14,28,30,43,27,19,11};
        ArrayList<Integer> someArrayList = new ArrayList<>( Arrays.asList(someArray));
        Heap heap = new Heap(someArrayList);
        int[] sorted = heap.Heapsort();
        int[] expected = new int[]{2,11,14,19,20,27,28,30,43};
        Assert.assertTrue(Arrays.equals(sorted, expected));
    }

}