package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class ShadowTest {
    public int x = 0;

    class FirstLevel {
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x: " + x);  // as expected
            System.out.println("this.x: " + this.x); // as expected
            System.out.println("ShadowTest.this.x: " + ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest(); // create outer object
        ShadowTest.FirstLevel fl = st.new FirstLevel(); // create inner object from outer instance.
        fl.methodInFirstLevel(23);
    }
}
