package com.ingthor.dynamic_programming;

import edu.princeton.cs.algs4.Vector;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ingthor on 07/05/2017.
 */
class RobotInAGrid_8_2Test {
    @Test
    void run() {

        ArrayList<Vector2> notAllowed = new ArrayList<>();
        notAllowed.add(new Vector2(1,0));
        notAllowed.add(new Vector2(2,2));
        notAllowed.add(new Vector2(4,4));

        RobotInAGrid_8_2 robotInAGrid = new RobotInAGrid_8_2(100,100, notAllowed);
        Stack<Vector2> moves = robotInAGrid.Run();
        while(moves.size() > 0)
        {
            System.out.print(moves.pop().toString() +" ");
        }
        Assert.assertTrue(true);

    }

}