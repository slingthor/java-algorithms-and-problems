package com.ingthor.bit_manipulation;

/**
 * Created by Ingthor on 01/05/2017.
 */
public class BitOperations
{
    //5.1 Insertion
    //Inserts num1 into num2 at bitPos1 to bitPos2(inclusive)
    public static int Insertion(int numFrom, int numTo, int bitPosStart, int bitPosEnd)
    {
        int bitMask = BuildBitMaskRange(bitPosStart, bitPosEnd);
        for(int i = 31; i > -1; i--)
        {
            if(BitUtils.GetBit(bitMask, i))
            {
                numTo = BitUtils.UpdateBit(numTo, i, BitUtils.GetBit(numFrom, i));
            }
        }
        return numTo;
    }

    public static int BuildBitMaskRange(int bitPosStart, int bitPosEnd)
    {
        //create bit mask
        int bitMask = 0;
        boolean bitPosStartFound = false;
        for(int i = 31; i > -1; i--)
        {
            if(!bitPosStartFound)
            {
                if(BitUtils.GetBit(bitPosStart, i))
                {
                    bitPosStartFound = true;
                }
            }
            if(bitPosStartFound)
            {
                bitMask = BitUtils.SetBit(bitMask, i);
            }
            if(BitUtils.GetBit(bitPosEnd, i))
            {
                return bitMask;
            }
        }
        throw new IllegalArgumentException("bitPos and bitEnd don't match");
    }

    public static int FlipBitToWin(int bitMask)
    {
        int skippedIndex = 0;
        boolean skipped = false;
        int longestDistance = 0;
        int currDistance = 0;
        for(int i = 31; i > -1;i++)
        {
            if(BitUtils.GetBit(bitMask, i))
            {
                currDistance++;
                if(currDistance > longestDistance)
                {
                    longestDistance = currDistance;
                }
            }
            else
            {
                if(!skipped)
                {
                    currDistance++;
                    if(currDistance > longestDistance)
                    {
                        longestDistance = currDistance;
                    }
                    skipped = true;
                    skippedIndex = i;
                }
                else
                {
                    i = skippedIndex;
                    currDistance = 0;
                    skipped = false;
                }
            }
        }
        return longestDistance;
    }
}
