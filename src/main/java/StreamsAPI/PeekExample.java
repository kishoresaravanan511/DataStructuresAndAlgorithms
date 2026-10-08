package StreamsAPI;

import java.util.stream.*;
import java.util.*;
public class PeekExample {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4);

        List<Integer> ans = l.stream()
                .map(n -> n*2)
                .peek(System.out::println)  //also intermediate operation, used to print/inspect the elements as they pass through stream pipeline
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
