package com.ingthor.Stacks_2;

import javax.management.OperationsException;

/**
 * Created by Ingthor on 17/06/2017.
 */
public class Stack
{
    private StackNode rootNode = null;

    public int Count = 0;

    public boolean IsEmpty(){return rootNode == null;}

    public void Push(int value)
    {
        if(rootNode == null)
        {
            rootNode = new StackNode(value);
        }
        else
        {
            StackNode tempNode = new StackNode(value);
            tempNode.Next = rootNode;
            rootNode = tempNode;
        }
        Count++;
    }

    public int Pop() throws OperationsException {
        if(rootNode == null)
            throw new OperationsException("Stack is empty");
        int value = rootNode.Value;
        if(rootNode.Next != null)
        rootNode = rootNode.Next;
        else rootNode = null;
        Count--;
        return value;
    }
}

class StackNode
{
    public int Value;
    public  StackNode Next;

    public StackNode(int value) {
        Value = value;
    }
}
