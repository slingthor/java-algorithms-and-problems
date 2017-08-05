package com.ingthor.moderate;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class Vector2
{
    public float X;
    public float Y;

    public Vector2(float x, float y) {
        X = x;
        Y = y;
    }

    @Override
    public String toString() {
        return "{" + X + "," + Y + '}';
    }
}
