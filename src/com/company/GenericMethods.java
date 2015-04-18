package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

import java.util.*;

public class GenericMethods {
    /*
    static void fromArrayToCollection(Object[] arr, Collection<?> c) {
        for (Object o: arr) {
            c.add(o);           // Compile time error
        }
    }
    */

    static <T> void fromArrayToCollection(T[] arr, Collection<T> c) {
        for (T obj: arr) {
            c.add(obj);         // Correct
        }
    }

    public static void main(String[] args) {
        // We can call the above method with any type of collection
        // whose element type is a supertype of the element type of the array.

        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        fromArrayToCollection(oa, co);              // T inferred to be Object

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(sa, cs);              // T inferred to be String
        fromArrayToCollection(sa, co);              // T inferred to be Object
    }
}
