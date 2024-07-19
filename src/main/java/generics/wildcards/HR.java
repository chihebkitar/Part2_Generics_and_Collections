package generics.wildcards;

import java.util.List;
import java.util.function.Predicate;

public class HR {
    public static void printEmpNames(List<Employee> employees){
        // only employee type
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }
    public static void printAndSubclassNames(List<? extends Employee> employees){
        // works also for any type of subclass of employee
        // ? is wildcard anything type of emp
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
        //employees.add(new Employee("Fred")); // does not compile
        //employees.add(new Salaried("Barney")); // does not compile
        // we cannot modify tha arraylist because we dont know the type

    }
    public static void printAllFiltered(
            List<? extends Employee> employees,
            Predicate<? super Employee> predicate
    ){
        // Predicate: This is a functional interface in Java that
        // represents a single argument function that returns a boolean value. It is typically
        // used for filtering or matching operations.
        //Predicate<? super Employee> predicate: This parameter is a predicate that can test objects of
        // type Employee or any of its superclasses. The predicate is used to filter the list of employees based on some condition.
        for (Employee e : employees){
            if(predicate.test(e)){
                System.out.println(e.getName());

                // pecs produces uses extends
                // consumers uses super
            }
        }

    }
}
