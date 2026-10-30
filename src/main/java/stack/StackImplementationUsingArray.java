package stack;

import java.util.*;
public class StackImplementationUsingArray
{
    public static void main(String[] args)
    {
        StackImplementation obj = new StackImplementation(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        System.out.println("peek : " + obj.peek());

        while(!obj.isEmpty())
        {
            System.out.print(obj.pop() + " ");
        }
    }
}
class StackImplementation
{
    int[] stack;
    int top = -1;

    StackImplementation(int n)//size
    {
        stack = new int[n];
    }

    //business logic
    boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }

    boolean isFull()
    {
        return top == stack.length - 1;
    }

    void push(int val)
    {
        if(isFull())
        {
            throw new NoSuchElementException("Stack is full");  //overflow
        }
        else {
            stack[++top] = val;
        }
    }

    int pop()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Stack is empty");  //underflow
        }
        else {
            int x = stack[top--];
            return x;
        }
    }
    int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException("Peek not found");
        }
        return stack[top];
    }

}
