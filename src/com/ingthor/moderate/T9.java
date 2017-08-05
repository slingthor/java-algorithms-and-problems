package com.ingthor.moderate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Ingthor on 28/06/2017.
 */
public class T9 {

    private HashMap<Integer,ArrayList<Character>> indexing = new HashMap<>();

    public T9() {

    }

    public String NumberToText(String numberSequence)
    {
        if(numberSequence.length() < 1)
            return "";

        StringBuilder stringBuilder = new StringBuilder();

        int lastNum = Character.getNumericValue(numberSequence.charAt(0));
        int occurance = 1;
        for(int i = 1; i < numberSequence.length();i++)
        {
            int num = Character.getNumericValue(numberSequence.charAt(i));
            if(num == lastNum)
            {
                occurance++;
            }
            else
            {
                ArrayList<Character> indexingSequence = indexing.get(lastNum);
                Character wantedCharacter = indexingSequence.get(occurance%indexingSequence.size());
                stringBuilder.append(wantedCharacter);
                occurance = 0;
            }
            lastNum = num;
        }

        ArrayList<Character> indexingSequence = indexing.get(lastNum);
        Character wantedCharacter = indexingSequence.get(occurance%indexingSequence.size());
        stringBuilder.append(wantedCharacter);
        return  stringBuilder.toString();
    }
}
