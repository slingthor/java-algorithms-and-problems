package com.ingthor.heaps;

import java.util.ArrayList;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class Heap
{
    ArrayList<Integer> arrList;

    public int HeapCount()
    {
        return arrList.size();
    }

    public Heap(int initialZizer) {
        this.arrList = new ArrayList<>(initialZizer);
    }

    public Heap(ArrayList<Integer> arrList)
    {
        this.arrList = arrList;
        for(int i = arrList.size()/2+1; i > -1;i--)
        {
            MaxHeapify(i);
        }
    }


    public void MaxHeapify(int i)
    {
        int leftIndex = LeftIndex(i);
        int rightIndex = RightIndex(i);
        int largest = i;
        if(leftIndex < arrList.size() && arrList.get(leftIndex) > arrList.get(i))
            largest = leftIndex;
        if(rightIndex < arrList.size() && arrList.get(rightIndex) > arrList.get(largest))
            largest = rightIndex;
        if(largest != i)
        {
            swap(i, largest);
            MaxHeapify(largest);
        }
    }

    public int GetMax()
    {
        return arrList.get(0);
    }

    public int ExtractMax()
    {
        int max =arrList.get(0);
        arrList.set(0, arrList.get(arrList.size()-1));
        arrList.remove(arrList.size()-1);
        MaxHeapify(0);
        return max;
    }

    public void Swim(int index, int value)
    {
        arrList.set(index, value);
        while(index > 0 && arrList.get(Parent(index)) < arrList.get(index))
        {
            swap(Parent(index), index);
            index = Parent(index);
        }
    }

    //this operation destroys the heap
    public int[] Heapsort()
    {
        int[] heapSorted = new int[arrList.size()];
        for(int i = arrList.size()-1; i > -1;i--)
        {
            heapSorted[i] = GetMax();
            swap(0, arrList.size()-1);
            //this operation takes o(1) because internals start the remove search iteration at last element in arraylist
            arrList.remove(arrList.size()-1);
            MaxHeapify(0);
        }
        return heapSorted;

    }

    public void Insert(int value)
    {
        arrList.add(Integer.MIN_VALUE);
        Swim(arrList.size()-1, value);
    }

    private int LeftIndex(int currIndex)
    {
        return currIndex*2;
    }

    private int RightIndex(int currindex)
    {
        return currindex*2+1;
    }

    private int Parent(int currIndex)
    {
        return (int) Math.floor(currIndex/2);
    }

    private void swap(int lIndex, int rIndex)
    {
        int temp = arrList.get(lIndex);
        arrList.set(lIndex, arrList.get(rIndex));
        arrList.set(rIndex, temp);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : arrList) {
            stringBuilder.append(integer+", ");
        }
        return stringBuilder.toString();
    }
}
