package Arrays;

import java.util.*;
public class DeleteElementAtIndex
{
    public static void main(String[] args)
    {
       int[] arr = {9,5,2,4,3,6,7};
       int ind = 3;
       for(int i=ind;i<arr.length-1;i++)
       {
           arr[i] = arr[i+1];
       }
        arr[arr.length-1] = -1;  //replace the copy value

        System.out.println(Arrays.toString(arr));
    }
}
