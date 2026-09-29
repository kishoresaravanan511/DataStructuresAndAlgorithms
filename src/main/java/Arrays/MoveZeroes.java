package Arrays;

import java.util.*;
public class MoveZeroes
{
    public static void main(String[] args)
    {
        int[] arr = {0, 5, 0, 3, 9, 0, 22, 7};
        int ind = 0;

        //approach 1   (straight forward solution with index)
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i] != 0)
//            {
//                arr[ind++] = arr[i];
//            }
//        }
//        while(ind < arr.length)
//        {
//            arr[ind++] = 0;
//        }

//approach 2 (two pointers)

        int l = 0;
        for(int r=0;r<arr.length;r++)
        {
            if(arr[r] != 0)
            {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
