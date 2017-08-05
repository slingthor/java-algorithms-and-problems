package com.ingthor.linked_lists;

/**
 * Created by Ingthor on 06/04/2017.
 */
public class Node<T extends Comparable>
{
    public Node<T> Next;
    public Node<T> Previous;
    public T Value;

    public Node(T value) {
        Value = value;
    }
}

