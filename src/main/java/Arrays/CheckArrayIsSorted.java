package Arrays;

public class CheckArrayIsSorted
{
    public static void main(String[] args) {
        int[] arr = {2,6,8,9,10};
        int l = 0;
        int r = arr.length-1;
        while(l<r)
        {
            if(arr[l] > arr[r])
            {
                System.out.println("Unsorted");
                return;
            }
            l++;
            r--;
        }
        System.out.println("sorted");
    }
}
