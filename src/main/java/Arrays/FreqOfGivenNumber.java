package Arrays;

public class FreqOfGivenNumber
{
    public static void main(String[] args)
    {
        int[] arr = {2,1,4,9,2,6,5,2,1,19,8,6,5,4};
        int k = 1;
        int[] freq = new int[100];
        for(int x : arr)
        {
            freq[x]++;
        }
        System.out.println(freq[k]);
    }
}
