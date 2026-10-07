package StreamsAPI;

import java.util.*;
public class NumbersStartsWithPrefixOne
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(11,31,18,42,93,14,26,13));

        l.stream()
                .map(v -> v.toString())
                .filter(n -> n.startsWith("1"))
                //.map(n -> Integer.parseInt(n))    //optional
                .forEach(n -> System.out.println(n));
    }
}
