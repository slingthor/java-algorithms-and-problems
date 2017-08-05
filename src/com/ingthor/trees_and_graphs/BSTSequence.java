package com.ingthor.trees_and_graphs;

import java.util.ArrayList;

/**
 * INCOMPLETE
 */
public class BSTSequence
{
    public BinaryTree BinaryTree;

    public BSTSequence() {
        this.BinaryTree = new BinaryTree();
    }


    public class BinaryTree
    {
        private TreeNode root = null;

        public void Insert(int value)
        {
            if(root == null)
            {
                root = new TreeNode(value);
                return;
            }
            InsertRecursive(value, root);
        }

        private void InsertRecursive(int value, TreeNode iterator)
        {
            if(value < iterator.Value)
            {
                if(iterator.Left != null)
                {
                    InsertRecursive(value, iterator.Left);
                }
                else
                {
                    iterator.Left = new TreeNode(value);
                }
            }
            else if(value > iterator.Value)
            {
                if(iterator.Right != null)
                {
                    InsertRecursive(value, iterator.Right);
                }
                else
                {
                    iterator.Right = new TreeNode(value);
                }
            }
        }

        public ArrayList<ArrayList<Integer>> PossibleSequences()
        {
            ArrayList<ArrayList<Integer>> sequences = new ArrayList<>();
            if(root == null)
            {
                sequences.add(new ArrayList<>());
                return sequences;
            }
            ArrayList<Integer> base = new ArrayList<>();
            base.add(root.Value);
            sequences.add(base);
            return null;
        }

        public class TreeNode
        {
            public int Value;
            public TreeNode Left;
            public TreeNode Right;

            public TreeNode(int value) {
                Value = value;
            }
        }
    }
}
