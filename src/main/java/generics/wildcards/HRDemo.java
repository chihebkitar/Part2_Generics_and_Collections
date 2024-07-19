package generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class HRDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bart"),
                new Employee("Homer"),
                new Employee("Lisa"),
                new Employee("Maggie")
                );

        List<Salaried> salaried = Arrays.asList(
                new Salaried("Kyle"),
                new Salaried("Stan"),
                new Salaried("Kenny"),
                new Salaried("Cartman")
        );
        System.out.println(employees);
        System.out.println(salaried);
        HR.printEmpNames(employees);
        //HR.printEmpNames(salaried); doesnt compile

        //List<Employee> emps = salaried; not legal
       // emps.add(new Employee("afs")) added employee to list of salaried
        // we can do it with arrays but not with array lists
        HR.printAndSubclassNames(salaried);
        HR.printAllFiltered(employees,
                e ->e.toString().length()%2 == 0);
    }
}
