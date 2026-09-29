package Arrays;

public class MaximumDifference
{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int min = arr[0];
        int maxDiff = 0;
        for(int i=1;i<arr.length;i++)
        { //important
            maxDiff = Math.max(maxDiff,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        System.out.println(maxDiff);
    }
}
