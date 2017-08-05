package com.ingthor.moderate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 24/06/2017.
 */
//Not good enough!
class IntersectionTest {
    @Test
    void intersection()
    {
        Vector2 firstStart = new Vector2(1,4);
        Vector2 firstEnd = new Vector2(2,5);
        Vector2 secondStart = new Vector2(1, 10);
        Vector2 secondEnd = new Vector2(2, 8);
        Vector2 expectedIntercept = new Vector2(3,6);

        Intersection intersection = new Intersection();
        Vector2 intersect = intersection.FindIntersect(firstStart, firstEnd, secondStart, secondEnd);
        Assert.assertTrue(expectedIntercept.X == intersect.X && expectedIntercept.Y == intersect.Y);
    }

}