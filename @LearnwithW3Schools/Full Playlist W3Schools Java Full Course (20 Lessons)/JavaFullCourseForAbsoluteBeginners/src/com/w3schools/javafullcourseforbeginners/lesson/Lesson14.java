package com.w3schools.javafullcourseforbeginners.lesson;

public class Lesson14 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 15) {
            System.out.println(i);
            i++;
        }


        System.out.println(" ");
        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);


        System.out.println(" ");
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");


        System.out.println(" ");
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;    //dice++
        }//end of while
    }//end of main
}//end of cass
