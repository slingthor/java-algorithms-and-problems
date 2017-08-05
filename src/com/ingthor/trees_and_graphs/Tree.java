package com.ingthor.trees_and_graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingthor on 18/06/2017.
 */
public class Tree
{
    TreeNode root = null;

    public void Insert(int value)
    {
        if(root == null)
        {
            root = new TreeNode(value);
        }
        else
        {
            InsertRecursion(value, root);
        }
    }

    private void InsertRecursion(int value, TreeNode pointer)
    {
        boolean isLeft = value < pointer.Value;
        if(isLeft)
        {
            if(pointer.Left != null)
            {
                InsertRecursion(value, pointer.Left);
            }
            else
            {
                pointer.Left = new TreeNode(value);
            }
        }
        else
        {
            if(pointer.Right != null)
            {
                InsertRecursion(value, pointer.Right);
            }
            else
            {
                pointer.Right = new TreeNode(value);
            }
        }
    }

    public ArrayList<ArrayList<TreeNode>> GetDepthOrder()
    {
        ArrayList<ArrayList<TreeNode>> nodeListPerDepth = new ArrayList<>();
        if(root != null)
        {
            nodeListPerDepth.add(new ArrayList<>());
            nodeListPerDepth.get(0).add(root);
            if(root.Left != null)
                FindNodeAtLevel(root.Left, nodeListPerDepth, 1);
            if(root.Right != null)
                FindNodeAtLevel(root.Right, nodeListPerDepth, 1);
            return nodeListPerDepth;
        }
        return null;
    }

    private void FindNodeAtLevel(TreeNode pointer, ArrayList<ArrayList<TreeNode>> nodeListPerDepth, int depth)
    {
        if(nodeListPerDepth.size()< depth+1)
        {
            nodeListPerDepth.add(new ArrayList<>());
        }
        nodeListPerDepth.get(depth).add(pointer);
        if(pointer.Left != null)
            FindNodeAtLevel(pointer.Left, nodeListPerDepth, depth+1);
        if(pointer.Right != null)
            FindNodeAtLevel(pointer.Right, nodeListPerDepth, depth+1);
    }

    public boolean IsBalanced()
    {
        ArrayList<Integer> leafAtDepth = new ArrayList<>();
        if(root != null)
        {
            IsBalancedRecursion(root, leafAtDepth, 1);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(Integer leafDepth : leafAtDepth)
            {
                if(leafDepth < min)
                    min = leafDepth;
                if(leafDepth > max)
                    max = leafDepth;
            }
            return max - min <= 2;
        }
        return false;
    }

    public boolean IsBST()
    {
        if(root == null)
            return true;
        WrappedBoolean wrappedBoolean = new WrappedBoolean();
        IsBSTRecursion(root, wrappedBoolean);
        return  wrappedBoolean.Boolean;
    }

    private void IsBSTRecursion(TreeNode node, WrappedBoolean wrappedBoolean)
    {
        if(node.Left != null)
        {
            if(node.Left.Value >= node.Value)
                wrappedBoolean.Boolean = false;
            IsBSTRecursion(node.Left, wrappedBoolean);
        }
        if(node.Right != null)
        {
            if(node.Right.Value <= node.Value)
                wrappedBoolean.Boolean = false;
            IsBSTRecursion(node.Right, wrappedBoolean);
        }
    }

    class WrappedBoolean
    {
        public boolean Boolean = true;
    }

    public void IsBalancedRecursion(TreeNode node, ArrayList<Integer> foundLeaves, int depth)
    {
        if(node.Left != null)
        {
            IsBalancedRecursion(node.Left, foundLeaves, depth+1);
        }
        else
        {
            if(!foundLeaves.contains(depth))
                foundLeaves.add(depth);
        }
        if(node.Right != null)
        {
            IsBalancedRecursion(node.Right, foundLeaves, depth+1);
        }
        else
        {
            if(!foundLeaves.contains(depth))
                foundLeaves.add(depth);
        }
    }

}

