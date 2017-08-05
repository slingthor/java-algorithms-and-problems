package com.ingthor.moderate;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class BestLine
{
    public Line FindBestLine(Vector2[] points)
    {
        int maxNumberOfPoints = 0;
        Line lineWithMostPoints = null;
        for(int i = 0; i < points.length; i++)
        {
            for(int j = i;j < points.length;j++)
            {
                Line line = new Line(points[i], points[j]);
                int numberOfPoints = 0;
                for(int k = 0; k < points.length;k++)
                {
                    if(line.IsPointOnLine(points[k]))
                    {
                        numberOfPoints++;
                    }
                }
                if(numberOfPoints > maxNumberOfPoints)
                {
                    maxNumberOfPoints = numberOfPoints;
                    lineWithMostPoints = line;
                }
            }
        }
        return lineWithMostPoints;
    }
}

