package Arrays;

import java.util.*;
public class MaxSumWhenIntegersAreNegative {
    public static void main(String[] args)
    {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int curr = arr[0];
        int best = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            curr = Math.max(arr[i],curr+arr[i]);  //if curr is negative , reset it to positive
            best = Math.max(best,curr); //and finds the best maxSum
        }
        System.out.println(best);
    }
}
