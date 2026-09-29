package Patterns;

public class Star
{
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++,System.out.println())
        {
            for (int j = 5; j>i; j--)
            {
                    System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
        }
        for(int i=n-1;i>0;i--,System.out.println())
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--)
            {
                System.out.print("*");
            }

        }
    }
}
