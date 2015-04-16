package com.company;

/**
 * HelloIdea
 * Created by manish on 16/04/15.
 */

// Interface tutorial!
// If not specified to be public, only classes in the same package can use it
interface myBicycle {
    /*
    Interface body can contain
        - abstract methods  (does not contain implementation)
        - default methods   (defined with the "default" modifier)
        - static methods    (defined with the "static" modifier)
        All methods inside the interface are implicitly public, so can omit the public modifier.
        - Constant declarations
        All constant values defined in the interface are implicitly public static final.
     */
    // An interface is a group of related methods with empty bodies
    // here is a bicycle's behavior specified as an interface.

    // wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBreaks(int decrement);
}


// Now our class will implement this interface

public class ACMEBicycle implements myBicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods defined
    // in the interface all be implemented. Compilation will *fail*
    // if those methods are missing from this class.
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println(
            "cadence: " + cadence + " " +
            "speed: " + speed + " " +
            "gear: " +  gear
        );
    }
}
