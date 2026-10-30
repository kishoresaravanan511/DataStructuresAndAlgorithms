package Heaps;

import java.util.*;
public class CustomMinHeap
{
    public static void main(String[] args)
    {
        MinHeap obj = new MinHeap();
        obj.insert(15);
        obj.insert(50);
        obj.insert(10);
        obj.insert(20);

        System.out.println(obj.peek());

        obj.display();

        System.out.println("\n");

        obj.removeMinOrTopNode();

        obj.display();
    }
}
class MinHeap
{
    List<Integer> heap = new ArrayList<>();
    public void insert(int val)
    {
        heap.add(val);
        int child = heap.size()-1;

        while(child > 0)
        {
            int parent = (child - 1)/2;
            //min heap = parent <= child
            //max heap = parent >= child
            if(heap.get(parent) <= heap.get(child))  //already in min heap structure
            {
                break;
            }

            //swapping the child and parent;
            int temp = heap.get(child);
            heap.set(child,heap.get(parent));
            heap.set(parent,temp);
            child = parent;  //check while condition
        }
    }
    public int peek()
    {
        if(heap.isEmpty())
        {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }
    public int sizeOfHeap()
    {
        return heap.size();
    }
    public boolean heapIsEmpty()
    {
        return heap.isEmpty();
    }
    public void removeMinOrTopNode()
    {
        int last = heap.remove(heap.size()-1);

        if(!heap.isEmpty())
        {
            heap.set(0,last);
            int parent = 0;

            while(true)
            {
                int leftChild = 2 * parent + 1;
                int rightChild = 2 * parent + 2;
                int smallest = parent;

                //change the < to > , if u want to implement the maxheap with root is always larger
                if(leftChild < heap.size() && heap.get(leftChild) < heap.get(rightChild))
                {
                    smallest = leftChild;
                }
                if(rightChild < heap.size() && heap.get(rightChild) < heap.get(leftChild))
                {
                    smallest = rightChild;
                }

                if(parent == smallest)
                {
                    break;
                }

                int temp = heap.get(smallest);
                heap.set(smallest,heap.get(parent));
                heap.set(parent,temp);
                parent = smallest;
            }
        }
    }
    public void display()
    {
        int n = heap.size();
        for(int i=0;i<n;i++)
        {
            System.out.print(heap.get(i)+" ");
        }
    }
}
