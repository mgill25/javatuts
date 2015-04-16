package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class MountainBike extends Bicycle {
    public int seatHeight;

    // Constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // Method
    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    // Arbitrary number of arguments
    public void MountainBikeFrom(int... args) {
        // args is an array.
        int numberOfSides = args.length;
    }
}
