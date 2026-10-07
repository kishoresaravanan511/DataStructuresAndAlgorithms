package StreamsAPI;

import java.util.*;
public class ConvertStringsToUppercase
{
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("race","car","anagram","peacock","Bison"));

        l.stream()
                .filter(n -> n.length() >= 3)
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));
    }
}
