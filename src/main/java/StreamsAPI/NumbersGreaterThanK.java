package StreamsAPI;

import java.lang.reflect.Array;
import java.util.*;
public class NumbersGreaterThanK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        //List<Integer> l = Arrays.asList(10,20,30,40,50,60);
        List<String> l = Arrays.asList("arish","rahul","ram","yash","lenin");

        l.stream()
                .filter(n -> n.length() > k)
                .forEach(System.out::println);
    }
}
