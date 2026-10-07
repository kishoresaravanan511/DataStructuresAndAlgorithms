package StreamsAPI;

import java.awt.event.ComponentAdapter;
import java.util.*;
import java.util.stream.*;

class giveNonEmptyListException
{
    String s;
    giveNonEmptyListException(String s)
    {
        super();
    }
}
public class MinAndMaxNumbers{
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                {
                    return 1;
                }
                else if(o1 < o2)
                {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
        List<Integer> l = Arrays.asList(64,16,73,28,49,16,64,21,73,96,49);
       // List<Integer> l = Arrays.asList();  //empty list

        Optional<Integer> max = l.stream()  //optional<> is container of object, it either holds non null value or it is empty, to prevent null pointer exceptions..
                .max(com);
        Optional<Integer> min = l.stream()
                .min(com);

        System.out.println("Minimum value : " + min.get());  //no argument is accepted for get() of optional<>.
        System.out.println("Maximum value : " + max.get());
    }
}
