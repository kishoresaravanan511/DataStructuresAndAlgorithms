package Collections.foodordermanagementsystem.SetInterfaces;

import java.util.*;
public class SetDemonstration {
    public static void main(String[] args)
    {   //Set interface does not allow duplicates
        //it is internally backed by hashmap
        //store the set element as hashmap key and value is dummy constant object named PRESENT
        //provides O(1) time for lookups , using bucket index.
        //hashmap default bucket size is 16.
       Set<String> s = new HashSet<>();

      String str =  "apple";
      s.add(str);
      //int hash = str.hashCode();
      //System.out.println(hash);

      String str1 = "Apple";
      s.add(str1);
//      int hash1 = str1.hashCode();
//      System.out.println(hash1);

        System.out.println(s);
//        System.out.println("size of set");
       System.out.println(s.size());  //O(1) constant time

    }
}
