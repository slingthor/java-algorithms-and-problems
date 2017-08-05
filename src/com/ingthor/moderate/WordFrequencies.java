package com.ingthor.moderate;

import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by Ingthor on 24/06/2017.
 */
public class WordFrequencies
{
    public int GetFrequency(String word, String[] book)
    {
        HashMap<String, Integer> occuranceCounter = new HashMap<>();
        for(int i = 0; i < book.length;i++)
        {
            if(!occuranceCounter.containsKey(book[i]))
            {
                occuranceCounter.put(book[i], 1);
            }
            else
            {
                occuranceCounter.replace(book[i], occuranceCounter.get(book[i])+1);
            }
        }
        if(occuranceCounter.containsKey(word))
            return occuranceCounter.get(word);
        return 0;
    }
}
