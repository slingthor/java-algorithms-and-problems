package com.ingthor.dynamic_programming;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 10/05/2017.
 */
class AllSubsetsTest {

    @Test
    public void TestAllSubsets()
    {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);


        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(3);
        ArrayList<Integer> list4 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list5 = new ArrayList<>();
        list1.add(1,3);
        ArrayList<Integer> list6 = new ArrayList<>();
        list1.add(2,3);

        expected.add(list1);
        expected.add(list2);
        expected.add(list3);
        expected.add(list4);
        expected.add(list5);
        expected.add(list6);

        AllSubsets allSubsets = new AllSubsets();
        ArrayList<ArrayList<Integer>> actual = allSubsets.GetAllSubsets(input);

        Assert.assertTrue(expected.equals(actual));
    }

}