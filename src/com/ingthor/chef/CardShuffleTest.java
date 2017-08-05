package com.ingthor.chef;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Ingthor on 14/05/2017.
 */
class CardShuffleTest {
    @Test
    void shuffleCards()
    {
        File file = new File("CardShuffle.txt");
        CardShuffle cardShuffle = new CardShuffle(file);
        ArrayList<Integer> actual = cardShuffle.ShuffleCards();
        ArrayList<Integer> expected = new ArrayList<>(10);
        expected.add(1);
        expected.add(2);
        expected.add(8);
        expected.add(7);
        expected.add(3);
        expected.add(9);
        expected.add(6);
        expected.add(5);
        expected.add(4);
        expected.add(10);
        for(int i = 0; i < 10; i ++)
        {
            Assert.assertTrue(Objects.equals(expected.get(i), actual.get(i)));
        }
    }

}