package com.company;

/**
 * HelloIdea
 * Created by manish on 18/04/15.
 */

import java.lang.*;

public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread.");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}
