package com.ingthor.linked_lists;

import java.util.ArrayList;

public class LinkedList<T extends Comparable>
{
    public Node<T> head;
    public Node<T> tail;
    int count = 0;

    public LinkedList() {
    }

    public Node<T> Add(T value) {
        count++;
        if (head == null) {
            head = new Node<T>(value);
            return head;
        }

        Node<T> current = head;
        while (current.Next != null) {
            current = current.Next;
        }
        current.Next = new Node<T>(value);
        current.Next.Previous = current;
        tail = current.Next;
        return current.Next;
    }

    public void RemoveDublicates()
    {
        ArrayList<T> addedValues = new ArrayList<T>();
        Node<T> iterator = head;

        while(iterator.Next != null)
        {
            Node<T> next = iterator.Next;
            addedValues.add(iterator.Value);
            while(addedValues.contains(next.Value))
            {
                if(next.Next != null)
                {
                    next = next.Next;
                    count--;
                }
                else
                {
                    iterator.Next = null;
                    count--;
                    break;
                }
            }
            if(iterator.Next != null)
            {
                iterator = iterator.Next;
            }
        }
    }

    public void RemoveNodeInMiddle(Node<T> node)
    {
        if(node == head)
            throw new IllegalArgumentException("Node can't be head");
        if(node.Next == null)
            throw new IllegalArgumentException("Node can't be tail");
        Node<T> iterator = head;
        while(iterator.Next != null)
        {
            if(iterator.Next == node)
            {
                iterator.Next = iterator.Next.Next;
                return;
            }
            else
            iterator = iterator.Next;
        }
        throw new IllegalArgumentException("Node is not in the list");
    }

    public void RemoveKthLast(int k)
    {
        int indexToRemove = (count - k-1);

        Node<T> iterator = head;
        for(int i = 0; i < indexToRemove-1; i++)
        {
            iterator = iterator.Next;
        }
        if(iterator.Next != null && iterator.Next.Next != null)
        {
            iterator.Next = iterator.Next.Next;
        }
        else
        {
            iterator.Next = null;
        }
    }

    public Boolean IsPalindrome()
    {
        Node<T> startIterator = head;
        Node<T> endIterator = tail;
        if(count < 2)
            return true;
        int iterations = (int) (Math.ceil ((float) count)/2);

        for(int i = 0; i < iterations;i++)
        {
            T lValue = startIterator.Value;
            T rValue = endIterator.Value;
            if(!(lValue.equals(rValue)))
                return false;
            startIterator = startIterator.Next;
            endIterator = endIterator.Previous;
        }
        return true;
    }

    public static LinkedList<Integer> SumLists(LinkedList<Integer> lList, LinkedList<Integer> rList)
    {
        Node<Integer> lIterator = lList.tail;
        Node<Integer> rIterator = rList.tail;

        LinkedList<Integer> sumList = new LinkedList<Integer>();

        Integer carryAmmount = 0;

        boolean leftFinished = false;
        boolean rightFinished = false;
        while( !leftFinished || !rightFinished)
        {
            Integer lValue = 0;
            Integer rValue = 0;
            if(!leftFinished)
            lValue = lIterator.Value;
            if(!rightFinished)
            rValue = rIterator.Value;

            Integer sum = lValue+rValue+carryAmmount;
            carryAmmount = 0;

            if(sum >= 10)
            {
                carryAmmount = 1;
                sum = sum%10;
            }
            sumList.Add(sum);

            if(!leftFinished)
            {
                if(lIterator.Previous == null)
                    leftFinished = true;
                else
                    lIterator = lIterator.Previous;
            }

            if(!rightFinished)
            {
                if(rIterator.Previous == null)
                    rightFinished = true;
                else
                    rIterator = rIterator.Previous;
            }
        }
        return sumList;
    }

    public void Partition(T partition)
    {
        //find partition
        Node<T> partitionNode = Find(partition);

        Node<T> iterator = head;
        boolean passsedPartition = false;
        while(iterator.Next != null)
        {
            T value = iterator.Value;
            Node<T> next = null;

            if(iterator.Next != null)
            {
                next = iterator.Next;
            }
            if(value.compareTo(partition) < 0)
            {
                if(passsedPartition)
                {
                    Node<T> currPrevious = partitionNode.Previous;
                    currPrevious.Next = iterator;
                    partitionNode.Previous = iterator;
                    iterator.Previous = currPrevious;
                    iterator.Next = partitionNode;
                }
            }
            else if(value.compareTo(partition) > 0 )
            {
                if(!passsedPartition)
                {
                    Node<T> currNext = partitionNode.Next;
                    currNext.Previous = iterator;
                    partitionNode.Next = iterator;
                    iterator.Previous = partitionNode;
                    iterator.Next = currNext;
                }
            }
            else if(value.equals(partition))
            {
                //reference equals or not?
                if(partitionNode != iterator)
                {
                    Node<T> currPrevious = partitionNode.Previous;
                    currPrevious.Next = iterator;
                    partitionNode.Previous = iterator;
                    iterator.Previous = currPrevious;
                    iterator.Next = partitionNode;
                }
                else
                {
                    passsedPartition = true;
                }
            }
            iterator = next;
        }

        //iterate list
        //check at what side of Partition
    }

    private Node<T> Find(T searchValue)
    {
        Node<T> iterator = head;
        while (iterator.Next != null)
        {
            T currValue = iterator.Value;
            if(currValue.equals(searchValue))
            {
                return iterator;
            }
            iterator = iterator.Next;
        }

        return null;
    }

    @Override
    public String toString() {
        if(head == null)
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> iterator = head;
        while(iterator.Next != null)
        {
            stringBuilder.append(iterator.Value.toString()+ ",");
            iterator = iterator.Next;
        }
        stringBuilder.append(iterator.Value.toString());
        return stringBuilder.toString();
    }

    public boolean Equals(LinkedList<T> comparedList)
    {
        Node<T> lIterator = head;
        Node<T> rIterator = comparedList.head;
        boolean compare = true;
        while(compare)
        {
            T lValue = lIterator.Value;
            T rValue = rIterator.Value;
            if(!lValue.equals(rValue))
                return false;
            boolean lHasNext = false;
            boolean rHasNext = false;
            if(lIterator.Next != null)
            {
                lHasNext = true;
                lIterator = lIterator.Next;
            }
            if(rIterator.Next != null)
            {
                rHasNext = true;
                rIterator = rIterator.Next;
            }

            if(lHasNext != rHasNext)
                return false;
            if(!lHasNext && !rHasNext)
            {
                return  true;
            }
        }
        return false;
    }
}
