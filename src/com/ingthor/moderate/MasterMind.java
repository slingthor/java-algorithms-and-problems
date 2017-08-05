package com.ingthor.moderate;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ingthor on 25/06/2017.
 */
public class MasterMind {

    ArrayList<Color> answer;

    public MasterMind(Color first, Color second, Color third, Color fourth) {
        answer = new ArrayList<>();
        answer.add(first);
        answer.add(second);
        answer.add(third);
        answer.add(fourth);
    }

    public Answer Guess(Color first, Color second, Color third, Color fourth)
    {
        ArrayList<Color> guess = new ArrayList<>();
        guess.add(first);
        guess.add(second);
        guess.add(third);
        guess.add(fourth);

        HashMap<Color, Boolean> pseudoguesses = new HashMap<>();
        //init pseudogusses


        //set pseudoguesses

        //set fullguesses
        int correctGusses = 0;
        int end = 4;
        ArrayList<Color> guessCopy = new ArrayList<>(guess);
        for(int i = 0; i < end; i++)
        {
            if(answer.get(i) == guessCopy.get(i))
            {
                answer.remove(i);
                pseudoguesses.remove(i);
                i--;
                end--;
                correctGusses++;
            }
        }

        for (Color color : answer) {
            if(!pseudoguesses.containsKey(color))
            {
                pseudoguesses.put(color, false);
            }
        }

        int pseudoGuessCount = 0;

        for (Color color : guess) {
            if(pseudoguesses.containsKey(color))
                pseudoguesses.replace(color, true);
        }

        for (Color color : pseudoguesses.keySet()) {
           if(pseudoguesses.get(color))
               pseudoGuessCount++;
        }



        return new Answer(pseudoGuessCount, correctGusses);
    }





    public class Answer
    {
        public int PseudoGuesses;
        public int FullGuesses;

        public Answer(int pseudoGuesses, int fullGuesses) {
            PseudoGuesses = pseudoGuesses;
            FullGuesses = fullGuesses;
        }
    }
}


