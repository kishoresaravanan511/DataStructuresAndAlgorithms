package StreamsAPI;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args)
    {
        List<Integer> s = new ArrayList<>();
        Set<Integer> need = new HashSet<>();
        s.add(10);
        s.add(78);
        s.add(10);
        s.add(39);
        s.add(38);
        s.add(78);
        s.add(93);
        s.add(39);

        List<Integer> ans = s.stream()
                .filter(n -> !need.add(n))  //duplicates
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
