package Collections.foodordermanagementsystem.comparableinterfaces;

import java.text.CollationElementIterator;
import java.util.*;
public class EmployeeIdSorting
{
    public static void main(String[] args)
    {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("harish",19));
        l.add(new Employee("aman",24));
        l.add(new Employee("rahil",18));
        l.add(new Employee("jack",21));
        l.add(new Employee("jason",26));

        Collections.sort(l);

        Iterator<Employee> it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().id);
        }
    }
}
class Employee implements Comparable<Employee>
{
    String name;
    Integer id;

    Employee(String name,Integer id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee that)
    {
        return Integer.compare(that.id,this.id);
    }

    @Override
    public String toString()
    {
        return name + " " + id;
    }
}
