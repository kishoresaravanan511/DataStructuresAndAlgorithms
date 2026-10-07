package StreamsAPI;

import java.util.*;
public class EvenNumbersFromRange {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(9,1,3,2,6,0,10,48,30,92));

        l.stream()
                .filter(n -> n%2 == 0)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
