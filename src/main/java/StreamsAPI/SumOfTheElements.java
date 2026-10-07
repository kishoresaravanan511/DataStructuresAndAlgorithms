package StreamsAPI;

import java.util.stream.*;
import java.util.*;
public class SumOfTheElements
{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4);

        final Integer sum = l.stream()
                .reduce(0,(a,b) -> a+b);

        System.out.println(sum);
    }

}
