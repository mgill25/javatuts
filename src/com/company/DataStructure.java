package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class DataStructure {
    private final static int SIZE = 15;

    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // Print out the values of the even indices
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Innerclass implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator {
        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {
            // check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            // record the value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }

        /**
         * Need to implement it in order to implement the Iterator interface.
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        // Fill the array with integer values and print out only values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
