package Heaps;

import java.util.*;
public class TopKthLargestElements {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        KthLargest obj = new KthLargest();
        System.out.println(obj.largestElement(arr,k));
    }
}
class KthLargest
{
    public int largestElement(int[] nums,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

//        for(int i=0;i<nums.length;i++)
//        {
//            pq.offer(nums[i]);
//        }
//        for(int i=1;i<k;i++)
//        {
//            pq.poll();
//        }
//        return pq.poll();


        //without reverse the heap
        for(int x : nums) {
            if (pq.size() < k)
            {
                pq.add(x);
            }
            else if(x > pq.peek())
            {
                pq.poll();
                pq.offer(x);
            }
        }
        return pq.poll();   //peek()
    }
}
