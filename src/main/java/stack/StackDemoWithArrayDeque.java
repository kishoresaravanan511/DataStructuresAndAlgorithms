package stack;

import java.util.*;
public class StackDemoWithArrayDeque {
    public static void main(String[] args)
    {
        //ArrayDeque is implements Deque interface, provides O(1) for push/pop, not synchronized.
        // it performs both LIFO as well as FIFO(Double ended queue - deque)
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }

//        //traditional method ,only LIFO, concrete class extends vector , synchronized, push pop takes much time
//        Stack<Integer> st = new Stack<>();
//
//        st.push(60);
//        st.push(70);
//        st.push(80);
//        System.out.println("\n");
//        while(!st.isEmpty())
//        {
//
//            System.out.print(st.pop());
//        }
    }
}
