package Arrays;

import java.util.Arrays;

public class FAQProblem
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ind = 2;

        for(int i=ind;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        System.out.println("Deleted Array " + Arrays.toString(arr) + "\n");
        System.out.println("shifted Array " + Arrays.toString(shiftLeftAfterDeletingAnElement(arr,ind)));
    }
    private static int[] shiftLeftAfterDeletingAnElement(int[] arr,int ind)  //1,2,4,5,0
    { // 0/p = 4,5,0,1,2
        int[] res = new int[arr.length];
        int x = 0;
        for(int i=ind;i<arr.length;i++)
        {
            res[x++] = arr[i];
        }
        for(int i=0;i<ind;i++)
        {
            res[x++] = arr[i];
        }
        arr[arr.length-1] = 0;
        return res;
    }
}
