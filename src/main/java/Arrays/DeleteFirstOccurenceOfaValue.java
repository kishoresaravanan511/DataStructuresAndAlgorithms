package Arrays;

import java.util.*;
public class DeleteFirstOccurenceOfaValue {
    public static void main(String[] args) {
        int[] arr = {7,9,1,8,4,2,8,9,5};
        int val = 8;
        int need = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == val)
            {
                need = i;
                break;
            }
        }
        for(int i=need;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
