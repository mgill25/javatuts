package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

import java.util.*;

public class SleepMessages {
    public static void main(String[] args)
        throws InterruptedException {

        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lamb eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            // pause for 2 seconds
            Thread.sleep(2000);
            // print a message
            System.out.println(importantInfo[i]);
        }
    }
}
