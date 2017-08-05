package com.ingthor.moderate;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class NumberSwapper
{
    void NumberSwap()
    {
        int a = 2;
        int b = 4;
        System.out.println("a "+a);
        System.out.println("b "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
