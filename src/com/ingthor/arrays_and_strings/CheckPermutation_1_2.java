package com.ingthor.arrays_and_strings;

import java.math.BigInteger;

/**
 * Created by Ingthor on 05/04/2017.markus
 */
public class CheckPermutation_1_2 {

    public static boolean IsPermutation(String testString1, String testString2)
    {
        if(testString1.length() != testString2.length())
            return false;
        BigInteger totalNumericValue1 = new BigInteger("0");
        BigInteger totalNumericValue2 = new BigInteger("0");
        int length = testString1.length();
        for(int i = 0; i < length;i++)
        {
            totalNumericValue1 = totalNumericValue1.add(new BigInteger(Integer.toString(Character.getNumericValue(testString1.charAt(i)))));
            totalNumericValue2 = totalNumericValue2.add(new BigInteger(Integer.toString(Character.getNumericValue(testString2.charAt(i)))));
        }

        if(totalNumericValue1.equals(totalNumericValue2))
        {
            return true;
        }
        return false;
    }
}
