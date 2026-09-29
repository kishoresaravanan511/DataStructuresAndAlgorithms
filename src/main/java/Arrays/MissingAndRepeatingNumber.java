package Arrays;

import java.util.*;

public class MissingAndRepeatingNumber
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,3,4,5};
        Map<Integer,Integer> m = new HashMap<>();
        int missing = 0;
        int repeating = 0;
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<=arr.length;i++)
        {
            int freq = m.getOrDefault(i,0);

            if(freq == 0)
            {
                missing = i;
            }
            if(freq > 1)
            {
                repeating = i;
            }
        }
        System.out.println(missing);
        System.out.println(repeating);
    }

}
