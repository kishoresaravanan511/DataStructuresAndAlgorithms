package StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacters {
    public static void main(String[] args)
    {
        String s = "madam";
        Map<Character,Long> result = s.chars()  //provides ascii value of all charaters in s
                .mapToObj(n -> (char)n) //converting to ascii to character
                .collect((Collectors.groupingBy(c -> c,Collectors.counting())));

        System.out.println(result);

    }
}
