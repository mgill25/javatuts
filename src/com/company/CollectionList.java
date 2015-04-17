package com.company;

/**
 * HelloIdea
 * Created by manish on 17/04/15.
 */

import java.util.*;

public class CollectionList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (String a: args) {
            list.add(a);
        }
        // Can also use List<String> list = Arrays.asList(args);
        // which can be directly shuffled.
        Collections.shuffle(list, new Random());
        System.out.println(list);
    }
}
