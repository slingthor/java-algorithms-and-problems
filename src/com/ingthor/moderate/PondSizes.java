package com.ingthor.moderate;

import java.util.ArrayList;

/**
 * Created by Ingthor on 27/06/2017.
 */
public class PondSizes
{
    int[][] matrix;
    ArrayList<Integer> FindPondSize(int[][] matrix)
    {
        this.matrix = matrix;
        ArrayList<Integer> pondSizes = new ArrayList<>();

        for(int i = 0; i < matrix.length;i++)
        {
            for(int j = 0 ; j < matrix[0].length;j++)
            {
                //meaning it's water
                if(matrix[i][j] == 0)
                {
                     pondSizes.add(GetSize(i, j));
                }
            }
        }
        return pondSizes;
    }

    private Integer GetSize(int i, int j) {

        if(i < 0 || i > matrix.length-1 || j < 0 || j > matrix[0].length-1 || matrix[i][j] != 0)
        return 0;
        //mark visited
        matrix[i][j] = -1;
        int size = 1;
        for(int k = i-1; k < i+2; k++)
        {
            for(int l = j-1; l < j+2; l++)
            {
                size += GetSize(k, l);
            }
        }
        return size;
    }
}
