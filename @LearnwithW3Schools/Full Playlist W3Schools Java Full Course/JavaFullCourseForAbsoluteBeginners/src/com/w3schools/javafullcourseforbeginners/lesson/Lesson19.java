package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Arrays
 */

public class Lesson19 {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //each array ELEMENT has a index number starting from 0
        System.out.println(cars[0]);

        System.out.println(" ");
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
