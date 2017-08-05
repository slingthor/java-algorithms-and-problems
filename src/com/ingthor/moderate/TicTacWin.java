package com.ingthor.moderate;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class TicTacWin
{
    private final char emptyChar = '\u0000';
    char[][] table;

    public TicTacWin(char[][] table) {
        this.table = table;
    }

    public boolean AnyVictory()
    {
        return CheckHorizontal(0, 0, table.length)
                || CheckVertical(0, table.length, 0)
                || CheckLeftDiagonal()
                || CheckRightDiagonal();
    }

    private boolean CheckHorizontal(int x, int yStart, int yEnd)
    {
        char first = table[x][yStart];
        if(first == emptyChar) return false;

        boolean allSame = true;
        for(int y = yStart+1; y < yEnd; y++)
        {
            if(table[x][y] != first)
            {
                allSame = false;
                break;
            }
        }
        return allSame;
    }

    private boolean CheckVertical(int xStart, int xEnd, int y)
    {
        char first = table[xStart][y];
        if(first == emptyChar) return false;

        boolean allSame = true;
        for(int x = xStart+1; y < xEnd; y++)
        {
            if(table[x][y] != first)
            {
                allSame = false;
                break;
            }
        }
        return allSame;
    }

    private boolean CheckLeftDiagonal()
    {
        int x = 1;
        int y = 1;
        char first = table[0][0];
        if(first == emptyChar) return false;

        boolean allSame = true;

        while(x < table.length && y < table[x].length)
        {
            if(table[x][y] != first)
            {
                allSame = false;
                break;
            }
            x++;
            y++;
        }
        return  allSame;
    }

    private boolean CheckRightDiagonal()
    {
        int x = 0;
        int y = table[x].length-1;
        char first = table[0][table[x].length-1];
        if(first == emptyChar) return false;

        boolean allSame = true;

        while(x < table.length)
        {
            if(table[x][y] != first)
            {
                allSame = false;
                break;
            }
            x++;
            y--;
        }
        return allSame;
    }
}
