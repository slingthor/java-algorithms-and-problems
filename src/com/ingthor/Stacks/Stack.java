package com.ingthor.Stacks;

import com.ingthor.linked_lists.Node;

/**
 * Created by Ingthor on 08/04/2017.
 */
public interface Stack
{
    int Count();
    Integer Pop();
    void Push(Integer value);
    Integer Peek();
    Boolean isEmpty();
}
