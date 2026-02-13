import java.io.Console;

/*
 * Welcome to Java in 5 Minutes
 * I am Dr. Zeeshan
 * YT @ LearnWithW3schools
 */
public class Main {
    public static void main(String[] args) {
        //** PRINT OUTPUT */
        System.out.println("Hello World");
        System.out.println("I am Dr. Zeeshan");
        System.out.println("Subscribe @ LearnWithW3schools");

        System.out.println(3 + 3);

        // ** COMMENTS **
        // This is a comment

        /* The code below will print the
           words Hello World
           to the screen,
           and it is amazing
         */

        // ** DATA TYPES **
        String name = "Dr. Zeeshan";
        System.out.println("My name is " + name);

        int myNum = 5;              // Integer (whole number) 4 Bytes
        float myFloatNum = 5.99f;   // Floating point number  4 Bytes
        double d1 = 12E4d;          // Double (8bytes)        8 Bytes
        char myLetter = 'D';        // Character   ..2 Bytes
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String

        // ** CALCULATION **
        // Create integer variables
        byte length = 4;    //Byte (Whole Number) 1 byte
        short width = 6;    //Short (Whole Number) 2 byte
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print Area Value
        System.out.println("Area of the rectangle is: " + area);

        //** TYPE CASTING */
        double myDouble = 9.78d; // este trecho de linha não esta no video. Para resolver o problema no myDouble
        int myInt = (int) myDouble;
        short myVar = (short) myInt;

        //** JAVA ARRAYS */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNumbers = {10, 20, 30, 40}; // Ao inves de myNumbers era myNum, porém ja existe uma variavel de mesmo nome, logo estava dando problema

        System.out.println(cars[0]); //PRINT ARRAY ELEMENT
        cars[0] = "Opel"; //Update Array Element

        //** JAVA OPERATORS */
        int x = 5;
        int y = 3;
        System.out.println(x + y); //Addition
        System.out.println(x - y); //Subtraction
        System.out.println(x * y); //Multiplication
        System.out.println(x / y); //Division : Returns the division remainder
        System.out.println(x % y); //Mudulus
        System.out.println(x - y); //Subtraction

        System.out.println(x++); //Increment x = x + 1
        System.out.println(x--); //Increment x = x - 1

        //Assigment Operators
        x += 5; // x= x+5

        //** JAVA COMPARISION OPERATORS */
        x = 5; //int x = 5;
        y = 3; //int y = 3;

        //Answer: TRUE or FALSE
        System.out.println( x == y ); //Equal to
        System.out.println( x != y ); //Not equal
        System.out.println( x > y ); //Greater than
        System.out.println( x < y ); //Less than
        System.out.println( x >= y ); //Greater than or equal to
        System.out.println( x <= y ); //Less than or equal to

        System.out.println(x > y); //Greater Than : returns true, because 5 is higher than 3

        //** Java LOGICAL OPERATOR */
        x = 5; //int x = 5;
        System.out.println(x > 3 && x < 10); //returns true because 5 is greater than 3 AND 5 is less
        System.out.println(x > 3 || x < 4); //returns true because one of the conditions are true (5 is
        System.out.println(!(x > 3 && x < 10)); //returns false because ! (not) is used to reverse the

        //** JAVA STRING METHODS */
        String txt = "Hello World";
        System.out.println(txt.toUpperCase()); //Outputs "HELLO WORLD"
        System.out.println(txt.toUpperCase()); //Outputs "hello world"

        //String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        //** CONDITIONAL STATEMENT */
        //IF STATEMENT
        if (20 > 18){
            System.out.println("20 is greater than 18");
        }

        //IF-ELSE Statement
        int time = 20;
        if (time < 18){
            System.out.println("Good day");
        }else {
            System.out.println("Good evening");
        }
        //Outputs "Good evening"

        //** NESTED IF Else-IF statement */
        time = 22; //int time = 22;
        if (time < 10){
            System.out.println("Good morning");
        } else if (time < 18) {
            System.out.println("Good day");
        }else {
            System.out.println("Good evening");
        }
        //Outputs "Good evening"

        //Switch Statement
        char grade = 'A';
        switch (grade)
        {
            case 'A':
                System.out.println("Congratulation ! You Get Full Scholarship"); //Console.WriteLine("Congratulation ! You Get Full Scholarship"); CORRIGIDO: Console.WriteLine → System.out.println
                break;
            case 'B':
                System.out.println("Wel Done ! You Get 50% Scholarship"); //Console.WriteLine("Wel Done ! You Get 50% Scholarship"); CORRIGIDO: Console.WriteLine → System.out.println
                break;
            case 'C':
                System.out.println("Good Work ! You Get 25% Scholarship"); //Console.WriteLine("Good Work ! You Get 25% Scholarship"); CORRIGIDO: Console.WriteLine → System.out.println
                break;

            default:
                System.out.println("Sorry :( You Get 25% Scholarship"); //Console.WriteLine("Sorry :( You Get 25% Scholarship"); CORRIGIDO: Console.WriteLine → System.out.println
                break;
        }

        //** Looping Statements */
        //While Loop
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        //Do-while Loop
        i = 0; //int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //For Loop
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }

        //** NESTED FOR LOOP */
        //Outer loop
        for (i = 1; i <= 2; i++){
            System.out.println("Outer: " + i); //Executes 2 times
        }

        //Inner loop
        for (int j = 1; j <= 3; j++){
            System.out.println("Inner: " + j); //Executes 6 times (2 * 3)
        }

    }
}
