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

    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    public String getName()
    {
        return name;
    }
    public Integer getId()
    {
        return id;
    }
    public String getDept()
    {
        return dept;
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
