package com.ingthor.dynamic_programming;

import edu.princeton.cs.algs4.Vector;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Ingthor on 07/05/2017.
 */
public class RobotInAGrid_8_2 {

    private FieldState[][] tableState;
    private Stack<Vector2> history;
    private boolean lastRight = false;
    private Vector2 currentPosition;
    private Vector2 finalPosition;
    //an interesting idea is to create a barrier around the area that is marked as Visited
    public RobotInAGrid_8_2(int x, int y, ArrayList<Vector2> notAllowed)
    {
        history = new Stack<>();
        //+2 to make space for the wall
        tableState = new FieldState[x+2][y+2];
        for(int xIndex = 1; xIndex < x+2; xIndex++)
        {
            for(int yIndex = 1; yIndex < y+2;yIndex++)
            {
                tableState[xIndex][yIndex] = FieldState.Untouched;
            }
        }
        for (Vector2 vec : notAllowed)
        {
            tableState[vec.X+1][vec.Y+1] = FieldState.Visited;
        }
        //create a wall
        for(int yIndex = 0; yIndex < y+2;yIndex++)
        {
            tableState[0][yIndex] = FieldState.Visited;
            tableState[x+1][yIndex] = FieldState.Visited;
        }

        for(int xIndex = 0; xIndex < x+2;xIndex++)
        {
            tableState[xIndex][0] = FieldState.Visited;
            tableState[xIndex][y+1] = FieldState.Visited;
        }
    }

    public Stack<Vector2> Run()
    {
        currentPosition = GetStartingPosition();
        finalPosition = GetFinalPosition();
        while(!IsCurrentFinal())
        MakeMove();
        return history;
    }

    private void MakeMove() {
        MoveState preferredDirection = GetPreferredDirection(currentPosition);
        if(preferredDirection == MoveState.Right)
            MoveRight();
        else if(preferredDirection == MoveState.Down)
            MoveDown();
        else if(preferredDirection == MoveState.None)
        {
            MoveBack();
        }
    }

    private void MoveBack()
    {
        currentPosition = history.pop();
    }

    private MoveState GetPreferredDirection(Vector2 vec)
    {
        FieldState state = GetState(vec);
        boolean rightAllowed = GetState(GetRight(vec)) != FieldState.Visited;
        boolean downAllowed = GetState(GetDown(vec)) != FieldState.Visited;
        if(state == FieldState.Untouched)
        {
            boolean anyDisallowed = !rightAllowed ||!downAllowed;
            if(anyDisallowed) {
                if (downAllowed)
                    return MoveState.Down;
                else if (rightAllowed)
                    return MoveState.Right;
            }
            else if(lastRight)
            {
                return MoveState.Down;
            }
            else
            {
                return MoveState.Right;
            }
        }
        if(state == FieldState.RightPerformed && downAllowed)
            return MoveState.Down;
        if(state == FieldState.DownPerformed && rightAllowed)
            return MoveState.Right;
        return MoveState.None;
    }

    private FieldState GetState(Vector2 vec)
    {
        return tableState[vec.X][vec.Y];
    }
    private void SetState(Vector2 vec, FieldState state)
    {
        tableState[vec.X][vec.Y] = state;
    }

    private Vector2 GetRight(Vector2 coord)
    {
        return new Vector2(coord.X+1, coord.Y);
    }

    private Vector2 GetDown(Vector2 coord)
    {
        return new Vector2(coord.X, coord.Y+1);
    }

    private Vector2 MoveRight()
    {
        Vector2 newPosition = GetRight(currentPosition);
        history.push(newPosition);
        FieldState currPosState = GetState(currentPosition);
        if(currPosState == FieldState.Untouched)
        {
            SetState(currentPosition, FieldState.RightPerformed);
        }
        if(currPosState == FieldState.DownPerformed)
        {
            SetState(currentPosition, FieldState.Visited);
        }
        lastRight = true;
        currentPosition = newPosition;
        return newPosition;
    }

    private Vector2 MoveDown()
    {
        Vector2 newPosition = GetDown(currentPosition);
        history.push(newPosition);
        FieldState currPosState = GetState(currentPosition);
        if(currPosState == FieldState.Untouched)
        {
            SetState(currentPosition, FieldState.DownPerformed);
        }
        if(currPosState == FieldState.RightPerformed)
        {
            SetState(currentPosition, FieldState.Visited);
        }
        lastRight = false;
        currentPosition = newPosition;
        return newPosition;
    }

    private Vector2 GetStartingPosition()
    {
        return new Vector2(1,1);
    }

    private Vector2 GetFinalPosition()
    {
        return new Vector2(tableState.length-2, tableState[0].length-2);
    }

    private boolean IsCurrentFinal()
    {
       return (finalPosition.X == currentPosition.X && finalPosition.Y == currentPosition.Y);
    }

    private enum FieldState
    {
        Untouched,
        DownPerformed,
        RightPerformed,
        Visited
    }

    private enum MoveState
    {
        Down,
        Right,
        None
    }
}

