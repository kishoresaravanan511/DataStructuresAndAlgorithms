package Collections.foodordermanagementsystem;

import java.util.*;
public class ArrayListCopying
{
    public static void main(String[] args) {

         List<Students> original = new ArrayList<>();
         original.add(new Students("alice",3876));
         original.add(new Students("Bob",4524));

         List<Students> copy = new ArrayList<>(original); //shallow copy ,creates the container, no more duplications of object references.

        //copy.remove(1);  //here , not gets reflected, because , both are separate containers.
        //System.out.println(original.get(0) == copy.get(0));

        copy.get(0).names = "David";  //reflected in both containers , because , both references were pointing to same object

        Iterator<Students> it = original.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().names);
        }

        System.out.println("\n");

        Iterator<Students> it1 = copy.iterator();
        while(it1.hasNext()) {
            System.out.println(it1.next().names);
        }
    }
}
class Students
{
    String names;
    Integer rollNo;

    public Students(String names,Integer rollNo)
    {
        this.names = names;
        this.rollNo = rollNo;
    }

//    @Override
//    public String toString()   //string representation purpose..
//    {
//        return names + rollNo;
//    }
}

