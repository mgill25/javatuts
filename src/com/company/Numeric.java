package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */

// We get cool imports!

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        // Remember, statically typed! types aren't optional in Java. :)
        Double fahr;
        Double cel;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + cel);
        System.exit(0);
    }
}
