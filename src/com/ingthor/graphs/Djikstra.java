package com.ingthor.graphs;


import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Ingthor on 01/05/2017.
 */
public class Djikstra {
    public static double FindShortestPath(EdgeWeightedDigraph graph, int fromVertex, int toVertex)
    {
        ArrayList<Boolean> visitedVertices = new ArrayList<>();
        ArrayList<Double> pathLengths = new ArrayList<>();
        ArrayList<Integer> unsettledNodes = new ArrayList<>();
        for(int i = 0; i < graph.V();i++)
        {
            pathLengths.add(i, Double.MAX_VALUE);
        }
        for(int i = 0; i < graph.V();i++)
        {
            visitedVertices.add(i, false);
        }

        //initialize
        int currentVertex = fromVertex;
        visitedVertices.set(fromVertex, true);
        pathLengths.set(fromVertex, 0.0);
        while(currentVertex != toVertex)
        {
             double currentVertexLength = pathLengths.get(currentVertex);
             for( DirectedEdge edge : graph.adj(currentVertex))
             {
                 if(edge.to() == toVertex)
                     return currentVertexLength;
                 if(!unsettledNodes.contains(edge.to()) && !visitedVertices.get(edge.to()))
                    unsettledNodes.add(edge.to());
                 double proposedNewLength = currentVertexLength+ edge.weight();
                 double lengthToVertex = pathLengths.get(edge.to());
                 if(proposedNewLength < lengthToVertex)
                 {
                     pathLengths.set(edge.to(), proposedNewLength);
                 }
             }
             visitedVertices.set(currentVertex, true);
             double shortestVertexPath = Double.MAX_VALUE;
             for(Integer unsettledNode : unsettledNodes)
             {
                 if(pathLengths.get(unsettledNode) < shortestVertexPath)
                 {
                     shortestVertexPath = pathLengths.get(unsettledNode);
                     currentVertex = unsettledNode;
                 }
             }
             unsettledNodes.remove(new Integer(currentVertex));
             visitedVertices.set(currentVertex, true);
        }
        return -1;
    }
}
