package com.ingthor.TopCoder;

import java.util.ArrayList;

/**
 * Created by Ingthor on 03/06/2017.
 */

public class TriangleEasy
{
    Graph graph;
    public int find(int n, int[] x, int[] y)
    {
        int maxConnectivity = 0;
        graph = new Graph(n,x,y);
        for(int i = 0; i < n;i++)
        {
            DepthClass depthClass = new DepthClass();
            boolean[] alreadySeen = new boolean[n];
            for(int z = 0; z < n;z++)
            {
                alreadySeen[z] = false;
            }
            ArrayList<Integer> parentIndex = new ArrayList<>();
            parentIndex.add(i);
            AnalyzeVertex(parentIndex,depthClass);
            if(depthClass.Depth > maxConnectivity)
            {
                maxConnectivity = depthClass.Depth;
            }
        }
        return 3-maxConnectivity;
    }

    private void AnalyzeVertex(ArrayList<Integer> parentIndex, DepthClass depthClass)
    {
        Node node = graph.nodes.get(parentIndex.get(parentIndex.size()-1));
        int currentDepth = parentIndex.size()-1;
        if(currentDepth <3)
        {
            depthClass.SetDepth(currentDepth);
        }

        for(Integer adjacentNodeIndex : node.AdjacentNodes)
        {

            if(currentDepth < 2)
            {
                if(parentIndex.contains(adjacentNodeIndex))
                    continue;
                ArrayList<Integer> newParentIndex = new ArrayList<>(parentIndex);
                newParentIndex.add(adjacentNodeIndex);
                AnalyzeVertex(newParentIndex, depthClass);
            }
            else
            {
                if(adjacentNodeIndex == parentIndex.get(0))
                    depthClass.SetDepth(3);
            }
        }
    }
}

class Graph
{
    public ArrayList<Node> nodes;

    public Graph(int n, int[] x, int[] y)
    {
        nodes = new ArrayList<>();

        for(int i = 0; i < n;i++)
        {
            nodes.add(new Node());
        }

        for(int i = 0; i < x.length;i++)
        {
            int connected1 = x[i];
            int connected2 = y[i];
            nodes.get(connected1).AdjacentNodes.add(connected2);
            nodes.get(connected2).AdjacentNodes.add(connected1);
        }
    }
}

class Node
{
    public ArrayList<Integer> AdjacentNodes;

    public Node() {
        AdjacentNodes = new ArrayList<>();
    }
}

class DepthClass
{
    public int Depth = 0;
    public void SetDepth(int depth)
    {
        if(depth > Depth)
            Depth = depth;
    }
}