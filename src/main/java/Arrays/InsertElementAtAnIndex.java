package Arrays;

import java.util.*;
public class InsertElementAtAnIndex
{
    public static void main(String[] args) {
        int[] arr = {90,89,88,87,86};
        int ind = 2;
        int val = 99;
        int i;

        for(i=arr.length-1;i > ind;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[i] = val;

        System.out.println(Arrays.toString(arr));
    }
}
