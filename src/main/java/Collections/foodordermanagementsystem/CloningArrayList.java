package Collections.foodordermanagementsystem;

import java.lang.reflect.Array;
import java.util.*;
public class CloningArrayList {
    public static void main(String[] args)
    {
        ArrayList<Orders> original = new ArrayList<>();

        original.add(new Orders(800,"john","hyd","momos",2,60.0));
        //there are two ways to create a cloning array.
        ArrayList<Orders> copy = new ArrayList<>(original);  //preferred constructor style
        //ArrayList<Orders> copy = (ArrayList<Orders>)original.clone(); //casting to arraylist

        Iterator<Orders> it = copy.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
            copy.get(0).orderId = 300;
        }
        System.out.println("original after shallow copy : " + "\n");
        for(Orders o : original)
        {
            System.out.println(o);
        }
    }
}
