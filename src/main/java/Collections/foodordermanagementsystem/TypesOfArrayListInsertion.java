package Collections.foodordermanagementsystem;

import java.lang.reflect.AnnotatedArrayType;
import java.sql.Array;
import java.util.*;
public class TypesOfArrayListInsertion
{
 public static void main(String[] args)
 {
//     //Arrays.asList();   // List Interface. //Backed by fixed array size.

//     List<Integer> l = Arrays.asList(10,20,30);  //List Interface
//     l.set(0,100);  //valid , so does not leads to exception.
//     //l.remove(),l.add();  //unsupportedOperationException , becoz, asList() provides fixed size backed array, we do not add
//     System.out.println(l);

     //Arrays.asList() with ArrayList constructor provides dynamic efficient array, fully mutable/resizable

//     List<Integer> list = new ArrayList<>(Arrays.asList(70,80,90)); //the Object[] stores the asList() length as default size instead of taking 10 as default array length.
//     //all valid
//     list.add(100);
//     list.remove(0);
//     list.set(2,900);
//     System.out.println(list);

     //List.of()  comes under immutable collections, completely unmodifiable.
//     List<Integer> x = List.of(50,null,150);  //null pointer exception
//     System.out.println(x);

     //**
//     Integer[] arr = {200,300,400};
//     List<Integer> l = Arrays.asList(arr);
//
//     l.set(1,500);
//     System.out.println(l);
//
//     System.out.println(arr[1]);

     //**
     ArrayList<int[]> l = new ArrayList<>();
     l.add(new int[]{10,20,30});

     l.get(0)[0] = 99;

     Iterator<int[]> it = l.iterator();

     while(it.hasNext())
     {
         System.out.println(Arrays.toString(it.next()));  //because next() returns int[] , so arrays does not override toString() , so Arrays class contains toString() , so Arrays.toString(it.next()) is valid.
     }




 }
}
