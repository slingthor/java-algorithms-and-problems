package com.ingthor.Stacks_2;

import javax.management.OperationsException;
import java.util.ArrayList;

/**
 * Created by Ingthor on 17/06/2017.
 */
public class StackOfPlates
{
    ArrayList<Stack> stacks = new ArrayList<>();
    private int stackSize;
    int currentStack = 0;


    public StackOfPlates(int stackSize)
    {
        this.stackSize = stackSize;
        stacks.add(new Stack());
    }

    public void Push(int value)
    {
        Stack tempStack = stacks.get(currentStack);
        tempStack.Push(value);
        if(tempStack.Count > 9)
        {
            currentStack++;
            stacks.add(new Stack());
        }
    }

    public int Pop() throws OperationsException {
        Stack tempStack = stacks.get(currentStack);
        int value = tempStack.Pop();
        if(tempStack.Count == 0 && currentStack > 0)
        {
            stacks.remove(currentStack);
            currentStack--;
        }
        return value;
    }

    public boolean IsEmpty()
    {
        return stacks.get(0).Count == 0;
    }
}
