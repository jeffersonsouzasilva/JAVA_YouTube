package com.w3schools.javafullcourseforbeginners.lesson;

public class Lesson11 {
    public static void main(String[] args) {
        int time = 22;

        if (time < 10){
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening.");
        }

        System.out.println(" ");
        int marks = 45;
        /*
        marks 0-39. Grade FAIL
        marks 40-49. Grade D
        marks 50-59. Grade C
        marks 60-75. Grade B
        marks 76-89. Grade A
        Marks 90-100 Grade A+
         */

        if (marks < 39){
            System.out.println("Your Marks are: "+ marks + " and Grade is : FAIL");
        }
        else if (marks >40 & marks < 49) {
            System.out.println("Your Marks are: " + marks + " and Grade is : D");
            }
            else if (marks >= 50 & marks <= 59)
                System.out.println("Your Marks are: " + marks + " and Grade is : C");
                else if (marks >= 60 & marks <= 75)
                    System.out.println("Your Marks are: " + marks + " and Grade is : B");
                    else if(marks >= 75 & marks <= 89)
                        System.out.println("Your Marks are: " + marks + " and Grade is : A");
                        else if(marks >= 90 & marks <= 100)
                            System.out.println("Your Marks are: " + marks + " and Grade is : A+");
                            else
                                System.out.println("Please enter Marks between 0-100");
    }
}
