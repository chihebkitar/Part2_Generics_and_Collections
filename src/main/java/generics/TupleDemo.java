package generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TupleDemo {
    public static void main(String[] args){
        // when u declaire the tuple reference u specify the classes used
        // for t and u
        // tuple of integer and string
       Tuple<Integer,String> tuple = new Tuple<>(1,"hello");
       // <> specified in java 7 dop ,
        // no need to put types they are automatically referred

        System.out.println(tuple);
        // tuple of localdate and list of string
        // effective but ugly
        Tuple<LocalDate, List<String>> tuple1 =
                new Tuple<>(LocalDate.now(),
                        Arrays.asList("a","b","c","d"));
        System.out.println(tuple1);
    }
}
