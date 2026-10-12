package recursion;

public class StringPalindromeOrNot
{
    public static void main(String[] args)
    {
        String s = "malayalam";
        int len = s.length()-1;

        if(s.equals(new String(palindrome(s,len))))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    private static String palindrome(String s,int n)
    {
        if(n==0)
        {
            return String.valueOf(s.charAt(0));
        }
        else {
            return s.charAt(n) + palindrome(s,n-1);
        }
    }
}
