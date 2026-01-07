package com.w3schools.javafullcourseforbeginners.lesson;

public class Lesson3 {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        System.out.println(" ");

        //int myNum = 15;
        //int myNum; //variable declaration
        //myNum = 15; //variable Initiliazation

        final int myNum = 15;
        //myNum = 20; // will generate an error
        System.out.println(myNum);

        System.out.println(" ");

        //String name = "John";
        System.out.println("Hello " + name);
        System.out.println(name + " is my name");

        System.out.println(" ");

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName + lastName);

        int x=5;
        int y=6;
        System.out.println(x+y+fullName);
        System.out.println(fullName + x + y);
        System.out.println(fullName + (x + y) );

        System.out.println(" ");

        //int x=5, y=6, z=50;
        int z = 50;
        System.out.println(x + y + z);

        System.out.println(" ");

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';
        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

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
