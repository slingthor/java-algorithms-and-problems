package com.ingthor.moderate;

public class Line
{
    public float yOffset;
    public float slope;

    public Line(float yOffset, float slope) {
        this.yOffset = yOffset;
        this.slope = slope;
    }

    public Line(Vector2 point1, Vector2 point2)
    {
        this.slope = (point2.Y-point1.Y)/(point2.X-point1.X);
        this.yOffset = point1.Y-this.slope*point1.X;
    }

    public boolean IsPointOnLine(Vector2 point)
    {
        return this.slope*point.X+yOffset == point.Y;
    }
}
