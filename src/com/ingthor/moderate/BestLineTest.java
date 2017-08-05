package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 25/06/2017.
 */
class BestLineTest {
    @Test
    void findBestLine() {
        Vector2[] points = new Vector2[]{
                new Vector2(1,2),
                new Vector2(2,3),
                new Vector2(1,4),
                new Vector2(2,6),
                new Vector2(3,8),
                new Vector2(1,6)};

        BestLine bestLine = new BestLine();
        Line fitLine = bestLine.FindBestLine(points);

        Assert.assertTrue(fitLine.slope == 2);
        Assert.assertTrue(fitLine.yOffset == 2);
    }

}