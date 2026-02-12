package com.w3schools.javacourse;

public class StudentTeacher {
    public static void main(String[] args) {
        //Data Types in Java
        int var = 10; // number , 4 byte
        byte bt = 2;    // number , 1 Byte
        short st = 34; // number , 2 byte
        long lg = 3333333333l; // number, 8 bytes

        char ch = 'a';
        boolean bool = true; // true=1 or false=0

        float ft = 34.45f; // decimal , 4 bytes
        double db = 34.34; // decimal , 8 bytes

        String name = "Zeeshan";

        //multiple variables
        int x=5 , y=6, z=9;
        int xx; // variable declaration
        int yy, z_3;
        xx=98;  // Variable Initilazation
        y = z =76;

        System.out.println("Hello World");
        System.out.println(xx);
        System.out.println("The Value of y is " + y);

        //Operator
        System.out.println("Adding number " + y + x);

        //Math Class
        int max = Math.max(5, 10);
        System.out.println( Math.random() );
        System.out.println("Max value is " + max);

        //Java Booleans , 1 bit (0 or 1)
        boolean bool1 = true; // 1
        boolean bool2 = false; // 0
    }

    // Java Execution Flow
    /*
        1. Write Code
        2. Compile Code (JdK Compiler reads codes, Checks Error. )
        3. Compiler Generates a Byte Code file same name as class name
        4. Byte Code file is thean executed by JVM (Java Virtual Machine)

     */

    // Minuto 28:03 do video
}