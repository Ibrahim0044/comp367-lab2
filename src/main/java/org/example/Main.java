package org.example;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        String greeting;

        if (currentTime.getHour() < 12) {
            greeting = "Good morning, Ibrahim, Welcome to COMP367";
        } else {
            greeting = "Good afternoon, Ibrahim, Welcome to COMP367";
        }

        System.out.println(greeting);
    }
}