package Arrays;

public class MaximumCircularSubarraySumNegatives
{
    public static void main(String[] args)
    {
        //int[] arr = {4,-1,-2,3};
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        int n = arr.length;
        int maxCurr = 0;
        int maxBest = arr[0];

        int minCurr = 0;
        int minBest = arr[0];

        int totalSum = 0;

        for(int i=0;i<arr.length;i++)
        {
            //kadane for max Subarray sum
            maxCurr = Math.max(arr[i],maxCurr+arr[i]);
            maxBest = Math.max(maxBest,maxCurr);

            minCurr = Math.min(arr[i],minCurr+arr[i]);
            minBest = Math.min(minBest,minCurr);

            totalSum += arr[i];
        }
        int normSum = maxBest;
        int circularSum = totalSum - minBest;
        if(minBest == totalSum) System.out.println(normSum);
        System.out.println(Math.max(circularSum,maxBest));
    }
}
