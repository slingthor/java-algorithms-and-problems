package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 06/04/2017.
 */
public class StringCompression_1_6
{

    public static String CompressString (String stringToCompress)
    {
        char lastChar = '¬';
        boolean first = true;
        StringBuilder stringBuilder = new StringBuilder();

        int appendAmmount = 0;
        for(int i = 0; i < stringToCompress.length();i++)
        {
            char currChar = stringToCompress.charAt(i);
            if(lastChar == currChar)
            {
                appendAmmount++;
            }
            else
            {
                if(!first)
                {
                    stringBuilder.append(lastChar);
                    if(appendAmmount > 1)
                    {
                        stringBuilder.append(appendAmmount);
                    }
                }
                else
                {
                    first = false;
                }
                    appendAmmount = 1;

                lastChar = currChar;
            }
        }
        stringBuilder.append(lastChar);
        if(appendAmmount > 1)
        {
            stringBuilder.append(appendAmmount);
        }
        return stringBuilder.toString();
    }
}
