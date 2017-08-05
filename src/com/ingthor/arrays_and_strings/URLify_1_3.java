package com.ingthor.arrays_and_strings;

/**
 * Created by Ingthor on 06/04/2017.
 */
public class URLify_1_3 {
    public static char[] URLify(char[] stringToUrlify, int stringLength)
    {
        int end = stringLength;
        int occurance = 0;
        for(int i = 0; i < end; i++)
        {
            if(Character.isWhitespace(stringToUrlify[i]))
            {
                occurance++;
            }
        }
        int totalPadding = occurance*2;
        for(int i = end; i > -1;i--)
        {
            if(Character.isWhitespace(stringToUrlify[i]))
            {
                totalPadding = totalPadding-2;
                stringToUrlify[i+totalPadding] = '%';
                stringToUrlify[i+totalPadding+1] = '2';
                stringToUrlify[i+totalPadding+2] = '0';
            }
            else
            {
                char current =stringToUrlify[i];
                stringToUrlify[i+totalPadding] = current;
            }
        }
        return stringToUrlify;
    }
}
