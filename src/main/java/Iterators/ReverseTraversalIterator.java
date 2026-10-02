package Iterators;

import java.util.*;
public class ReverseTraversalIterator {
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10,20,30,40));

        //Iterator<Integer> it = l.iterator(l.size());  //not valid syntax
        ListIterator<Integer> li = l.listIterator(l.size());  //it is possible, to iterate from last index using size() as the parameter, so that it has the previous , it will be easy for iterate till first .
        while(li.hasPrevious())
        {
            //li.set(),remove(),add()//illegalstateexception , becoz lastreturnedelement is returned nothing , so it goes to illegal state
            System.out.println(li.previous());
            li.set(900); //valid , becoz , take a lastReturnedelement by use of previous(), so , it is in normal state , no illegal state
        }
        System.out.println("after the modification of list using listiterator");
        for(int x : l) //internally uses the iterator principles.
        {
            System.out.println(x);
        }
    }
}
