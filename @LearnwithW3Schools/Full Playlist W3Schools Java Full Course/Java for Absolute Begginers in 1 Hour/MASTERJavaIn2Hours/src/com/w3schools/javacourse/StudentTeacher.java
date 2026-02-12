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

        //Arthmetic Operator
        //+, -, *, / %
        //Operator Precedenace ,  ==> * , / , + , -
        System.out.println("The multiplication is " + 5 * 10); //50
        System.out.println("The adding is " + 5 + 5 * 10); //550
        System.out.println("The adding again is " + 5 + 5 + 10); //5510
        System.out.println(5 + 5 + 5 + " the anser is ");
        System.out.println("The anser is " + (5 + 5 * 10));

        // Relational Operator
        /* Logical operators that return Boolean Value (true or false)
         * > greater than
         * < less than
         * >= greatear than equal to
         * <= less than equal to
         * == Equal to
         *
         */
        System.out.println(5 > 10);
        System.out.println(5 >= 5);

        // Logical Operator
        /*
         * & AND
         * | OR
         *
         */
        System.out.println("Logical Operator++++");
        System.out.println(5 >= 5 & 15 <= 5 & 10 == 10);
        System.out.println(5 >= 5 | 15 <= 5 | 100 == 10);

        //Conditional statement if-else
        int time = 20;
        if (time < 18){
            System.out.println("Good Time ");
        }
        else {
            System.out.println("Not a Good Time");
        }

        //nested if else statements
        //task. write a program to detrimne discont on ticket based on age
        //age =< 12 = 75%
        //age 13-18 = 50%
        //age above 18 = 10%
        int age = 21;
        if (age <= 12){
            System.out.println("You Get 75% Discount");
        } else if (age >= 13 & age <= 18) {
            System.out.println("You Get 50% Discount");
        } else if (age > 18) {
            System.out.println("You Get 10% Discount ");
        }else {
            System.out.println("Enter Number between 1 and 100");
        }

        //Switch Statements
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println(" 1 - 7");
                break;
        }

        //Loop Statement
        //While Loop
        //for
        //do-while
        int i=0;
        while (i <= 10)
        {
            System.out.println("the value is " + i);
            i++; //increment operator i = i + 1
        }

        //do-while
        int i2 = 100;
        do {
            System.out.println("The value od do-while is " + i2);
            i2++; //increment operator i = i + 1
        }
        while (i <= 10);

        //for loop
        /*
        for(statement 1; statement 2; statement 3){

        }
         */
        for (int i3 = 0; i3 <= 10; i3++){
            System.out.println("The Value of is " + i3);
        }

        // task create a program to print table of any number
        int table = 5;
        for (int num = 1; num <=20 ; num ++){
            System.out.println(table + " x " + num + " = " + (table * num) );
        }


    }

    // Java Execution Flow
    /*
        1. Write Code
        2. Compile Code (JdK Compiler reads codes, Checks Error. )
        3. Compiler Generates a Byte Code file same name as class name
        4. Byte Code file is thean executed by JVM (Java Virtual Machine)

     */

}