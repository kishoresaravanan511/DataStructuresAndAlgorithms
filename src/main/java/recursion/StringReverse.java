package recursion;

public class StringReverse
{
    public static void main(String[] args)
    {
        String s = "don";
        int len = s.length()-1;
        String ans = reverse(s,len);
        System.out.println(ans);

    }
    private static String reverse(String s,int n)
    {
        if(n==0)
        {
            return String.valueOf(s.charAt(0));
        }
        else {
            return s.charAt(n) + reverse(s,n-1);
        }
    }
}
