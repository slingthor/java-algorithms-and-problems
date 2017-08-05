package com.ingthor.trees;

/**
 * Created by Ingthor on 09/04/2017.
 */
public class TreeNode {
    public TreeNode Left;
    public TreeNode Right;
    public TreeNode Parent;
    public int Value;

    public TreeNode(int value, TreeNode parent) {
        Value = value;
        this.Parent = parent;
    }
}
