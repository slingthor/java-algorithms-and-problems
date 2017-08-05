package com.ingthor.RandomProblems;

import com.ingthor.moderate.Line;
import com.ingthor.moderate.Vector2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 04/06/2017.
 */
class LinesTest {
    @Test
    void input() {
        Lines lines = new Lines();
        boolean connected = lines.Input("linesInput.txt");
        Assert.assertTrue(connected);
    }

    @Test
    void inputFalse()
    {
        Lines lines = new Lines();
        boolean connected = lines.Input("linesInputFalse.txt");
        Assert.assertFalse(connected);
    }

    @Test
    void pointOnLineTrue()
    {
        Line line = new Line(new Vector2(1,3), new Vector2(2,5));
        boolean isOnLine = line.IsPointOnLine(new Vector2(3,7));
        Assert.assertTrue(isOnLine);
    }

    @Test
    void pointOnLineFalse()
    {
        Line line = new Line(new Vector2(1,3), new Vector2(2,5));
        boolean isOnLine = line.IsPointOnLine(new Vector2(3,8));
        Assert.assertFalse(isOnLine);
    }

}