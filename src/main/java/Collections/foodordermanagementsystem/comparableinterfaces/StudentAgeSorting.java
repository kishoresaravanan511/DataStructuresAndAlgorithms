package Collections.foodordermanagementsystem.comparableinterfaces;

import java.util.*;
public class StudentAgeSorting{
    public static void main(String[] args)
    {
        List<StudentData> l = new ArrayList<>();
        l.add(new StudentData(19));
        l.add(new StudentData(26));
        l.add(new StudentData(21));
        l.add(new StudentData(20));

        Collections.sort(l);

        System.out.println(l);
    }
}
class StudentData implements Comparable<StudentData>
{
    Integer age;

    StudentData(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return Integer.toString(age);
    }

    @Override
    public int compareTo(StudentData that)
    {
        if(this.age > that.age)
        {
            return 1;
        }
        else if(this.age < that.age)
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}
