package com.ingthor.graphs;

import com.ingthor.linked_lists.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingthor on 09/04/2017.
 */
public class GraphNode
{
    public Boolean Visited = false;
    public Boolean Black = true;

    public List<Graph.Direction> Adjacency;

    public GraphNode( List<Graph.Direction> adjacency ){
        this.Adjacency = adjacency;
    }

}
