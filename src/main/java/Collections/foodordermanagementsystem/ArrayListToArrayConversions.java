package Collections.foodordermanagementsystem;

import java.lang.reflect.Array;
import java.util.*;
public class ArrayListToArrayConversions {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10,20,30));

        //Object[] arr = l.toArray();  toArray() returns a Object[] array so , it is not required the explicit type .
        Integer[] nums = l.toArray(new Integer[0]); //but , here we need to specify  the type to be stored inside the array
        //Object[] num = nums; //valid upcast

        //suppose , we want to convert arraylist into static array means, we create a static array of arraylist's size , then we copy it using get() .

        System.out.println(Arrays.toString(nums));


    }
}
