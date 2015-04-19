package com.company;

/**
 * HelloIdea
 * Created by manish on 19/04/15.
 */

/*
An enum type is a special data type that enables for a variable
to be a set of predefined constants. The variable must be equal
to one of the values that have been predefined for it. Common
examples include compass directions, days of the week etc.
 */

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

/*
Use enum any time you need to represent a fixed set of Constants.
That includes natural enum types such as the planets in our
Solar System and data sets where you know all possible values at
compile time - for example, the choices on a menu,
command line flags, and so on.
 */

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad. :(");
                break;
            case FRIDAY:
                System.out.println("Fridays are better!");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best!! ^_^");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
