package com.w3schools.javafullcourseforbeginners.lesson;

/**
 In today's lesson, we cover:
 Java Operators

 */


public class Lesson6 {
    public static void main(String[] args) {
        int x = 100 * 50;

        // System.out.println(" ");
        int sum1 = 100 + 50;    //150 (100 + 50)
        int sum2 = sum1 + 250;  //400 (150 + 250)
        int sum3 = sum2 + sum2; //800 (400 + 400)

        // System.out.println(" ");
        ++x; // x = x + 1
        System.out.println(x);

        System.out.println(" ");
        x = 10;
        x += 2; // x = x + 5
        System.out.println(x);

        System.out.println(" ");
        x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3

        System.out.println(" ");
        x = 5;
        y = 3;
        System.out.println(x == y); // returns false because 5 is not equal to 3

        System.out.println(" ");
        x = 5;
        y = 5;
        System.out.println(x != y); // returns false because 5 is not equal to 3

        System.out.println(" ");
        x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

        /*
            Logical Operator &&
                Exp-1   Exp-2   && Result
                True    True    True
                True    False   False
                False   True    False
                False   False   False

            OR ||
                Exp-1   Exp-2   || Result
                True    True    True
                True    False   True
                False   True    True
                False   False   False

            Not !
                Exp-1   ! Result
                True    False
                False   True
        */

    }
}
