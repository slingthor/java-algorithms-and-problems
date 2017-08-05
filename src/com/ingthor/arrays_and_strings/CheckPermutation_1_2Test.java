package com.ingthor.arrays_and_strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 05/04/2017.
 */
class CheckPermutation_1_2Test {
    @Test
    void isPermutation() {
        String abc = "abc";
        String bca = "bca";
        Assert.assertTrue(CheckPermutation_1_2.IsPermutation(abc, bca));
    }

    @Test
    void isComplexPermutation() {
        String abc = "abcabccbaabc";
        String bca = "abcaaabcbccb";
        Assert.assertTrue(CheckPermutation_1_2.IsPermutation(abc, bca));
    }

    @Test
    void isAlmostPermutation() {
        String abc = "abcabccbaabc";
        String bca = "abcaaabbbccb";
        Assert.assertFalse(CheckPermutation_1_2.IsPermutation(abc, bca));
    }

    @Test
    void noneSameLengthStrings() {
        String abc = "abcabccbabc";
        String bca = "abcaaabbbccb";
        Assert.assertFalse(CheckPermutation_1_2.IsPermutation(abc, bca));
    }
}