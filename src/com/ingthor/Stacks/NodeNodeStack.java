package com.ingthor.Stacks;

import com.ingthor.linked_lists.Node;

/**
 * Created by Ingthor on 08/04/2017.
 */
public class NodeNodeStack implements Stack {
    Node<Integer> bottom;
    private int Count = 0;

    @Override
    public int Count()
    {
        return Count;
    }

    @Override
    public Integer Pop() {
        Integer returned = bottom.Value;
        if(bottom.Next != null)
        {
            bottom = bottom.Next;
        }
        else
        {
            bottom = null;
        }
        Count--;
        return returned;
    }

    @Override
    public void Push(Integer value) {
        if(bottom == null)
        {
            bottom = new Node<Integer>(value);
        }
        else
        {
            Node<Integer> newBottom = new Node<>(value);
            newBottom.Next = bottom;
            bottom = newBottom;
        }
        Count++;
    }

    @Override
    public Integer Peek() {
        return bottom.Value;
    }

    @Override
    public Boolean isEmpty() {
        return bottom == null;
    }
}
