package com.ingthor.moderate;

import java.util.ArrayList;

/**
 * Created by Ingthor on 28/06/2017.
 */
public class LangtonsAnt {
    ArrayList<ArrayList<Boolean>> grid;

    private IVector2 antPosition = new IVector2(0,0);

    private int direction = 0;

    public LangtonsAnt() {
        grid = new ArrayList<>();
        ArrayList<Boolean> first = new ArrayList<>();
        first.add(false);
        grid.add(first);
    }

    public ArrayList<ArrayList<Boolean>> PerformMoves(int k)
    {
        for(int i = 0; i < k; i++)
        {
            antPosition = ParseCurrentPosition(antPosition);
        }

        //print grid because we can
        for (ArrayList<Boolean> booleans : grid) {
            StringBuilder line = new StringBuilder();
            for(Boolean square : booleans)
            {
                line.append(square ? "y" : "X");
            }
            System.out.println(line);
        }
        return grid;
    }

    private IVector2 ParseCurrentPosition(IVector2 antPosition) {
        Boolean currentSquare = grid.get(antPosition.X).get(antPosition.Y);
        if(!currentSquare)
            ModifyDirection(1);
        else
            ModifyDirection(-1);
        grid.get(antPosition.X).set(antPosition.Y, !currentSquare);
        IVector2 vectorOffset = DirectionToVectorOffset(direction);
        if((antPosition.X+vectorOffset.X) >= grid.size() || (antPosition.X+vectorOffset.X) < 0)
        {
            AdjustGridX();
            if(antPosition.X+vectorOffset.X < 0)
            {
                antPosition = new IVector2(antPosition.X +1, antPosition.Y);
                SwapXEnds();
            }

        }

        else if((antPosition.Y + vectorOffset.Y) >= grid.get(0).size() || (antPosition.Y + vectorOffset.Y) < 0)
        {
            AdjustGridY();
            if((antPosition.Y + vectorOffset.Y) < 0)
            {
                antPosition = new IVector2(antPosition.X, antPosition.Y+1);
                SwapYEnds();
            }

        }

        return new IVector2(antPosition.X+vectorOffset.X, antPosition.Y+vectorOffset.Y);
    }

    private void SwapYEnds() {

        for(int i = 0; i < grid.size();i++)
        {
            ArrayList<Boolean> currentLine = grid.get(i);
            Boolean temp = currentLine.get(0);
            currentLine.set(0, currentLine.get(currentLine.size()-1));
            currentLine.set(currentLine.size()-1, temp);
        }
    }

    private void SwapXEnds() {
        ArrayList<Boolean> first = grid.get(0);
        ArrayList<Boolean> end = grid.get(grid.size()-1);
        for(int i =0; i < grid.get(0).size();i++)
        {
            Boolean temp = first.get(i);
            first.set(i, end.get(i));
            end.set(i, temp);
        }
    }

    private void AdjustGridX()
    {
        ArrayList<Boolean> newLine = new ArrayList<>();
        for(int i = 0; i < grid.get(0).size();i++)
        {
            newLine.add(false);
        }
        grid.add(newLine);
    }

    private void AdjustGridY()
    {
        for(ArrayList<Boolean> line : grid)
        {
            line.add(false);
        }
    }

    private void ModifyDirection(int delta)
    {
        if(delta > 0)
            direction = (direction+delta)%4;
        else if((direction+delta) < 0)
            direction = 3;
        else
        {
            direction += delta;
        }

    }

    private IVector2 DirectionToVectorOffset(int direction)
    {
        switch (direction)
        {
            case 0 : return new IVector2(1, 0);
            case 1 : return new IVector2(0, -1);
            case 2 : return new IVector2(-1, 0);
            case 3 : return new IVector2(0, 1);
        }
        return null;
    }
}

