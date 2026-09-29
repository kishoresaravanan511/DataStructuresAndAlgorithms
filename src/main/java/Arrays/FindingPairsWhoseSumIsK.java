package Arrays;

import java.util.*;
public class FindingPairsWhoseSumIsK
{
    public static void main(String[] args)
    {
        int[] arr = {2, 7, 11, 16, 3, 6, 8};
        int target = 10;

        //naive (straight forward solution)

//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i] + arr[j] == target)
//                {
//                    System.out.println(arr[i] + "+" + arr[j] +"=" + target);
//                }
//            }
//        }

        //HashMap solution(0(1) look up)

        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(target-arr[i]))
            {
                System.out.println(arr[i] + "+" + (target-arr[i]) + "=" + target);
            }
            m.put(arr[i],i);
        }
    }
}
