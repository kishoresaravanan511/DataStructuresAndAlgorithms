package Collections.foodordermanagementsystem;

import java.util.*;
public class ArrayListInternals
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(100);  //ensureCapacity through constructors
        ArrayList<Integer> aL = new ArrayList<>();
        aL.ensureCapacity(100);

        //both optimizing strategies belongs to ArrayList Class(ensureCapacity() and trimToSize() ).
        //both of the methods are only used for internal optimization(capacity) , not for size() of an arrayList.
        for(int i=10;i<60;i++)
        {
            aL.add(i);
            l.add(i);
        }
        System.out.println("ArrayList class : " + aL.size()+ "  List Interface type : " +l.size());  //50   50
        aL.trimToSize();
        //l.trimToSize();  //List interface type does not contains this both the methods
        System.out.println("ArrayList class : " + aL.size());


    }
}
