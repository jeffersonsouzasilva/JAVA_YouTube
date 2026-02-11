package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Strings
 */

public class Lesson7 {
    public static void main(String[] args) {
        String greeting = "Hello";

        //System.out.println(" ");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(" ");
        txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        System.out.println(" ");
        txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        System.out.println(" ");
        txt = "Hello";
        System.out.println(txt.charAt(0));  // H
        System.out.println(txt.charAt(4));  // o
    }
}
