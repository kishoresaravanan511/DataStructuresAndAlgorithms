package Collections.foodordermanagementsystem.comparatoriinterfaces;

import java.util.*;
public class StringLengthSort
{
    public static void main(String[] args)
    {
//        Comparator<String> com = new Comparator<>() {
//            public int compare(String s,String s1)
//            {
//                if(s.length() > s1.length())
//                {
//                    return 1;
//                }
//                else if(s.length() == (s1.length()))
//                {
//                    return 0;
//                }
//                else {
//                    return -1;
//                }
//            }
//        }; //anonymous class
        List<String> l = new ArrayList<>(Arrays.asList("alice","bob","wilson","john","doe","vijayaraj"));
        l.sort((a,b) -> Integer.compare(a.length(),b.length()));  //lambda expression
        //Collections.sort(l,com);

        System.out.println(l);
    }
}
