package com.ingthor.linked_lists;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.ingthor.linked_lists.LinkedList.SumLists;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 06/04/2017.
 */
class LinkedListTest {

    @Test
    void WriteString()
    {
        //works
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 0; i < 20; i++)
        {
            linkedList.Add(i);
        }
        System.out.println(linkedList.toString());
        Assert.assertTrue(true);
    }

    @Test
    void TestDublicates()
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.RemoveDublicates();
        Node<Integer> iterator = linkedList.head;
        Assert.assertTrue(iterator.Value == 1);
        iterator = iterator.Next;
        Assert.assertTrue(iterator.Value == 2);
        Assert.assertTrue(iterator.Next == null);
    }

    @Test
    void TestRemoveKthLast()
    {
        //works
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(4);
        linkedList.Add(8);
        linkedList.RemoveKthLast(2);
        System.out.println(linkedList.toString());
        Assert.assertTrue(true);
    }

    @Test
    void RemoveNodeInMiddleTest()
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.Add(1);
        linkedList.Add(2);
        Node<Integer> removeNode = linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(4);
        linkedList.Add(8);
        linkedList.RemoveNodeInMiddle(removeNode);
        System.out.println(linkedList.toString());
        Assert.assertTrue(true);
    }

    @Test
    void SumList()
    {
        LinkedList<Integer> lList = new LinkedList<>();
        LinkedList<Integer> rList = new LinkedList<>();
        LinkedList<Integer> expectedSumList = new LinkedList<>();
        lList.Add(6);
        lList.Add(1);
        lList.Add(7);
        rList.Add(2);
        rList.Add(9);
        rList.Add(5);
        expectedSumList.Add(9);
        expectedSumList.Add(1);
        expectedSumList.Add(2);
        LinkedList<Integer> summedList = LinkedList.SumLists(lList, rList);

        Assert.assertTrue(expectedSumList.equals(summedList));
    }

    @Test
    void Palindrome()
    {
        LinkedList testList = new LinkedList();
        testList.Add(1);
        testList.Add(2);
        testList.Add(1);
        testList.Add(1);
        testList.Add(2);
        testList.Add(1);
        Assert.assertTrue(testList.IsPalindrome());
    }

    @Test
    void TestPartition1()
    {
        LinkedList<Integer> listToPartition = new LinkedList<Integer>();
        listToPartition.Add(3);
        listToPartition.Add(5);
        listToPartition.Add(8);
        listToPartition.Add(5);
        listToPartition.Add(10);
        listToPartition.Add(2);
        listToPartition.Add(1);
        listToPartition.Partition(5);
        System.out.println(listToPartition);
        Assert.assertTrue(true);
    }

    @Test
    void TestEqualsSasme()
    {
        LinkedList<Integer> lList = new LinkedList<Integer>();
        lList.Add(1);
        lList.Add(2);
        lList.Add(1);
        lList.Add(2);
        lList.Add(4);
        lList.Add(8);

        LinkedList<Integer> rList = new LinkedList<Integer>();
        rList.Add(1);
        rList.Add(2);
        rList.Add(1);
        rList.Add(2);
        rList.Add(4);
        rList.Add(8);

        Assert.assertTrue(lList.Equals(rList));
    }

    @Test
    void TestEqualsSasmeOffByOne()
    {
        LinkedList<Integer> lList = new LinkedList<Integer>();
        lList.Add(1);
        lList.Add(2);
        lList.Add(1);
        lList.Add(2);
        lList.Add(4);
        lList.Add(8);

        LinkedList<Integer> rList = new LinkedList<Integer>();
        rList.Add(1);
        rList.Add(2);
        rList.Add(2);
        rList.Add(4);
        rList.Add(8);

        Assert.assertTrue(lList.Equals(rList));
    }

    @Test
    void TestEqualsSameLength()
    {
        LinkedList<Integer> lList = new LinkedList<Integer>();
        lList.Add(1);
        lList.Add(2);
        lList.Add(4);
        lList.Add(2);
        lList.Add(4);
        lList.Add(8);

        LinkedList<Integer> rList = new LinkedList<Integer>();
        rList.Add(1);
        rList.Add(2);
        rList.Add(1);
        rList.Add(2);
        rList.Add(7);
        rList.Add(8);

        Assert.assertFalse(lList.Equals(rList));
    }

}