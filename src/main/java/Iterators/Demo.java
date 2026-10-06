package Iterators;

import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
        //List<String> l = new ArrayList<>();
//        Set<String> l = new HashSet<>();
//        Set<String> l1 = new HashSet<>();
//        l1.add("c++");
//        l.add("java");
////        l.add("kotlin");
////        l.add(1,"c++");
//        l.add("java");
//        l.add("java");
//        l.add("html");
//
//        l.retainAll(l1);  //common objects in both Sets.
//        System.out.println(l);
        ArrayList<Integer> a = new ArrayList<>(); //List(subInterface) does not have ensureCapacity , but it has alternative , that is capacity is passed through ArrayList<>() , constructors..
        //optimiizing the resizing of an dynamic array, strict O(1),not amortized O(1)
        a.ensureCapacity(1000);  //efficient for known data information like for loop,we know the exact elements to be stored in that list

        for(int i=1;i<=60;i++)
        {
            a.add(i);
        }
        a.trimToSize();   //removes the unused internal capacity of a list..not remove any elements . just remove the unused capacity..
        System.out.println(a.size()); //Capacity is like tables in restaurant,size is like customers filled in the tables

        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(null);
        

        System.out.println(l.size());


//        Iterator<String> it = l.iterator();
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        //Collections.sort(l);  //[c++, cobalt, html, java, pascal, python]
        //Collections.reverse(l);  //[pascal, java, html, cobalt, c++, python]
//        Collections.sort(l,Collections.reverseOrder());  //Z - A
//        l.clear();
//        l.remove("java");
//        System.out.println(l);
    }
}
