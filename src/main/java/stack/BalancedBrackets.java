package stack;

import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args)
    {
        BalancedBracketService obj = new BalancedBracketService();
        System.out.println(obj.isBalanced("{[()]}"));
    }
}
class BalancedBracketService  //Business logic
{
    public boolean isBalanced(String s)
    {
        Deque<Character> st = new ArrayDeque<>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else
            {
                char prev = st.pop();
                if((c == ')' && prev != '(') || (c == ']' && prev != '[') || (c=='}' && prev!='{'))
                    return false;
            }
        }
        return st.isEmpty();
    }
}
