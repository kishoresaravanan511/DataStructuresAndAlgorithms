package Collections.foodordermanagementsystem;

import java.util.*;
public class ArrayListInternals
{
    //java arraylist class uses the formula (size+1) > capacity ,
    // which triggers the grow() in arraylist class, then after that ,
    // dynamic size of an arraylist grows ,
    // by the principle of oldcapacity of an present arraylist * 1.5
    // changes the present list capacity into new arraylist of updated capacity
    // which ofcourse copy the references of old arraylist into new by copying their references
    // not the exact object, which leads to O(n) , then said as amortized O(1).

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
