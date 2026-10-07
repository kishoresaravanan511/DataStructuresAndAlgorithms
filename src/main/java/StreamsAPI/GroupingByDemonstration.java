package StreamsAPI;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.*;
public class GroupingByDemonstration {
    public static void main(String[] args)
    {
        List<Employee> l = Arrays.asList(
                new Employee("alice",101,"IT"),
                new Employee("bob",102,"HR"),
                new Employee("charlie",103,"ACCOUNTS"),
                new Employee("Doe",104,"IT"),
                new Employee("Eve",105,"ACCOUNTS")
        );
        Map<String,List<Employee>> res = l.stream()
                .collect(Collectors.groupingBy(e -> e.getDept()));  //grouping by return map

        System.out.println(res);

        //process the res map for understandable format
        res.forEach( (departmentAsKey,entireObjectAsValue) -> {  //key , value
            System.out.println("department: "+departmentAsKey);
            entireObjectAsValue.forEach(n -> System.out.println("   " + n));
        } );

    }
}
