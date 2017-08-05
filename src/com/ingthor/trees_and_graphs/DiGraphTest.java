package com.ingthor.trees_and_graphs;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 17/06/2017.
 */
class DiGraphTest {

    @Test
    public void TestConstruction()
    {
        DiGraph digraph = new DiGraph("digraph.txt");
        Assert.assertTrue(digraph.nodes.size() == 9);
    }

    @Test
    public void TestConnected()
    {
        DiGraph digraph = new DiGraph("digraph.txt");
        boolean isConnected = digraph.IsConnected(0,5);
        Assert.assertTrue(isConnected);
    }

    @Test
    public void TestNotConnected()
    {
        DiGraph digraph = new DiGraph("digraph.txt");
        boolean isConnected = digraph.IsConnected(0,8);
        Assert.assertFalse(isConnected);
    }

}