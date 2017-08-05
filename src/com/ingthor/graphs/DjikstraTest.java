package com.ingthor.graphs;

import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.In;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Created by Ingthor on 01/05/2017.
 */
class DjikstraTest {
    @Test
    void tryStuff() {
        File file = new File("mediumEWD.txt");
        In in = new In(file);
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(in);
        double shortestPath = Djikstra.FindShortestPath(graph, 0, 20);
        System.out.println(shortestPath);
    }

    @Test
    void DirectedBFS()
    {
        File file = new File("mediumEWD.txt");
        In in = new In(file);
        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(in);

        //boolean exists = BFS.BFS(graph, 5);

        //Assert.assertTrue(exists);
    }

}