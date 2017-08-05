package com.ingthor.SPOJ;

import com.ingthor.Sorting.QuickSort;

import java.io.*;

/**
 * Created by Ingthor on 14/05/2017.
 */
public class AGGRCOW
{
    File inputFile;
    public AGGRCOW(File file)
    {
        this.inputFile = file;
        ParseInput();
    }

    int testCases;
    int barnCount;
    int cowCount;
    int[] sortedBarns;

    void ParseInput()
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            testCases = Integer.parseInt(reader.readLine());
            String[] lineTwoSplit = reader.readLine().split(" ");
            barnCount = Integer.parseInt(lineTwoSplit[0]);
            cowCount = Integer.parseInt(lineTwoSplit[1]);
            int[] barns = new int[barnCount];
            for(int i = 0 ; i< barnCount;i++)
            {
                barns[i] = Integer.parseInt(reader.readLine());
            }
            QuickSort sort = new QuickSort();
            sort.Sort(barns);
            sortedBarns = barns;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Run()
    {
        int max = sortedBarns[sortedBarns.length-1];
        int min = sortedBarns[0];
        cowCount--;

    }

}
