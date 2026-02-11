package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java For Loop
 */


public class Lesson15 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        System.out.println(" ");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (false);


        System.out.println(" ");
        i = 0;
        while (i < 0){
            System.out.println(i);
            i++;
        }


        System.out.println(" ");
        for (i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }
    }
}
