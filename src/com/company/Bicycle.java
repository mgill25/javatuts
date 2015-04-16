package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    // Constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // Methods
    public void setCadence(int newCadence) {
        cadence = newCadence;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // Getters
    public int getCadence() { return cadence; }
    public int getGear() { return gear; }
    public int getSpeed() { return speed; }
}

