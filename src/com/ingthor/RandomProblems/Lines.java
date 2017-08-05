package com.ingthor.RandomProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ingthor on 04/06/2017.
 */
public class Lines
{

/* Input example
    5
....X
.OOOO
.....
OOOO.
@....
*/
    int dimension = 0;
    Graph graph;
    public boolean Input(String path)
    {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(path));

            dimension = Integer.parseInt(fileReader.readLine());

            Field[][] field = new Field[dimension][dimension];

            int startPosX = 0;
            int startPosY = 0;
            int endPosX = 0;
            int endPosY = 0;

            String inputLine = fileReader.readLine();
            int y = 0;
            while(inputLine != null)
            {
                for(int x = 0; x < dimension;x++)
                {
                    Field currField = CharToEnum(inputLine.charAt(x));
                    if(currField == Field.StartPos)
                    {
                        startPosX = x;
                        startPosY = y;
                    }
                    if(currField == Field.EndPos)
                    {
                        endPosX = x;
                        endPosY = y;
                    }

                    field[x][y] = currField;
                }
                inputLine = fileReader.readLine();
                y++;
            }
        graph = new Graph(field);
        return graph.IsConnected(startPosX, startPosY, endPosX, endPosY);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private Field CharToEnum(Character character)
    {
        switch (character) {
            case '.' : return Field.Empty;
            case 'X' : return Field.StartPos;
            case 'O' : return Field.Ball;
            case '@' : return Field.EndPos;
        }
        throw new IllegalArgumentException("illegal arg");
    }
}

class Graph
{
    ArrayList<ArrayList<Integer>> nodes;
    int fieldLength = 0;

    public Graph(Field[][] field) {
        fieldLength = field.length;
        this.nodes = new ArrayList<>();
        for(int i = 0; i < field.length*field.length;i++)
        {
            nodes.add(new ArrayList<>());
        }
        for(int y = 0; y < field.length;y++)
        {
            for(int x = 0; x < field.length; x++)
            {
                ParseNode(x,y,field);
            }
        }
    }

    boolean[] visited;
    public boolean IsConnected(int fromX, int fromY, int toX, int toY)
    {
        visited = new boolean[nodes.size()];
        for(int i = 0; i < nodes.size(); i++)
        {
            visited[i] = false;
        }
        ArrayList<Integer> fromNode = nodes.get(GetNodeIndexAt(fromX, fromY,fieldLength));
        ArrayList<Integer> toNode = nodes.get(GetNodeIndexAt(toX, toY,fieldLength));
        FoundObject foundObject = new FoundObject();
        DFS(fromNode, toNode, foundObject);
        return foundObject.Found;
    }

    private void DFS(ArrayList<Integer> currNode, ArrayList<Integer> toNode, FoundObject foundObject)
    {
        for(Integer adjacentNodesIndex : currNode)
        {
            if(!visited[adjacentNodesIndex] && !foundObject.Found)
            {
                visited[adjacentNodesIndex] = true;
                ArrayList<Integer> currAdjacentNode = nodes.get(adjacentNodesIndex);
                if(currAdjacentNode == toNode)
                {
                    foundObject.Found = true;
                    return;
                }
                DFS(currAdjacentNode, toNode, foundObject);
            }
        }
    }

    private void ParseNode(int x, int y, Field[][] field)
    {
        Field fieldValue = field[x][y];
        //if it's not a ball, it's connected
        if(fieldValue != Field.Ball)
        {
            //try to connect in all dimensions
            TryConnect(x,y, x-1, y, field);
            TryConnect(x,y, x+1, y, field);
            TryConnect(x,y, x, y-1, field);
            TryConnect(x,y, x, y+1, field);
        }
    }

    private void TryConnect(int fromX, int fromY, int toX, int toY, Field[][] field)
    {
        if(toX < 0 || toX >= field.length || toY < 0 || toY >= field.length)
            return;
        Field toField = field[toX][toY];
        if(toField == Field.Ball)
            return;
        int fromNodeIndex = GetNodeIndexAt(fromX, fromY, field.length);
        int toNodeIndex = GetNodeIndexAt(toX, toY, field.length);
        ArrayList<Integer> fromNodeAdjacencyList = nodes.get(fromNodeIndex);
        ArrayList<Integer> toNodeAdjacencyList = nodes.get(toNodeIndex);
        if(!fromNodeAdjacencyList.contains(toNodeIndex))
        fromNodeAdjacencyList.add(toNodeIndex);
        if(!toNodeAdjacencyList.contains(fromNodeIndex))
        toNodeAdjacencyList.add(fromNodeIndex);
    }

    int GetNodeIndexAt(int x, int y, int fieldLength)
    {
        return y*fieldLength+x;
    }
}

class FoundObject
{
    public boolean Found = false;
}

enum Field
{
    Empty,
    StartPos,
    EndPos,
    Ball
}
