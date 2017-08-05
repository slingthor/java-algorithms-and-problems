package com.ingthor.chef;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ingthor on 04/06/2017.
 */
public class KnapSack
{
    int maxCapacity = 0;
    int n = -1;
    ArrayList<Item> items;
    public KnapSack(String filePath)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            n = Integer.parseInt(bufferedReader.readLine());
            items = new ArrayList<>();
            String line = bufferedReader.readLine();
            while(line != null)
            {
                String[] splitPair = line.split("\\s+");
                Item item = new Item(Integer.parseInt(splitPair[0]), Integer.parseInt(splitPair[1]));
                items.add(item);
                maxCapacity+= item.Weight;
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Integer[] GetCost()
    {
        ArrayList<Integer> costs = new ArrayList<>();
        for(int i = 1; i < maxCapacity+1;i++)
        {
            costs.add(GetCost(i));
        }
        return costs.toArray(new Integer[costs.size()]);
}

    private int GetCost(int capacity)
    {
        //take or take not, currentcost, currentWeight, currentIndex
        int currentWeight = 0;
        int currentCost = 0;
        int currentIndex = 0;
        return Math.max(SimulateKnapSack(currentWeight, currentCost, currentIndex, true, capacity), SimulateKnapSack(currentWeight, currentCost, currentIndex, false, capacity));
    }

    private int SimulateKnapSack(int currentWeight, int currentCost, int currentIndex, boolean take, int capacity) {

        if(currentIndex < items.size())
        {
            Item item = items.get(currentIndex);
            if(currentWeight+item.Weight <= capacity)
            {
                if(take)
                {
                    currentWeight += item.Weight;
                    currentCost += item.Cost;
                }
                currentIndex++;
                return Math.max(SimulateKnapSack(currentWeight, currentCost, currentIndex, true, capacity), SimulateKnapSack(currentWeight, currentCost, currentIndex, false, capacity));
            }
            else return currentCost;
        }
        else return currentCost;
    }
}

class Item
{
    public int Weight;
    public int Cost;

    public Item(int weight, int cost) {
        Weight = weight;
        Cost = cost;
    }
}
