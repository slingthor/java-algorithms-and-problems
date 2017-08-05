package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class GeneralizationOfMaxDifference {

    public float GetBatteryCharge(Vector3[] points)
    {
        float power = 0;
        float min = Integer.MAX_VALUE;
        float max = Integer.MIN_VALUE;
        Vector3 lastPoint = points[0];
        for(int i = 1; i < points.length;i++)
        {
            float yDelta = points[i].Y-lastPoint.Y;
            power =+ yDelta;
            min = Math.min(power, min);
            max = Math.max(power, max);
            lastPoint = points[i];
        }
        return max-min;
    }
}

