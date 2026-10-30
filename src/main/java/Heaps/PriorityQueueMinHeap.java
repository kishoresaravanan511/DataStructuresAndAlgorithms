package Heaps;

import java.util.*;
public class PriorityQueueMinHeap {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(20);
        minHeap.offer(30);
        minHeap.offer(80);
        minHeap.offer(10);
        minHeap.offer(50);
        minHeap.offer(60);
        minHeap.offer(90);
        minHeap.offer(40);

        System.out.println(minHeap.peek());   //top of the heap/root

        System.out.println(minHeap.size());

        while(!minHeap.isEmpty())
        {
            System.out.print(minHeap.poll()+" ");  //remove the root element in a heap
        }
    }
}
