package recursion;

public class SumOfOnetoN
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(sum(n,0));
    }
    private static int sum(int n,int accum)
    {
        if(n<=0)    return accum;
        else    return sum(n-1,accum+n);
    }
}
