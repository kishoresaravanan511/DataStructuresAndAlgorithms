package Patterns;

public class HollowPattern
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<n;j++)
            {
                //System.out.print("* ");
                if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
        }
    }
}
