package StreamsAPI;

import java.util.*;
public class SecondLargest
{
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>(Arrays.asList(89,91,90));

        int ans = l.stream()
                .distinct()  //unique elements
                .sorted(Comparator.reverseOrder())  //descending sort
                .skip(1)  //skip n numbers
                .findFirst() //finding first in a stream
                .orElse(-1);  //if only one element in a list or only two same elements are present , -1.

        System.out.println(ans);
    }

}
