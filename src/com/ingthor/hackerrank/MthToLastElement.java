//package com.ingthor.hackerrank

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/*
public class MthToLastElement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int kthLast = Integer.parseInt(line);
        line = br.readLine();
        String[] words = line.split(" ");

        if(words.length < kthLast)
        {
            System.out.println("NIL");
            return;
        }

        ListNode head = new ListNode(Integer.parseInt(words[0]));
        int elemCount = 0;
        ListNode iterator = head;
        elemCount++;

        for (int i = 1; i < words.length; i++)
        {
            int num = Integer.parseInt(words[i]);
            iterator = iterator.AppendNode(num);
            elemCount++;
        }

        System.out.println(mthLastElement(head, kthLast, elemCount));
    }
    static int mthLastElement(ListNode root,int kthLast,int count)
    {
        ListNode iterator = root;
        for(int i = 0; i < count-kthLast; i++)
        {
            iterator = iterator.Next;
        }
        return iterator.Value;
    }
}


class ListNode
{
    public ListNode Next;
    public int Value;

    public ListNode(int value)
    {
        this.Value = value;
    }

    public ListNode AppendNode(int value)
    {
        Next = new ListNode(value);
        return Next;
    }
}
*/