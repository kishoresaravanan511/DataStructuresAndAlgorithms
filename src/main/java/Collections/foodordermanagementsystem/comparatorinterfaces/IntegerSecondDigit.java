package Collections.foodordermanagementsystem.comparatorinterfaces;

import java.util.*;
public class IntegerSecondDigit
{
    public static void main(String[] args)
    {
////        Comparator<Integer> com = new Comparator<Integer>() {
////            public int compare(Integer a,Integer b)
////            {
////                if(a%10 > b%10)
////                {
////                    return 1;
////                }
////                else
////                {
////                    return -1;
////                }
////            }
////
////        };
//        List<Integer> l = new ArrayList<>(Arrays.asList(18,21,97,63,86));
//        //lambda Expression
//        l.sort((a,b) -> Integer.compare(a%10,b%10));
//
//       // Collections.sort(l,com);
//
//        System.out.println(l);

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.name.charAt(1) > o2.name.charAt(1))
                {
                    return 1;
                }
                else if(o1.name.charAt(1) < o2.name.charAt(1)){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        };
        List<Student> l = new ArrayList<>();
        l.add(new Student("amar",17,"CSE"));
        l.add(new Student("shandy",49,"MECH"));
        l.add(new Student("agarwal",11,"IT"));
        l.add(new Student("satvik",56,"ECE"));

        //l.sort((a,b) -> Integer.compare(a.rollNo%10,b.rollNo%10));

        Collections.sort(l,com);
        Iterator<Student> it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().name);
        }
    }
}
class Student
{
    String name;
    Integer rollNo;
    String dept;

    public Student(String name,Integer rollNo,String dept)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return name +" "+ rollNo +" "+ dept;
    }
}
