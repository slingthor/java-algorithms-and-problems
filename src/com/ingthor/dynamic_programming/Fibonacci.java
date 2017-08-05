package com.ingthor.dynamic_programming;

import java.util.ArrayList;

import static java.lang.Math.max;

/**
 * Created by Ingthor on 03/05/2017.
 */
public class Fibonacci
{
    public static int Fib(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }

    public static ArrayList<Integer> cache = new ArrayList<>();

    public static int FibStart(int n)
    {
        cache = new ArrayList<>(n+1);
        for(int i = 0; i < n+1; i++)
        {
            cache.add(i, -1);
        }
        return FibDynamic(n);
    }

    public static int FibDynamic(int n)
    {
        if(n<2)
        {
            return 1;
        }
        if(cache.get(n) == -1 )
        cache.set(n,  FibDynamic(n-1)+FibDynamic(n-2));
        return cache.get(n);
    }

    public static int factorial(int n)
    {
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }

    public static int DynamicFactorial(int n)
    {
        cache = new ArrayList<>(n+1);
        for(int i = 0; i < n+1; i++)
        {
            cache.add(-1);
        }
        return DynamicFac(n);
    }

    private static int DynamicFac(int n) {
        if(n == 1)
            return 1;
        if(cache.get(n) == -1)
        {
            cache.set(n, n*factorial(n-1));
        }
        return cache.get(n);
    }

    public int sumDigits(int n) {
        if(n == 0) return 0;
        return n%10 + sumDigits(n/10);
    }

    public int count7(int n) {
        if(n == 0) return 0;
        if(n%10 == 7) return (1+count7(n/10));
        return count7(n/10);
    }

    public int countX(String str)
    {
        char currChar = str.charAt(str.length()-1);
        String newStr = str.substring(0, str.length()-1);
        if(currChar == 'x') return 1;
        return 0;
    }

    public static int Knapsack(int N, int W, int[] values, int weights[])
    {
        cache = new ArrayList<>(N+1);

        for(int i = 0; i < N+1;i++)
        {
            cache.add(i, -1);
        }


        return KnapsackRecDynamic(N, W, values, weights);
    }

    public static int KnapsackRecDynamic(int N, int W, int[] values, int weights[])
    {
        if(cache.get(N) != -1)
        {
            return cache.get(N);
        }

        return  cache.set(N, KnapsackRec(N,W,values,weights));

    }

    public static int KnapsackRec(int N, int W, int[] values, int weights[])
    {


        if(N == 0 || W == 0)
            return 0;
        if(weights[N-1] > W)
            return Knapsack(N-1,W, values, weights);

        else return max(values[N-1]+Knapsack(N-1, W-weights[N-1], values, weights), Knapsack(N-1, W, values, weights));
    }


}
