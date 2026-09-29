package NumberSeries;

import java.util.*;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=1000;i++)
        {
            if(isPerfect(i)) {
                l.add(i);
            }
        }
        System.out.println(l);
    }
    static boolean isPerfect(int x)
    {
        int ans = 0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i == 0)
            {
                ans += i;
            }
        }
        if(x == ans)
        {
            return true;
        }
        return false;
    }
}
