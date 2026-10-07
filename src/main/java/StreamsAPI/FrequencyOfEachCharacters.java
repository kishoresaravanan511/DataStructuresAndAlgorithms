package StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacters {
    public static void main(String[] args)
    {
        String s = "leetcode";
        Map<Character,Long> result = s.chars()
                .mapToObj(n -> (char)n)
                .collect((Collectors.groupingBy(c -> c,Collectors.counting())));

        System.out.println(result);

    }
}
