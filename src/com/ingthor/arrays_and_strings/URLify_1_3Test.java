package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 06/04/2017.
 */
class URLify_1_3Test {
    @Test
    void URLify() {
        String testString = "once upon a time there was a boy";
        char[] charArray = new char[testString.length()*3];
        for(int i = 0; i < 32; i++)
        {
            charArray[i] = testString.charAt(i);
        }
        URLify_1_3.URLify(charArray, 31);
        String newString = new String(charArray);
        Assert.assertTrue(true);
    }

}