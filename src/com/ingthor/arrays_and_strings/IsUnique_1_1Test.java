package com.ingthor.arrays_and_strings;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class IsUnique_1_1Test {
    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @org.junit.jupiter.api.Test
    void isUniqueEmpty()
    {
        String emptyString = "";
        Assert.assertTrue(IsUnique_1_1.IsUnique(emptyString));
    }

    @org.junit.jupiter.api.Test
    void isUniqueSingle()
    {
        String singleString = "1";
        Assert.assertTrue(IsUnique_1_1.IsUnique(singleString));
    }

    @org.junit.jupiter.api.Test
    void isUniqueTraditional()
    {
        String singlestring = "123ABC";
        Assert.assertTrue(IsUnique_1_1.IsUnique(singlestring));
    }

    @org.junit.jupiter.api.Test
    void isUniqueNegativeEdge()
    {
        String falseString = "1AB1";
        Assert.assertFalse(IsUnique_1_1.IsUnique(falseString));
    }

    @org.junit.jupiter.api.Test
    void isUniqueNegative()
    {
        String falseString = "1AB1";
        Assert.assertFalse(IsUnique_1_1.IsUnique(falseString));
    }

}