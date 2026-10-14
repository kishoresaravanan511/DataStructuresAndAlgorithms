package Arrays;

public class SecondLargest
{
    public static void main(String[] args) {
        int[] arr = {90,18,30,96,79,74,96,80};
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largest)
            {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}
