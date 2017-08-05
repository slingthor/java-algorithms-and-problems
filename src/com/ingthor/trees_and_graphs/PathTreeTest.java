package com.ingthor.trees_and_graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 22/06/2017.
 */
class PathTreeTest {
    @Test
    void insert() {
        String testString = "test/best/west/pest";
        PathTree pathTree = new PathTree();
        PathTree.TreeNode node = pathTree.Insert(testString);
        Assert.assertTrue(node.Children.containsKey("pest"));
    }

    @Test
    void FindCommonAncestor()
    {
        String path1 =  "test/best/west/pest";
        String path2 =  "test/chest/west/pest";
        PathTree pathTree = new PathTree();
        PathTree.TreeNode lhs = pathTree.Insert(path1);
        PathTree.TreeNode rhs = pathTree.Insert(path2);

        PathTree.TreeNode commonAncestor = pathTree.FindCommonAncestor(lhs, rhs);
        Assert.assertTrue(commonAncestor.Children.containsKey("best"));
    }

}