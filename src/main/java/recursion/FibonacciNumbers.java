package recursion;

public class FibonacciNumbers
{
    public static void main(String[] args) {
    int n = 10;

        for(int i=0;i<10;i++)
        {
            System.out.println(fibo(i) + " ");
        }
    }
    static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
