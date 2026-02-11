package com.w3schools.javafullcourseforbeginners.lesson;
import java.util.Scanner;

/**
 In today's lesson, we cover:
 Java Real World Coding Example
 */

public class Lesson17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = in.nextInt();

        System.out.println("Number is : "+ num);

        for (int i=1; i<= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
