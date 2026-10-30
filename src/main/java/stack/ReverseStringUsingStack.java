package stack;

import java.util.*;
public class ReverseStringUsingStack {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Deque<Character> st = new ArrayDeque<>();

        for(char c : s.toCharArray())
        {
            st.push(c);
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
}
