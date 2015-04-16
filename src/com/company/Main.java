package com.company;

/*
    So, we're gonna re-start our journey with Java, after such
    a long time! Can't say I missed you very much, java. Sorry. :(

    Anyway, lets go through the basics again. Java "platform" consists of 2 things:
        - The Java API (set of tools and libraries)
        - The JVM (bytecode compiler and interpreter)

    How stuff works!
        myprogram.java -> compiler (javac) -> myprogram.class
            - the .class file contains the bytecode. This bytecode is not native to the processor,
            but is the machine language of the Java virtual machine (JVM)
        java myprogram -> runs the program on an instance of the JVM.
        The same .class file can run on multiple platform.s
 */
public class Main {

    // can also be re-written as static public, but the convention is public static.
    // removing static will compile but result in runtime error - main method should be static.
    // removing public will compile but result in runtime error - NoSuchMethodException. This could possibly
    //  be because unless the method is public, it is not really "visible" to the Runtime.
    // removing void results in compilation error, as functions *must* have return types.
    // Can technically make it "int main" and return an integer as well. Void main just means the program exists
    // with no value.
    public static void main(String[] args) {
        // Use the System class from the core library (aka the API)
        // REMEMBER: Things have Types now! "var" or no type will result in failure!
        String firstName = "Manish";
        String lastName = "Gill";
        System.out.println("My name is " + firstName + " " + lastName);
        // Undefined variable error will be "cannot find symbol"
        int age = 24; // Why is int lowercase, but String and Double start capitalized? o_O
        // I think maybe it works both capitalized and uncapitalized for Double and String? But doesn't for int
        // for some reason. :/
        System.out.println("I am " + age + " years old!");
    }
}
