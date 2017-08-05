package com.ingthor.moderate;

import java.util.HashMap;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class LivingPeople
{
    HashMap<Integer, Integer> yearCount;

    public int MostCommonYear(LivingYears[] livingYears)
    {
        for(int i = 0; i < livingYears.length;i++)
        {
            for(int j = livingYears[i].Birth;j< livingYears[i].Death+1;j++)
            {
                if(!yearCount.containsKey(j))
                {
                    yearCount.put(j, 1);
                }
                else
                {
                    yearCount.replace(j, yearCount.get(j)+1);
                }
            }
        }
        int maxLiving = 0;
        int maxYear = 0;

        for(Integer year : yearCount.keySet())
        {
            int living = yearCount.get(year);
            if(living > maxLiving)
            {
                maxLiving = living;
                maxYear = year;
            }
        }
        return maxYear;
    }

    public class LivingYears
    {
        public int Birth;
        public int Death;

        public LivingYears(int birth, int death) {
            Birth = birth;
            Death = death;
        }
    }
}
