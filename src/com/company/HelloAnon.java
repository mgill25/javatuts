package com.company;

/**
 * HelloIdea
 * Created by manish on 24/04/15.
 *
 * An anonymous class is an expression. Syntax is just like the invocation of a constructor,
 * except there is a class definition contained in the block of code.
 */

public class HelloAnon {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        // Name of interface to implement or class to extend along with the "new" keyword.
        // parents contain argument to constructor (none for an interface)
        // body which has the class implementation.
        HelloWorld frenchGreeting = new HelloWorld() {
            /**
             * Anonymous classes *cannot* have constructors!
             */
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloAnon myApp = new HelloAnon();
        myApp.sayHello();
    }
}
