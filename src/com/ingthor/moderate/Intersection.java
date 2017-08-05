package com.ingthor.moderate;


/**
 * Created by Ingthor on 24/06/2017.
 */
public class Intersection {

    public Vector2 FindIntersect(Vector2 firstStart, Vector2 firstEnd, Vector2 secondStart, Vector2 secondEnd)
    {

        float firstSlope = GetSloap(firstStart, firstEnd);
        float secondSlope = GetSloap(secondStart, secondEnd);
        Line firstLine = new Line(GetHeightOffset(firstStart, firstSlope), firstSlope);
        Line secondLine = new Line(GetHeightOffset(secondStart, secondSlope), secondSlope);
        return FindIntercept(firstLine, secondLine);
    }

    private float GetSloap(Vector2 start, Vector2 end)

    {
        return (end.Y-start.Y)/(end.X-start.X);
    }

    private float GetHeightOffset(Vector2 start, float slope)
    {

        return start.Y/(slope*start.X);
    }

    private Vector2 FindIntercept(Line line1, Line line2)
    {
        float totalSlope = line1.slope-line2.slope;
        float totalYOffset = line2.yOffset-line1.yOffset;
        float finalX = totalYOffset/totalSlope;
        float finalY = line1.slope*finalX+line1.yOffset;
        return new Vector2(finalX, finalY);
    }





}

