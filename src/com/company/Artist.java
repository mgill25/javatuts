package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
// method overloading demko
public class Artist {
    public void draw(String s) {
        System.out.println("Drawn string " + s);
    }

    public void draw(int i) {
        System.out.println("Drawn integer: " + i);
    }

    public void draw(String i, int j) {
        System.out.println("Drawn both string " + i + " and integer " + i);
    }
}
