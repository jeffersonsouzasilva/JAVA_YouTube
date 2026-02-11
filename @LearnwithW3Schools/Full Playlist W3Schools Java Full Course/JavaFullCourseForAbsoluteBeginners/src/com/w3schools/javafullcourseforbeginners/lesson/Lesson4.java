package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Data Types
 */

public class Lesson4 {
    public static void main(String[] args) {

        int myNum = 5;                  // Integer (whole number)
        float myFloatNum = 5.99f;       // Floating point number
        char myLetter = 'D';            // Character
        boolean myBool = true;          // Boolean
        String myText = "Hello";        // String

        System.out.println(" ");
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}
