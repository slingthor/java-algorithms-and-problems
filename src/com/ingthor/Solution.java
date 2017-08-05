package com.ingthor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ingthor on 02/07/2017.
 */
public class Solution {
    ArrayList<Integer>[] adjacencyList;
    boolean[] foundVertices;
    int numberOfConnectedComponents = 0;

    public int countComponents(int n, int[][] edges) {

        foundVertices = new boolean[n];
        adjacencyList = (ArrayList<Integer>[])new ArrayList[n];
        for(int i = 0; i < n;i++)
        {
            adjacencyList[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < edges.length;i++)
        {
            adjacencyList[edges[i][0]].add(edges[i][1]);
            adjacencyList[edges[i][1]].add(edges[i][0]);
        }
        for(int i = 0; i < n; i++)
        {
            if(!foundVertices[i])
            {
                FindConnectedComponents(i);
                numberOfConnectedComponents++;
            }
        }
        return numberOfConnectedComponents;
    }

    private void FindConnectedComponents(int graphNodeIndex)
    {
        ArrayList<Integer> currAdjancecyList = adjacencyList[graphNodeIndex];
        foundVertices[graphNodeIndex] = true;
        for(int i = 0; i < currAdjancecyList.size();i++)
        {
            if(!foundVertices[currAdjancecyList.get(i)])
            {
                FindConnectedComponents(currAdjancecyList.get(i));
            }
        }
    }
}