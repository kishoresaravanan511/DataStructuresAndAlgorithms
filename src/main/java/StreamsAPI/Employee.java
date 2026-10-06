package StreamsAPI;

import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
    String name;
    Integer id;
    String dept;

    public Employee(String name,Integer id,String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    @Override
    public int compareTo(Employee that)
    {
        return Integer.compare(this.id%10 , that.id%10);
    }

    @Override
    public String toString()
    {
        return name+" "+id+" "+dept;
    }
}
