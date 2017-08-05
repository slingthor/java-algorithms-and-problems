package com.ingthor.trees;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 09/04/2017.
 */
class BinaryTreeTest {
    @Test
    void insert() {
        BinaryTree tree = new BinaryTree();
        tree.Insert(5);
        tree.Insert(4);
        tree.Insert(6);
        tree.Insert(3);
        tree.Insert(1);
        tree.Insert(9);
        Assert.assertTrue(true);
    }

    @Test
    void InOrder()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(5);
        tree.Insert(4);
        tree.Insert(6);
        tree.Insert(3);
        tree.Insert(1);
        tree.Insert(9);
        tree.InOrder();
        Assert.assertTrue(true);
    }

    @Test
    void ListOfDepths()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(15);
        tree.Insert(5);
        tree.Insert(12);
        tree.Insert(7);
        tree.Insert(2);
        tree.Insert(9);
        tree.Insert(18);
        tree.Insert(30);
        tree.Insert(40);
        tree.Insert(1);
        tree.Insert(3);
        tree.Insert(22);
        ArrayList<ArrayList<TreeNode>> list = tree.ListOfDepths();
        for(ArrayList<TreeNode> subLists : list)
        {
            for(TreeNode node : subLists)
            {
                System.out.print(node.Value + ", ");
            }
            System.out.println();
        }
        Assert.assertTrue(true);
    }

    @Test
    void IsBST()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(15);
        tree.Insert(5);
        tree.Insert(12);
        tree.Insert(7);
        tree.Insert(2);
        tree.Insert(9);
        tree.Insert(18);
        tree.Insert(30);
        tree.Insert(40);
        tree.Insert(1);
        tree.Insert(3);
        tree.Insert(22);
        boolean isBST = tree.IsBST();
        Assert.assertTrue(isBST);
    }

    @Test
    void Successor()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(4);
        tree.Insert(1);
        tree.Insert(7);
        tree.Insert(6);
        TreeNode nodeToCheck = tree.Insert(8);
        tree.Insert(12);
        tree.Insert(11);
        tree.Insert(13);
        TreeNode successor = tree.Successor(nodeToCheck);
        Assert.assertTrue(successor.Value == 10);
    }

    @Test
    void LevelOrder()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(5);
        tree.Insert(15);
        tree.Insert(2);
        tree.Insert(7);
        tree.Insert(13);
        tree.Insert(17);
        ArrayList<Integer> levelOrderedList = tree.LevelOrder();
        Integer[] expectedArr = new Integer[]{10, 5, 15, 2, 7, 13, 17};
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(expectedArr));
        Assert.assertTrue(expectedList.equals(levelOrderedList));
    }

    @Test
    void InvertTree()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(5);
        tree.Insert(15);
        tree.Insert(2);
        tree.Insert(7);
        tree.Insert(13);
        tree.Insert(17);
        tree.InvertTree();
        ArrayList<Integer> levelOrderedList = tree.LevelOrder();
        Integer[] expectedArr = new Integer[]{10, 15, 5, 17, 13, 7, 2};
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(expectedArr));
        Assert.assertTrue(expectedList.equals(levelOrderedList));
    }

    @Test
    void KthLargest()
    {
        BinaryTree tree = new BinaryTree();
        tree.Insert(10);
        tree.Insert(5);
        tree.Insert(15);
        tree.Insert(2);
        tree.Insert(7);
        tree.Insert(13);
        tree.Insert(17);
        int secondLargest = tree.FindKthLargest(1);
        int expected = 15;
        Assert.assertEquals(secondLargest, expected);
    }
}