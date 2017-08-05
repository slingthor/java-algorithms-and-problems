package com.ingthor.Stacks_2;

import javax.management.OperationsException;

/**
 * Created by Ingthor on 17/06/2017.
 */
public class StackQueue
{
    Stack stack1;
    Stack stack2;

    public StackQueue() {
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }

    public int Deque() throws OperationsException {
        while(!stack1.IsEmpty())
        {
            stack2.Push(stack1.Pop());
        }
        return stack2.Pop();
    }

    public void Enqueue(int value) throws OperationsException {
        while (!stack2.IsEmpty())
        {
            stack1.Push(stack2.Pop());
        }

        stack1.Push(value);
    }

}
