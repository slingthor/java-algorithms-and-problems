package com.ingthor.graphs;

import com.ingthor.trees.BuildOrder;
import com.ingthor.trees.CharLink;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Created by Ingthor on 09/04/2017.
 */
class GraphTest {
    @Test
    void TestConstruction()
    {
        Graph graph = new Graph("C:/Users/Ingthor/Desktop/smallGraph.txt");
        Assert.assertTrue(true);
    }

    @Test
    void TestIsRoute()
    {
        Graph graph = new Graph("C:/Users/Ingthor/Desktop/smallGraph.txt");
        Assert.assertTrue(graph.isRoute(0, 7));
    }
    @Test
    void TestIsNotRoute()
    {
        Graph graph = new Graph("C:/Users/Ingthor/Desktop/smallGraph.txt");
        Assert.assertFalse(graph.isRoute(6, 2));
    }

    @Test
    void BuildOrderTest()
    {
        ArrayList<Character> projects = new ArrayList<>();
        projects.add('a');
        projects.add('b');
        projects.add('c');
        projects.add('d');
        projects.add('e');
        projects.add('f');
        ArrayList<CharLink> dependencies = new ArrayList<>();
        dependencies.add(new CharLink('a', 'd'));
        dependencies.add(new CharLink('f', 'b'));
        dependencies.add(new CharLink('b', 'd'));
        dependencies.add(new CharLink('f', 'a'));
        dependencies.add(new CharLink('d', 'c'));

        BuildOrder buildOrder = new BuildOrder(projects, dependencies);
        ArrayList<Character> buildOrderChars = buildOrder.GetBuildOrder();
        ArrayList<Character> expectedBuildOrderChars = new ArrayList<>();
        Assert.assertTrue(true);
    }

}