package com.company;

import java.awt.*; // for the Point class.

/**
 * HelloIdea
 * Created by manish on 16/04/15.
 */

interface Relatable {
    /*
        this and other must be instances of the same class.
     */
    public int isLargerThan(Relatable other);
}

/*
If you want to compare the size of similar objects, no matter what they are,
the class that instantiates them should implement Relatable.

Any class can implement Relatable if there is some way to compare the relative "size" of
objects instantiated from the class. For strings, it could be the number of characters (or usually,
alphabetical order in which they appear), for books, it could be number of pages, for students,
it could be weight; so forth.

For planar geometric objects, area would be a good choice, while volume would work for 3-D objects.
All such classes implement the isLargerThan() method.
 */

public class RectanglePlus implements Relatable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // move the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // compute area
    public int getArea() {
        return width * height;
    }

    // methods required to implement the Relatable interface
    /*
    The method will still take an object of type Relatable,
    but we then *cast* that object into the type we require (RectanglePlus)
     */
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus) other;

        if (this.getArea() < otherRect.getArea()) {
            return -1;
        } else if (this.getArea() > otherRect.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }


}
