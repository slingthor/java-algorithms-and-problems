package com.ingthor.trees_and_graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingthor on 19/06/2017.
 */
public class BuildOrder
{
    public BuildOrder(ArrayList<Dependency> dependencies)
    {
        //DiGraph diGraph = new DiGraph();
    }


    class DiGraph
    {
        private ArrayList<DiGraphNode> nodes = new ArrayList<>();

        public DiGraph(ArrayList<DiGraphNode> nodes) {
            this.nodes = nodes;
        }

        public List<DiGraphNode> GetBuildORder()
        {
            ArrayList<DiGraphNode> allNoneConnected = new ArrayList<DiGraphNode>();
            List<DiGraphNode> nonConnected = FindNonConnected();
            while(nonConnected.size() != 0)
            {
                nonConnected = FindNonConnected();
                allNoneConnected.addAll(nonConnected);
            }
            return allNoneConnected;
        }

        private List<DiGraphNode> FindNonConnected()
        {
            List<DiGraphNode> digraphNodeList = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
                DiGraphNode diGraphNode = nodes.get(i);
                if (diGraphNode.toOthers.size() == 0) {
                    digraphNodeList.add(diGraphNode);
                    digraphNodeList.remove(i);
                }
            }
            return digraphNodeList;
        }

        public void RemoveNode(DiGraphNode node)
        {
            nodes.remove(node);
        }
    }

    class DiGraphNode
    {
        char Value;
        ArrayList<DiGraphNode> toOthers;

        public DiGraphNode(char value) {
            Value = value;
            toOthers = new ArrayList<>();
        }
    }

    public class Dependency
    {
        public char Dependency;
        public char Dependant;

        public Dependency(char dependency, char dependant) {
            Dependency = dependency;
            Dependant = dependant;
        }
    }
}
