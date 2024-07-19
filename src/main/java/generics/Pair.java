package generics;

import java.lang.reflect.ParameterizedType;

public class Pair <T>{
    // one generic type
    // i use t for first and second parameters
    private T first;
    private T second;
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    // swap instanciate a new pair reversing first and second
    public Pair<T> swap(){
        return new Pair<T>(second,first);
    }
    // method uses generics both inside argument list
    // and symbol next to return type
    // when we use generics in method declaration
    // u specify the generic type after all tge modifiers
    // and before return type
    // indicate this is a genetic method
    // parameter is pari ot type t
    // in this method u gonna use t different from the first method
    // we modified the input argument
    // not recommended
    // functional prog we deal with immutable better
    // first method create new element
    public static <T> void swap(Pair<T> pair) {
        T temp = pair.first;
        // i cannot instanciate a t becz i dont have constructor
        pair.first = pair.second;
        pair.second = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
