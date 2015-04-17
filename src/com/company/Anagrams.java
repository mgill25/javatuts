package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */
import java.util.*;
import java.io.*;

// Multimaps!
public class Anagrams {
    public static void main(String[] args) {
        int minGroupSize = Integer.parseInt(args[1]);
        // read words from file and put into a simulated multimap
        Map<String, List<String>> m = new HashMap<String, List<String>>();

        try {
            Scanner s = new Scanner(new File(args[0]));
            while (s.hasNext()) {
                String word = s.next();
                String alpha = alphabetize(word);
                List<String> lst = m.get(alpha); // .get
                if (lst == null) { // if not found
                    m.put(alpha, lst=new ArrayList<String>()); // add it, with a new array as value
                }
                lst.add(word); // append to list.
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
            System.exit(1);
        }

        // Print all permutation groups above size threshold
        for (List<String> lst: m.values()) {
            if (lst.size() >= minGroupSize) {
                System.out.println(lst.size() + ": " + lst);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr); // directly referring to it because I already had an Arrays in another file! Oops!
        return new String(arr);
    }
}
