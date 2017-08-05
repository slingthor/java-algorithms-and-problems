package com.ingthor.trees;

import com.ingthor.linked_lists.Node;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ingthor on 09/04/2017.
 */
public class BinaryTree {
    TreeNode root;
    public int Count = 0;

    public TreeNode Insert(int value)
    {
        Count++;
        TreeNode node = new TreeNode(value, null);
        if(root == null)
        {
            root = node;
        }
        else
        {
            RecursiveInsert(node, root);
        }
        return node;
    }

    public void InsertBalanced(ArrayList<Integer> sortedList)
    {
        int center = (int) Math.floor(sortedList.size());
        InsertBalancedRecursive(0, sortedList.size(), sortedList);
    }

    private void InsertBalancedRecursive (int start, int end, ArrayList<Integer> sortedList)
    {
        int centerIndex = (int) Math.floor((end+start)/2);
        Insert(sortedList.get(sortedList.get(centerIndex)));
        InsertBalancedRecursive(start, centerIndex-1, sortedList);
        InsertBalancedRecursive(centerIndex+1, end, sortedList);
    }

    public ArrayList<Integer> LevelOrder()
    {
        if(root == null)
            return new ArrayList<>();
        ArrayList<TreeNode> nodesAtLevel = new ArrayList<>();
        nodesAtLevel.add(root);
        ArrayList<Integer> levelOrderList = new ArrayList<>();
        levelOrderList.add(root.Value);
        LevelOrder(levelOrderList, nodesAtLevel);
        return levelOrderList;
    }

    private void LevelOrder(ArrayList<Integer> buildList, ArrayList<TreeNode> nodesAtLevel)
    {
        ArrayList<TreeNode> nodesNextLevel = new ArrayList<>();

        for(TreeNode node : nodesAtLevel)
        {
            if(node.Left != null)
            {
                buildList.add(node.Left.Value);
                nodesNextLevel.add(node.Left);
            }
            if(node.Right != null)
            {
                buildList.add(node.Right.Value);
                nodesNextLevel.add(node.Right);
            }
        }
        if(nodesNextLevel.size() > 0)
            LevelOrder(buildList, nodesNextLevel);
    }

    public void InvertTree()
    {
        if(root == null)
            return;
        ArrayList<TreeNode> nodesAtLevel = new ArrayList<>();
        nodesAtLevel.add(root);
        InvertTree(nodesAtLevel);
    }

    private void InvertTree(ArrayList<TreeNode> nodesAtLevel)
    {
        ArrayList<TreeNode> nextLevelNodes = new ArrayList<>();

        for(TreeNode node : nodesAtLevel)
        {
            TreeNode temp = null;
            if(node.Left != null)
            {
                temp = node.Left;
                nextLevelNodes.add(node.Left);
            }
            if(node.Right != null)
            {
                nextLevelNodes.add(node.Right);
                node.Left = node.Right;
            }
            node.Right = temp;
        }
        if(nextLevelNodes.size() > 0)
        {
            InvertTree(nextLevelNodes);
        }
    }

    public int FindKthLargest(int kthLargest)
    {
        if(kthLargest > Count)
        {
            return -1;
        }
        if(root == null)
            return -1;
        kthLargest = Count-1-kthLargest;
        KthLargestBox box = new KthLargestBox(0);
        FindKthLargest(root, kthLargest,box);
        return box.Value;
    }

    private void FindKthLargest(TreeNode treeNode, int kthLargest, KthLargestBox index)
    {
        if(index.Index <= kthLargest) {
            if (treeNode.Left != null)
                FindKthLargest(treeNode.Left, kthLargest, index);
            if (index.Index == kthLargest) {
                index.Value = treeNode.Value;
            }
            index.Index = index.Index + 1;
            if (treeNode.Right != null)
                FindKthLargest(treeNode.Right, kthLargest, index);
        }
    }

    class KthLargestBox
    {
        KthLargestBox(int indexValue)
        {
            this.Index = indexValue;
        }
        public int Index;
        public int Value = -1;
    }

    public ArrayList<ArrayList<TreeNode>> ListOfDepths()
    {
        int depth = 0;
        ArrayList<ArrayList<TreeNode>> theList = new ArrayList<>();
        ArrayList<TreeNode> firstLevel = new ArrayList<>();
        firstLevel.add(root);
        theList.add(firstLevel);
        depth++;

        Boolean any = false;
        do
        {
            ArrayList<TreeNode> currLevel = new ArrayList<>();
            any = false;
            for(TreeNode node : theList.get(depth-1))
            {
                if(node.Left != null)
                {
                    currLevel.add(node.Left);
                    any = true;
                }

                if(node.Right != null)
                {
                    currLevel.add(node.Right);
                    any = true;
                }
            }
            theList.add(currLevel);
            depth++;
        } while(any);

        return theList;
    }

    private class BoxedInt
    {
        int CurrLowest = 0;
        boolean broken = false;

        public BoxedInt(int currLowest)
        {
            this.CurrLowest = currLowest;
        }
    }

    public boolean IsBST()
    {
        BoxedInt boxedInt = new BoxedInt(-1);
        InOrderIsBst(root, boxedInt);
        return  boxedInt.broken;
    }

    private void InOrderIsBst(TreeNode treeNode, BoxedInt boxedInt)
    {
        if(!boxedInt.broken)
        {
            if(treeNode.Value > boxedInt.CurrLowest)
            {
                boxedInt.CurrLowest = treeNode.Value;
            }
            else
            {
                boxedInt.broken = true;
                return;
            }
        }
        else
        {
            return;
        }

        if(root.Left != null)
        {
            InOrderIsBst(treeNode.Left, boxedInt);
        }
        if(root.Right != null)
        {
            InOrderIsBst(treeNode.Right, boxedInt);
        }
    }

    public void RecursiveInsert(TreeNode node, TreeNode iterator)
    {

        if(node.Value < iterator.Value)
        {
            if(iterator.Left != null)
            {
                RecursiveInsert(node, iterator.Left);
            }
            else
            {
                iterator.Left = node;
                node.Parent = iterator;
            }
        }
        else if(node.Value > iterator.Value)
        {
            if(iterator.Right != null)
            {
                RecursiveInsert(node, iterator.Right);
            }
            else
            {
                iterator.Right = node;
                node.Parent = iterator;
            }
        }
    }

    public TreeNode Successor(TreeNode nodeToCheck)
    {
        if(nodeToCheck.Right != null)
        {
            return nodeToCheck.Right;
        }
        while(nodeToCheck.Parent != null)
        {
            if(nodeToCheck.Parent.Left == nodeToCheck)
            {
                return  nodeToCheck.Parent;
            }
            nodeToCheck = nodeToCheck.Parent;
        }
        return null;
    }

    public void InOrder()
    {
        TreeNode iterator = root;
        InOrder(iterator);
    }

    private void InOrder(TreeNode node)
    {
        if(node.Left != null)
            InOrder(node.Left);
        System.out.println(node.Value);
        if(node.Right != null)
            InOrder(node.Right);
    }
}
