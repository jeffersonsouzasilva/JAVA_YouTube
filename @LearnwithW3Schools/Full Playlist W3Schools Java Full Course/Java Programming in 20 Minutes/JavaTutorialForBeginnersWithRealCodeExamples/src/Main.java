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
        int myInt = (int) myDouble;
        short myVar = (short) myInt;

        //** JAVA ARRAYS */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

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
        x += 5;
    }
}
