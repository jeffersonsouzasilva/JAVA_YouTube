package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Type Casting
 */


public class Lesson5 {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: to int

        System.out.println(myDouble);    // Outputs 9.78
        System.out.println(myInt);       // Outputs 9

        System.out.println(" ");
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);
    }
}
