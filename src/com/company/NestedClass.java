package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class NestedClass {
   class InnerClass {
      // A non-static nested class
   }

   static class StaticInner {
      // a static nested class
   }
   /**
    * Why use Nested classes?
    *    1. Logically group classes that are only used in one place.
    *    2. Increases incapsulation.
    *    3. Leads to more readable and maintainable code.
    *
    *    Static nested class: Interacts with the instance members of its outer class, just like
    *    any other top-level class. In effect, it is just like any top-level class which has
    *    been nested in another top-level class for packaging convenience.
    *
    *    usage: Outerclass.StaticNestedClass
    *       e.g. Outerclass.StaticNestedClass nestedObject = new Outerclass.StaticNestedClass();
    *
    *    An "Inner class" (non-static) cannot define any static members itself, because it is associated
    *    with an instance. An instance of InnerClass can only exist within an instance of OuterClass
    *    and has direct access to methods and fields of the Outer class with this syntax:
    *       Outerclass.InnerClass innerObject = outerObject.new InnerClass();
    *
    *    There are 2 special kinds of Inner classes:
    *       1. Local classes
    *       2. Anonymous classes
    */
}
