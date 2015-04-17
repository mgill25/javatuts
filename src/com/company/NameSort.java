package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

import java.util.*;

class Name implements Comparable<Name> {
    private final String firstName, lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new NullPointerException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // "All things being equal, immutable types are the way to go."
    public String firstName() { return firstName; }
    public String lastName() { return lastName; }

    /**
     * @param o Object. Return false if any other type is provided.
     * @return true/false based on objects are equal or not.
     */
    public boolean equals(Object o) {
        if (!(o instanceof Name)) {
            return false;
        }
        Name n = (Name) o;
        return n.firstName.equals(firstName);
    }

    /**
     * Necessary for any class that redefines equals(), as two
     * equal objects have equal hashCodes.
     * @return Integer: The hashCode of the object.
     */
    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }

    /**
     * Redefine to print the name in a human readable format.
     * @return String: "firstName lastName" format.
     */
    public String toString() {
        return firstName + " " + lastName;
    }

    /**
     * Last names take precedence over first names. Natural ordering.
     * @param n The other Name object to compare to
     * @return -1 if this object is smaller, 0 if equal, 1 if greater.
     */
    public int compareTo(Name n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}

public class NameSort {
    public static void main(String[] args) {
        Name nameArray[] = {
                new Name("John", "Smith"),
                new Name("Karl", "Ng"),
                new Name("Jeff", "Smith"),
                new Name("Tom", "Rich")
        };

        List<Name> names = java.util.Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}
