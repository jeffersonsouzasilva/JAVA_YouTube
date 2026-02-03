package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Nested For Loop
 */

public class Lesson16 {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } //end of Outer For Loop


        System.out.println(" ");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }


    }
}
