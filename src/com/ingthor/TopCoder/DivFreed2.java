package com.ingthor.TopCoder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Ingthor on 17/05/2017.
 */
/*
public class FriendScore
{

    public int highestScore(String[] friends)
    {
        if(friends == null)
            return -1;
        if(friends.length < 1)
            return -1;
        UndirectedGraph friendGraph = BuildGraph(friends);
        return MostFriends(friendGraph);
    }

    private int MostFriends(UndirectedGraph friendGraph)
    {
        int highestIndex = 0;
        int highestFriendCount = 0;
        for(int i = 0; i < friendGraph.nodes.size();i++)
        {
            int size = friendGraph.nodes.get(i).AdjacencyList.size();
            if(size > highestFriendCount)
            {
                highestFriendCount = size;
                highestIndex = 0;
            }
        }
        return highestIndex;
    }

    private UndirectedGraph BuildGraph(String[] friends) {
        UndirectedGraph graph = new UndirectedGraph(friends.length);


        for(int i = 0; i < friends.length;i++)
        {
            for(int j = 0; j < friends[i].length();j++)
            {
                if(friends[i].charAt(j) == 'Y')
                {
                    graph.Connect(j,i);
                }
            }
        }
        return graph;
    }
}

class UndirectedGraph
{

    public ArrayList<GraphNode> nodes;

    public UndirectedGraph(ArrayList<GraphNode> nodes) {
        this.nodes = nodes;
    }

    public UndirectedGraph(int size)
    {
        this.nodes = new ArrayList<>();
        for(int i = 0; i < size;i++)
        {
            nodes.add(new GraphNode());
        }
    }

    public void Connect(int j, int i)
    {
        nodes.get(j).AdjacencyList.add(i);
        nodes.get(i).AdjacencyList.add(j);
    }

    public void BFS(int from, int to)
    {
        Queue<GraphNodeDistance> queuedNodes = new ArrayDeque<>();

        GraphNode startNode = nodes.get(from);





        ResetTouched();
    }

    public void ResetTouched()
    {
        for(GraphNode node : nodes)
        {
            node.Touched = false;
        }
    }

}

class SearchResult
{
    public boolean found;
    public int steps;
}

class GraphNodeDistance
{
    public GraphNode graphNode;
    public int distance;

    public GraphNodeDistance(GraphNode graphNode, int distance) {
        this.graphNode = graphNode;
        this.distance = distance;
    }
}

class GraphNode
{
    public ArrayList<Integer> AdjacencyList;
    public boolean Touched;

    public GraphNode()
    {
        AdjacencyList = new ArrayList<>();
        Touched = false;
    }
}
*/