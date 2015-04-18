package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

import java.util.Scanner;

public class ReallySimpleThreads {
    private static class Fortune implements Runnable {
        public void run() {
            while (true) {
                System.out.println("Good things will come your way!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Thread myFortuneThread = new Thread(new Fortune());
        myFortuneThread.setDaemon(true);    // Daemon or User Thread. Daemon threads die when their parents die.
        myFortuneThread.start();            // Spawn the Fortune Thread.

        System.out.println("Enter anything:");
        input.next();
        System.out.println("Input request was satisfied in main.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("I was asleep for 2 seconds. I just woke up!");
    }
}
