package com.ingthor.trees_and_graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 24/06/2017.
 */
class BinaryTreeTest {
    @Test
    void insert() {
        //quick check for runtime errors
        BSTSequence bstSequence = new BSTSequence();
        bstSequence.BinaryTree.Insert(5);
        bstSequence.BinaryTree.Insert(3);
        bstSequence.BinaryTree.Insert(1);
        Assert.assertTrue(true);
    }

}