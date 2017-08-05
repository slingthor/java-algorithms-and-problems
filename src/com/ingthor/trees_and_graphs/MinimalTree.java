package com.ingthor.trees_and_graphs;

/**
 * Created by Ingthor on 18/06/2017.
 */
//This could use some improvements
public class MinimalTree
{
    int[] sortedArray;
    public MinimalTree(int[] sortedArray)
    {
        this.sortedArray = sortedArray;
    }

    public Tree GetMinimalTree()
    {
        Tree tree = new Tree();
        InsertRange(tree, 0, sortedArray.length-1);
        return tree;
    }

    private void InsertRange(Tree tree, int low, int high)
    {
        if(high == low)
        {
            tree.Insert(low);
        }
        if (high-low == 1)
        {
            tree.Insert(sortedArray[low]);
            tree.Insert(sortedArray[high]);
        }
        else
        {
            int middle = (high+low)/2;
            tree.Insert(sortedArray[middle]);
            InsertRange(tree, low, middle-1);
            InsertRange(tree, middle+1, high);
        }
    }
}

