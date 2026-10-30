package stack;

import org.w3c.dom.Node;

import java.util.*;
public class StackImplementationUsingLinkedList {
    public static void main(String[] args)
    {
        StackLinkedList st = new StackLinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.pop();

        System.out.println(st.peek());

        st.display();
    }
}
class NodeStack
{
    int data;
    NodeStack next = null;

    NodeStack(int data)
    {
        this.data = data;
    }
}
class StackLinkedList
{
    int size = 0;
    NodeStack top;

    public void push(int val)
    {
        NodeStack nn = new NodeStack(val);  //reverse insertion in linkedlist like 40->30->20->10, so ,
        // when we traverse a list , it exactly behave like LIFO pattern.
        nn.next = top;
        top = nn;
        size++; //stack size
    }
    public int pop()
    {
        if(top == null)
        {
            throw new IllegalStateException("no pop operation is performed");
        }
        else {
            int value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }
    public int peek()
    {
        if(top == null) throw new IllegalStateException("peek not found");
        return top.data;
    }

    public int size()
    {
        return size;
    }

    public void display()
    {
        NodeStack curr = top;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

