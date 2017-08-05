package com.ingthor.trees_and_graphs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Ingthor on 17/06/2017.
 */
public class DiGraph
{
    public ArrayList<GraphNode> nodes;

    public DiGraph(ArrayList<GraphNode> nodes) {
        this.nodes = nodes;
    }

    public DiGraph(String diGraphPath)
    {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(diGraphPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            line = reader.readLine();
            int nodeCount = Integer.parseInt(line);
            ArrayList<GraphNode> newNodes = new ArrayList<>();
            for(int i = 0; i < nodeCount; i++)
            {
                newNodes.add(new GraphNode(0,1));
            }
            line = reader.readLine();
            while(line != null)
            {
                String[] edgePair = line.split(" ");
                int from = Integer.parseInt(edgePair[0]);
                int to = Integer.parseInt(edgePair[1]);
                GraphNode fromNode = newNodes.get(from);
                fromNode.ToOther.add(to);
                GraphNode toNode = newNodes.get(to);
                toNode.IntoThisOne.add(from);
                line = reader.readLine();
            }
            this.nodes = newNodes;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean IsConnected(int from, int to)
    {
        GraphNode firstNode = this.nodes.get(from);
        ArrayList<Boolean> blackNodes = new ArrayList<>();
        for(int i = 0; i < nodes.size();i++)
        {
            blackNodes.add(false);
        }
        Queue<GraphNode> queuedNodes = new ArrayDeque<>();
        queuedNodes.add(firstNode);
        blackNodes.set(from, true);
        GraphNode foundNode = null;
        while(!queuedNodes.isEmpty())
        {
            GraphNode currentNode = queuedNodes.poll();
            blackNodes.set(currentNode.Index, true);
            if(currentNode == nodes.get(to))
            {
                foundNode = currentNode;
                break;
            }
            for(Integer nodeIndex : currentNode.ToOther)
            {
                if(!blackNodes.get(nodeIndex))
                {
                    queuedNodes.add(nodes.get(nodeIndex));
                }
            }
        }
        return foundNode != null;
    }
}

class GraphNode
{
    public int Value;
    public int Index;
    public ArrayList<Integer> ToOther;
    public ArrayList<Integer> IntoThisOne;

    public GraphNode(int value, int index) {
        Value = value;
        ToOther = new ArrayList<>();
        IntoThisOne = new ArrayList<>();
    }
}
