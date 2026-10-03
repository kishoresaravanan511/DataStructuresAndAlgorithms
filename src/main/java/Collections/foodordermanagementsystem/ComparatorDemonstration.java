package Collections.foodordermanagementsystem;

import java.util.*;
public class ComparatorDemonstration
{
    public static void main(String[] ars)
    {
        List<Integer> l = new ArrayList<>(Arrays.asList(90,20,40,10,2,3,1));

        l.sort((a,b) -> a.compareTo(b)); //Comparable interface  -> only natural orderings , only inside the class
        //l.sort(Comparator.naturalOrder()); l.sort(Comparator.reverseOrder()); //Comparator interface , multiple orderings , outside of a class.

        System.out.println(l);
    }

}
