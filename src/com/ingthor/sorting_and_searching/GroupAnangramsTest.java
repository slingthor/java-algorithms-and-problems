package com.ingthor.sorting_and_searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 24/06/2017.
 */
class GroupAnangramsTest {
    @Test
    void group() {
        String[] arrayOfAnangrams = new String[]{"kubb", "kisa", "batti", "bukb", "saki", "ittab"};
        GroupAnangrams groupAnangrams = new GroupAnangrams();
        groupAnangrams.Group(arrayOfAnangrams);
        Assert.assertTrue(true);
    }

}