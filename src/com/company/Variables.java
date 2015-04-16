package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class Variables {
    public static void main(String[] args) {
        /* What other types of variables does java offer?
        Divided into 4 categories:
            1. Instance variables (non-static fields)
                Technically speaking, objects store their individual states in "non-static" fields.
                They are called instance variables because they are unique to each instance of a class.
            2. Class variables (static fields)
                Exactly one copy of the variable in existance, regardless of how many instances are created.
            3. Local variables
                Method stores its temporary states in local variables. No special keyword.
            4. Parameters
                function parameters, available in the body of the functions just like the local variables.
         */

        // Primitive data types
        byte b = 1; // 8-bit signed 2's complement integer, ranging from -128 to 127 (inclusive).
        // can be useful for saving memory in large arrays, where the memory saving actually matters.
        // can also be used in place of ints where their limits help you to clarify the code - the fact that
        // the range of the variable is limited can serve as a form of documentation!

        short c = 1; // 16-bit signed 2's complement integer, ranging from -32,768 to 32,767 (inclusive).
        // same guidelines as byte.

        int i = 10; // 32-bit signed 2's complement integer, ranging from -2^31 to 2^31 - 1.
        // In Java SE 8 and later, you can use int to represent unsigned 32-bit integer from 0 to 2^32 - 1.
        // for arithmetic operations on unsigned numbers, static methods like divideUnsigned and compareUnsigned
        // have been added to the Integer class.

        long l = 22; // 64-bit 2's complement. -2^63 to 2^63 - 1. Guidelines same as int.

        float f = 3.14f; // single-precision 32-bit IEEE 754 floating point.
        // Range of floating point values: https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3
        // Should never be used for precise values, such as currency. For that, use java.math.BigDecimal class.

        double d = 32.3; // double-precision 64-bit IEEE 754 floating point. Same guidelines as float.

        boolean boo = true; // only 2 possible values, true and false. use for simple flags. Represents
        // 1 bit of information, but the size is not something that is precisely defined.

        char ch = 'c'; // single 16-bit Unicode(UTF-16) character. Ranges from '\u0000' to '\uffff' (or, 65,535 inclusive)


        // String support is defined in java.lang.String class. Enclosing your character string within double-quotes
        // will automatically create a new String object.
        String s = "this is a string"; // Immutable. Not technically a primitive data type, but used so frequently
        // that it might as well be called that.

        // Integer literals
        int decVal = 26;
        int hexVal = 0x1a;
        // int binVal = 0b110110; // not available in jdk 6?

        // floating points
        double d1 = 123.4;
        double d2 = 1.234e2; // scientific notation
        float f1 = 123.4f;

        // String literals
        // Single quotes for characters and double quotes for strings.

        // null literal
        String n = null;  // can be used as a value for any reference type. May be assigned to any variable, except
        // variables of primitive type. Little to do about null, except testing for its presense.

        // Can use underscore character in numeric literal to improve readability!
        // this is kinda fantastic.
        //long creditCardNumber = 1234_5678_9982_1231L; // Woah. Not available in jdk 6
        //System.out.println("Credit card number is: " + creditCardNumber);
    }
}
