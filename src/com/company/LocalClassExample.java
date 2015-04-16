package com.company;

/**
 * HelloIdea
 * Created by manish on 14/04/15.
 */
public class LocalClassExample {
    static String regex = "[^0-9]";
    public static void validatePhoneNumber(String phNum1, String phNum2) {
        final int numLen = 10; // PhoneNumber local class can only access final variables.
        // Or, from java 8, effectively final variables (whose value never changes after it is initialized)

        // Now we create a local class
        class PhoneNumber {
            String formatted = null;
            PhoneNumber(String number) {
                String currNum = number.replaceAll(regex, ""); // has access to regex, defined in outer class.
                if (currNum.length() == numLen) {
                    formatted = currNum;
                } else {
                    formatted = null;
                }
            }

            public String getNumber() {
                return formatted;
            }
        }

        PhoneNumber myNum1 = new PhoneNumber(phNum1);
        PhoneNumber myNum2 = new PhoneNumber(phNum2);

        if (myNum1.getNumber() == null) {
            System.out.println("First number is invalid!");
        } else {
            System.out.println("First number is " + myNum1.getNumber());
        }

        if (myNum2.getNumber() == null) {
            System.out.println("Second number is invalid!");
        } else {
            System.out.println("Second number is " + myNum2.getNumber());
        }
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
