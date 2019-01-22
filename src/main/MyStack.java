package main;

import java.util.Stack;

public class MyStack
{
    int size;
    int topofstack=-1;
    int[] stackarray;
    public MyStack(int size)
    {
        this.size=size;
        stackarray=new int[size];
    }
    void push(int value)
    {
            // todo check if array is already full
        if(isFull() == false)
        {

        }
    }
    boolean isFull()
    {
        boolean response = false;
        if(stackarray[stackarray.length - 1] != 0 && topofstack == stackarray.length - 1)
        {
            response = true;
        }
        return response;
    }
    int pop()
    {

    }


    public static void main(String[] args)
    {
        Stack stack1 = new Stack( size: 10);
        for(int length =stack1.stackarray.length-1; length >= 0;length--)
        {
            System.out.println(stack1.stackarray[length]);
        }
        for(int i=0;i<10;i++)
        {
            stack1.push(value:40 + i);
        }
        System.out.println("--------");
        for(int length =stack1.stackarray.length-1; length >= 0;length--)
        {
            System.out.println(stack1.stackarray[length]);
        }
    }


}
