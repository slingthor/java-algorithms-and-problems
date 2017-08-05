package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 05/04/2017.
 */
public class IsUnique_1_1
{
    public static boolean IsUnique(String testString)
    {
        if(testString == null)
            throw new IllegalArgumentException();
        if(testString.length() == 0)
            return true;
        int length = testString.length();
        for(int i = 0; i < length; i++)
        {
            char currChar = testString.charAt(i);
            for(int j = 0; j < i; j++)
            {
                if(currChar == testString.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
