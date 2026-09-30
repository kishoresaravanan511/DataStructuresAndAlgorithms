package Iterators;

import java.util.*;
import java.util.concurrent.*;  //concurrent package contains classes like concurrentHashMap<>(),CopyOnWriteArrayList<>().
public class FailSafeIterators
{
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<>(Arrays.asList("X","Y"));
        List<String> l1 = new CopyOnWriteArrayList<>(l); //shallow copy of l
        Iterator<String> it = l1.iterator();  //we must iterate copy of original list.

        while(it.hasNext())
        {
            System.out.println(it.next());
            //Fail-Safe Iterators , it does not throw any exception
            //it.remove();   //UnsupportedOperationException, it works on immutable snapshot(cloned list).
            //l1.remove("X");  //it is acceptable , directly reflects on l1, it creates new Array
            l1.add("Z");
        }
        System.out.println("\n" + "Now, the exact l1 list after fail safe iterator");
        for(String x : l1)
        {
            System.out.println(x);
        }
    }
}
