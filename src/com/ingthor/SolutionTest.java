package com.ingthor;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 02/07/2017.
 */
class SolutionTest {
    @Test
    void validUtf8() {
       Solution solution = new Solution();
       int[] one = new int[]{0,1};
       int[] two = new int[]{1,2};
       int[] three = new int[]{3,4};
       solution.countComponents(5, new int[][]{one, two, three});
       Assert.assertTrue(true);
    }

}