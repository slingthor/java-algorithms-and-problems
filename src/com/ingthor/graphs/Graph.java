package com.ingthor.graphs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Ingthor on 09/04/2017.
 */
public class Graph {
    ArrayList<GraphNode> graphNodes;

    public Graph(String inputPath) {
        graphNodes = new ArrayList<>();
        ArrayList<ArrayList<Direction>> parsedInput = parseInput(inputPath);
        BuildGraphFromInput(parsedInput);
    }

    private void BuildGraphFromInput(ArrayList<ArrayList<Direction>> parsedInput) {
        for(int i = 0; i < parsedInput.size();i++)
        {
            graphNodes.add(new GraphNode(parsedInput.get(i)));
        }
    }

    public boolean isRoute(int from, int to)
    {
        Queue<GraphNode> currentNodes = new ArrayDeque<>();

        currentNodes.add(graphNodes.get(from));

        while(!currentNodes.isEmpty())
        {
            GraphNode parsedNode = currentNodes.remove();
            for(Direction dir : parsedNode.Adjacency)
            {
                currentNodes.add(graphNodes.get(dir.To));
            }
            if(parsedNode == graphNodes.get(to))
            {
                return true;
            }
        }
        return false;
    }









    ArrayList<ArrayList<Direction>> parseInput(String inputPath)
    {

        ArrayList<ArrayList<Direction>> parsedGraph = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
                String line;
                Boolean doBreak = false;
                while ((line = br.readLine()) != null) {
                    String[] splitNodeDir = line.split(":");
                    if(splitNodeDir.length <2)
                    {
                        parsedGraph.add(new ArrayList<>());
                        break;
                    }
                    splitNodeDir[1] = splitNodeDir[1].replace("(","");
                    splitNodeDir[1] = splitNodeDir[1].replace(")","");
                    String[] directions = splitNodeDir[1].split(";");
                    ArrayList<Direction> directionsList = new ArrayList<>();
                    for(String direction : directions)
                    {
                        String[] values = direction.split(",");
                        int from = Integer.parseInt(values[0]);
                        int to = Integer.parseInt(values[1]);
                        directionsList.add(new Direction(from, to));
                    }
                    parsedGraph.add(directionsList);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parsedGraph;
    }

    public class Direction
    {
        public int To;
        public int Cost;

        public Direction(int to, int cost) {
            To = to;
            Cost = cost;
        }
    }
}


