package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class Arrays {
    public static void main(String[] args) {
        // Length of arrays is established on creation. After that, length is fixed.

        // declare an array of integers
        int[] myArray;

        // allocate memory for 10 integers
        myArray = new int[10];

        // Hence, creating an array is basically:
        // type[] arrayName = new type[allocatedLength];

        // initialize the first element
        // initialize the rest
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        // Notice length is a property, not a method call! Pleasantly surprised! :)
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // Shortcut to create and initialize
        int[] secondArray = {
            100, 200, 300, 400,
            500, 600, 700, 800
        };

        // Multi-dimensional arrays
        String[][] names = {
            { "Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);

        // Copying arrays.
        // System class has a copyarray method that you can use to efficiently copy data from one array to another
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char [] copyTo = new char[7];

        // arrayCopy(src, srcPos, dst, dstPos, length)
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println("Copied!");
        System.out.println(new String(copyTo));

        // Lots of other convenience methods on Arrays in the java.util.Arrays class.
        // such as copying, sorting, searching etc.
        // E.g.Previous example can be modified to use copyOfRange method, which doesn't require
        // us to create a destination array beforehand!
        char[] secondCopyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println("Second copyTo: " + new String(secondCopyTo));
        /*
            Some other useful methods inside java.util.Arrays :-
                - binarySearch
                - equals (determine whether two arrays are equal or not)
                - fill (filling an array to place a specific value at each index)
                - sort (sorting into ascending order)
                - parallelSort (introduced in Java SE8, does the sort concurrently, sorting on multiprocessing systems)
         */

        /* **************************************************************** */
        // Switch fall through demo
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
        // ArrayList is the resizable array implementation of the List interface.
        int month = 8;

        switch(month) {
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName: futureMonths) {
                System.out.println(monthName);
            }
        }

        /* **************************************************************** */

    }
}
