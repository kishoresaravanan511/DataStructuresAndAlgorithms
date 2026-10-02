package Iterators;

import Collections.foodordermanagementsystem.ManageOrders;

import java.util.*;
public class FailFastIterators {
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<>(Arrays.asList("abi","arun","akash","bagath","charlie","david","simon","kishore"));

        Iterator<String> it = l.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
            //Fail-Fast Iterators...
            l.add("ashwin");   //ConcurrentModificationException , modifies the structure of Arraylist internally , varying  modCount and expModCount from list and iterators , so it leads to Exception.
        }
    }
}
