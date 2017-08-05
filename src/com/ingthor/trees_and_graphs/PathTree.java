package com.ingthor.trees_and_graphs;

import java.util.HashMap;

public class PathTree
{
    TreeNode root = new TreeNode(null, 0);

    public TreeNode Insert(String path)
    {
        String[] split = path.split("/");
        return InsertRecursive(split, 0, root);
    }

    private TreeNode InsertRecursive(String[] split, int splitIndex, TreeNode currentNode)
    {
        String currentSplit = split[splitIndex];
        if(splitIndex < split.length)
        {
            splitIndex++;
            TreeNode nextNode;
            if(!currentNode.Children.containsKey(currentSplit))
            {
                nextNode = new TreeNode(currentNode, splitIndex);
                currentNode.Children.put(currentSplit, nextNode);
            }
            else
            {
                nextNode = currentNode.Children.get(currentSplit);
            }
            if(splitIndex > split.length-1)
            {

                return currentNode;
            }
            else
            {
                return InsertRecursive(split, splitIndex, nextNode);
            }
        }
        return null;
    }

    public TreeNode FindCommonAncestor(TreeNode lhs, TreeNode rhs)
    {
        TreeNode deeperParent = lhs.Depth >= rhs.Depth ? lhs : rhs;
        TreeNode higherParent = lhs.Depth < rhs.Depth ? lhs : rhs;
        while(deeperParent.Depth != higherParent.Depth)
        {
            deeperParent = deeperParent.Parent;
        }
        //now they are at equal height

        while(deeperParent != null && higherParent != null)
        {
            if(deeperParent == higherParent)
            {
                return deeperParent;
            }
            deeperParent = deeperParent.Parent;
            higherParent = higherParent.Parent;
        }
        return  null;
    }


    public class TreeNode
    {
        public HashMap<String, TreeNode> Children;
        public TreeNode Parent;
        public int Depth;


        public TreeNode(TreeNode parent, int depth) {
            Children = new HashMap<>();
            Parent = parent;
            Depth = depth;
        }

    }
}
