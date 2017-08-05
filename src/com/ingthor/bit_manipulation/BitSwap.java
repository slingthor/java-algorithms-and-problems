package com.ingthor.bit_manipulation;

/**
 * Created by Ingthor on 01/07/2017.
 */
public class BitSwap {

    public int SwapBits(int integer, int lIndex, int rIndex)
    {
        //get bits
        int lValue = (integer & (1 << lIndex)) != 0 ? 1 : 0;
        int rValue = (integer & (1 << rIndex)) != 0 ? 1 : 0;
        //clear both values
        int clearMask =  ~((1 << lIndex) | (1 << rIndex));
        integer = integer & clearMask;
        integer = (integer | (lValue << rIndex)) | (rValue << lIndex);
        return integer;
    }


}
