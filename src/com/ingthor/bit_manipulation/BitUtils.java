package com.ingthor.bit_manipulation;

/**
 * Created by Ingthor on 01/05/2017.
 */
public class BitUtils
{
    public static boolean GetBit(int num, int i)
    {
        return (num &(1 << i)) != 0;
    }

    public static int SetBit(int num, int i)
    {
        return(num|(1 << i));
    }

    public static int ClearBit(int num, int i)
    {
        int mask = ~(1 << i);
        return mask & num;
    }

    public static int UpdateBit(int num, int i, boolean bitIs1)
    {
        int value = bitIs1 ? 1 : 0;
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }

    public static String MaskToString(int num)
    {
        StringBuilder builder = new StringBuilder(32);
        for(int i = 31; i > -1;i--)
        {
           builder.append (GetBit(num, i) ? '1' : '0' );
        }
        return builder.toString();
    }
}
