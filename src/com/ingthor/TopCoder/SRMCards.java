package com.ingthor.TopCoder;

import java.util.ArrayList;

/**
 * Created by Ingthor on 14/05/2017.
 */
public class SRMCards
{

    public int maxTurns(int[] cards)
    {
        ArrayList<Integer> cardsList = new ArrayList<>(cards.length);

        for(int i = 0; i < cards.length;i++)
        {
            cardsList.add(cards[i]);
        }

        int highestSimulation = 0;
        for(int i = 0; i < cards.length;i++)
        {
            int count = SimulationPath(cardsList, i);
            if(count > highestSimulation)
                highestSimulation = count;
        }

        return highestSimulation;
        //try picking card 1... n
        // then try picking card 1..n
        //return the simulation path that returns the highest number of turns
    }

    int SimulationPath(ArrayList<Integer> cards, int currIndex)
    {

        int highestSimulation = 0;
        if(cards.size() > 0)
        {
            cards = Turn(cards.get(currIndex), cards);
            for(int i = 0;i < cards.size();i++)
            {
                int count = SimulationPath(cards, i);
                if(count > highestSimulation)
                    highestSimulation = count;
            }
            return highestSimulation+1;
        }
        else
        {
            return 0;
        }
    }

    ArrayList<Integer> Turn(int cardSelected, ArrayList<Integer> cardsList)
    {
        ArrayList<Integer> newList = new ArrayList<Integer>(cardsList);
        newList.remove(new Integer(cardSelected));
        if(newList.contains(new Integer(cardSelected-1)));
            newList.remove(new Integer(cardSelected-1));
        if(newList.contains(new Integer(cardSelected+1)))
            newList.remove(new Integer(cardSelected+1));
        return newList;
    }
}
