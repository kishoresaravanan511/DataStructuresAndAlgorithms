package StreamsAPI;

import java.util.*;
public class MappingAdigit
{
    public static void main(String[] args)
    {
        //Integer list
//        List<Integer> l = List.of(10,20,30,40,50);
//
//        l.stream()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));

        //Character List
         List<Character> l = new ArrayList<>(Arrays.asList('n','w','a','c','f','y'));
        l.stream()
                .filter(n -> n > 'i')
                .map(n -> Character.toUpperCase(n))
                .forEach(n ->System.out.println(n));

        //arrays
//        int[] arr = {2,4,6,8,10,12};
//
//        Arrays.stream(arr).map(n -> n/2).sorted().forEach(System.out::println);
    }
}
