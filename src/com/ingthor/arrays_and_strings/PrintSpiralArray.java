package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class PrintSpiralArray
{
    int[][] matrix;
    int count = 0;
    int YMax = 0;
    int YMin = 0;
    int XMax = 0;
    int XMin = 0;
    StringBuilder sb;

    public PrintSpiralArray(int[][] matrix) {
        this.matrix = matrix;
    }

    public String MatrixToSpiralString()
    {
        sb = new StringBuilder();
        count = 0;
        XMax = matrix.length;
        YMax = matrix.length;
        while(count < (matrix.length*matrix.length))
        {
            RightDirection();
            DownDirection();
            LeftDirection();
            UpDirection();
        }
        return sb.toString();
    }

    private void RightDirection()
    {
        for(int i = XMin; i < XMax;i++)
        {
            sb.append(matrix[YMin][i] +",");
            count++;
        }
        YMin++;
    }

    private void DownDirection()
    {
        for(int i = YMin; i < YMax;i++)
        {
            sb.append(matrix[i][XMax-1] +",");
            count++;
        }
        XMax--;    }

    private void LeftDirection()
    {
        for(int i = XMax-1; i > XMin-1; i--)
        {
            sb.append(matrix[YMax-1][i] +",");
            count++;
        }
        YMax--;
    }

    private void UpDirection()
    {
        for(int i = YMax-1; i > YMin-1; i--)
        {
            sb.append(matrix[i][XMin] +",");
            count++;
        }
        XMin++;
    }
}
