package com.ingthor.chef;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Ingthor on 14/05/2017.
 */
class Chef_and_medium_problemTest {
    @Test
    void readInput()
    {
        File file = new File("chefmedium2.txt");
        Chef_and_medium_problem problem = new Chef_and_medium_problem(file);
        problem.ReadInput();
        problem.PerformQueries();
        int[] expected = new int[3];
        expected[0] = 5;
        expected[1] = 1;
        expected[2] = 1;
        Assert.assertTrue(Arrays.equals(expected, problem.A));
    }

}