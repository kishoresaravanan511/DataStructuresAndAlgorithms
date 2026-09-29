package NumberSeries;

import java.util.*;
public class StrongNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //145
        int copy = n;
        int ans = 0;
        while(n!=0)
        {
            int r = n%10;
            ans+=factorial(r);
            n/=10;
        }

        if(ans == copy)
            System.out.println("True");
        else
            System.out.println("False");
    }
    static int factorial(int n)
    {
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
