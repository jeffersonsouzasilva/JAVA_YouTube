package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Break and Continue
 */

public class Lesson18 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }


        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);


        }
    }
}
