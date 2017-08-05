package com.ingthor.interview_cake;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 11/06/2017.
 */
class FindDublicateTest {
    @Test
    void findTheDublicateRun()
    {
        int[] testArrayRun = new int[]{0,1,2,3,4,5,8,2,9,10,11};
        FindDublicate findDublicate = new FindDublicate(testArrayRun);
        int actual = findDublicate.FindTheDublicate();
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void findTheDublicateFail()
    {
        int[] testArrayRun = new int[]{0,1,2,3,4,5,8,9,10,11};
        FindDublicate findDublicate = new FindDublicate(testArrayRun);
        Integer actual = findDublicate.FindTheDublicate();
        Integer expected = null;
        Assert.assertEquals(expected, actual);
    }

}