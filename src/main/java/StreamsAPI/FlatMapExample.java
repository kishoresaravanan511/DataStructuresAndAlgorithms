package StreamsAPI;

import java.util.*;
import java.util.stream.*;
public class FlatMapExample
{
    public static void main(String[] args)
    {
        //method reference
        // className :: methodname for only static methods
        List<List<Integer>> l = new ArrayList<>();
        l.add(Arrays.asList(1,2));
        l.add(Arrays.asList(3,4));

        l.stream()
                //.flatMap(n -> n.stream())
                //.flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
