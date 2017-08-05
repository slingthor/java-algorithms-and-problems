package com.ingthor.hackerrank;

/**
 * Created by Ingthor on 11/06/2017.
 */
public class FizzBuzz {
    public void WriteFizzBuzz(int n)
    {
        for(int i = 1; i < n+1; i++)
        {
            String output = "";
            if(i%3 == 0)
                output = "Fizz";
            if(i%5 == 0)
                output += "Buzz";
            if (output.length() < 1)
                output = String.valueOf(i);
            System.out.println(output);
        }
    }
}
