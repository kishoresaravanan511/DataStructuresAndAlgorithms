package recursion;

public class FactorialOfaNumber
{
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }
    static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
