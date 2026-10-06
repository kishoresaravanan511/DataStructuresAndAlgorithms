package StreamsAPI;

import java.util.*;
public class SortEmployeeId
{
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("arun",101,"Dev"));
        l.add(new Employee("arul",209,"testing"));
        l.add(new Employee("varun",703,"devOps"));
        l.add(new Employee("gugan",406,"ui/ux"));

        l.stream()
                .filter(n -> n.id > 100)
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
