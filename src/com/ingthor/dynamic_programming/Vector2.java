package com.ingthor.dynamic_programming;

public class Vector2
{
    public int X;
    public int Y;

    public Vector2(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "{" + X + "," + Y + '}';
    }
}
