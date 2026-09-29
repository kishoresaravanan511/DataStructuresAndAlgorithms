package Patterns;

public class IBM_Pattern
{
    public static void main(String[] args)
    {
        int n = 5;
        int ans;
        for(int i=0;i<n;i++,System.out.println())
        {
            char c = 'A';
            for(int j=0;j<n;j++)
            {
                if(i==j || (i+j)==n-1)  //(n-i-1)
                {
                    ans = c+Math.min(i,(i+j));  //(n-i-1)
                    System.out.print((char)ans);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}
