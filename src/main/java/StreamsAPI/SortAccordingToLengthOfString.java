package StreamsAPI;

import java.util.*;
import java.util.stream.*;
public class SortAccordingToLengthOfString {
    public static void main(String[] args) {
        //custom logic
        Comparator<String> com = new Comparator<>() {
            @Override
            public int compare(String a , String b) {
                if(a.length() > b.length())
                    return 1;
                else if(a.length() < b.length())
                    return -1;
                else
                    return 0;
            }
        };

        List<String> animals = new ArrayList<>(Arrays.asList("goat","dog","giraffe","tiger","hippo","elephant","lion","monkey"));

        List<String> ans = animals.stream()
                .sorted(com) //manual comparator
                .toList();   //collect(Collectors.toList());

        System.out.println("Sorted words = " + ans);
    }
}
