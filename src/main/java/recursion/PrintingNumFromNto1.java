package recursion;

public class PrintingNumFromNto1
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(helper(n));
    }
    static int helper(int n)
    {
        if(n==1)
            return 1;
        else if(n<=0)
            return n;
        else {
            System.out.print(n+" ");
            return helper(n - 1);
        }
    }
}
