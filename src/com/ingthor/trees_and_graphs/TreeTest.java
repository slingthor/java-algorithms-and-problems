package com.ingthor.trees_and_graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Creaqted by Ingthor on 18/06/2017.
 */
class TreeTest {
    @Test
    void insert()
    {
        Tree tree = new Tree();
        tree.Insert(5);
        tree.Insert(1);
        tree.Insert(3);
        tree.Insert(7);
        Assert.assertTrue(true);
    }

    @Test
    void testDepthOrder()
    {
        Tree tree = new Tree();
        tree.Insert(0);
        tree.Insert(1);
        tree.Insert(2);
        ArrayList<ArrayList<TreeNode>> depthOrder = tree.GetDepthOrder();
        Assert.assertTrue(depthOrder.get(2).get(0).Value == 2);

    }

    @Test
    void TestIsBBst()
    {
        Tree tree = new Tree();
        tree.Insert(5);
        tree.Insert(3);
        tree.Insert(7);
        tree.Insert(2);
        tree.Insert(9);
        Assert.assertTrue(tree.IsBST());
    }
}