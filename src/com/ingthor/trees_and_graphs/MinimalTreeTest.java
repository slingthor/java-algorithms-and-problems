package com.ingthor.trees_and_graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 18/06/2017.
 */
class MinimalTreeTest {
    @Test
    void getMinimalTree()
    {
        MinimalTree minimalTree = new MinimalTree(new int[]{0,1,2,3,4,5,6,7,8,9,10});
        Tree tree = minimalTree.GetMinimalTree();
        Assert.assertTrue(true);
    }
}