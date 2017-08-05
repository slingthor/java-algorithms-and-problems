package com.ingthor.chef;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingthor on 14/05/2017.
 */
public class Chef_and_medium_problem {

    File inputFile;
    public Chef_and_medium_problem(File file)
    {
        inputFile = file;
    }

    //integer count
    int N;
    //The integers
    public int[] A;
    //queryCount
    int M;

    private List<Query> queries = new ArrayList<Query>();

    public void ReadInput()
    {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            String numInts = fileReader.readLine();
            N = Integer.parseInt(numInts);
            String intsAsString = fileReader.readLine();
            String[] intStrings = intsAsString.split(" ");
            int[] ints = new int[intStrings.length];
            for(int i = 0; i < intStrings.length;i++)
            {
                ints[i] = Integer.parseInt(intStrings[i]);
            }
            A = ints;

            M = Integer.parseInt(fileReader.readLine());

            for(int i = 0; i < M;i++)
            {
                String[] queriesAsStr = fileReader.readLine().split(" ");
                int[] query = new int[queriesAsStr.length];
                for(int j = 0; j < query.length; j++)
                {
                    query[j] = Integer.parseInt(queriesAsStr[j]);
                }
                int queryType = query[0];
                if(queryType == 1)
                {
                    int l = query[1]-1;
                    int r = query[2]-1;
                    int[] p = new int[query.length-3];
                    int pIndex = 0;
                    for(int j = 3; j < query.length;j++)
                    {
                        p[pIndex] = query[j];
                        pIndex++;
                    }
                    queries.add(new OneQuery(l, r, p));
                }
                else
                {
                    int l = query[1]-1;
                    int d = query[2];
                    queries.add(new TwoQuery(l,d));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void PerformQueries()
    {
        for(Query query : queries)
        {
            query.PerformQuery(A);
        }
    }


    class OneQuery implements Query
    {
        public int L;
        public int R;
        public int[] P;

        public OneQuery(int l, int r, int[] p) {
            L = l;
            R = r;
            P = p;
        }

        @Override
        public void PerformQuery(int[] A)
        {
            for(int i = L; i < R+1; i++)
            {
                for(int j = 0; j < P.length; j++)
                {
                    if(A[i]%P[j] == 0)
                    {
                        A[i] = A[i]/P[j];
                    }
                }
            }
        }
    }

    class TwoQuery implements Query
    {
        public int L;
        public int D;

        public TwoQuery(int l, int d) {
            L = l;
            D = d;
        }

        @Override
        public void PerformQuery(int[] A)
        {
            A[L] = D;
        }
    }

    interface Query
    {
        void PerformQuery(int[] A);
    }
}
