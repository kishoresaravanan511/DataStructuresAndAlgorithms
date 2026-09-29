package Iterators;
import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
        //List<String> l = new ArrayList<>();
//        Set<String> l = new HashSet<>();
//        Set<String> l1 = new HashSet<>();
//        l1.add("c++");
//        l.add("java");
////        l.add("kotlin");
////        l.add(1,"c++");
//        l.add("java");
//        l.add("java");
//        l.add("html");
//
//        l.retainAll(l1);  //common objects in both Sets.
//        System.out.println(l);

        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(null);
        

        System.out.println(l.size());


//        Iterator<String> it = l.iterator();
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        //Collections.sort(l);  //[c++, cobalt, html, java, pascal, python]
        //Collections.reverse(l);  //[pascal, java, html, cobalt, c++, python]
//        Collections.sort(l,Collections.reverseOrder());  //Z - A
//        l.clear();
//        l.remove("java");
//        System.out.println(l);
    }
}
