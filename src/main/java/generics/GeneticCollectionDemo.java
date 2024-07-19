package generics;

import java.util.ArrayList;
import java.util.List;

public class GeneticCollectionDemo {
    public void noGenetics(){
        // old style for using generics in collection before
        // no idea of the list elements
        // we use generics to avoid improper types
        // and castings
        // u dont put parameters list could be of any type
        List nums = new ArrayList();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add("oops");
        System.out.println(nums);
        for (Object n : nums){
           // Integer val = (Integer) n;
            // class cast exception for the string value
            System.out.println(n);
        }

    }
    // motivation of generics is to never put wrong type
    // and u dont have to cast
    public void genericList(){
        // list of Integers
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        // nums.add("oops"); wont compile
        // bcz generic type will wont allow it
        System.out.println(nums);
        nums.forEach(System.out::println);
        // replace the loop with foreach
        // transform the collection to a new one;;java 8
    }
    public static void main(String[] args){
        GeneticCollectionDemo demo = new GeneticCollectionDemo();
        demo.noGenetics();
        demo.genericList();
    }
}
