package com.w3schools.javafullcourseforbeginners.lesson;
import java.util.Scanner;

/**
 In today's lesson, we cover:
 Java Method Class and Objects
 */


public class Lesson20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Input the 2st number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3st number: ");
        int num3 = in.nextInt();


        if (num1 > num2 & num1 > num3)
            System.out.println("The greatest: " + num1);

        if (num2 > num1 & num2 > num3)
            System.out.println("The greatest: " + num2);

        if (num3 >num1 & num3 > num2)
            System.out.println("The greatest: " + num3);
    }
}

class Student {

    //default Constructor
    Student(){
        System.out.println("Constructor Called");
    }

    //class variable declaration
    String stdName = null;

    public static void main(String[] args) {
        int y; //local variable declartion
        y=10; // local variable initliztion
        int x = 10;

        // object of class Student
        Student std1 = new Student();

        //std1.getName(); // call to method
        std1.setName("Dr. Zeeshan");
        String n = std1.getName();
        System.out.println("The New Name is : " + n);


        Student std2 = new Student();
        std2.setName("John Paul");
        System.out.println("Hello New Guy : " + std2.getName() );
    }

    //declaring method
    String getName(){
//        System.out.println("The Name os Student" + stdName);

        return stdName;
    } // end of getName Method

    //method declaration with argument
    void setName(String name){
        stdName = name;
//        System.out.println("The Student new Name is " + name);
    } // end of setName method
}