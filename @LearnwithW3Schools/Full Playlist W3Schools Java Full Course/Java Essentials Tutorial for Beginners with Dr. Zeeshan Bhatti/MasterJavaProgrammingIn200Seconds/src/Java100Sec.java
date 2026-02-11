

public class Java100Sec {
    public static void main(String[] args) {
        System.out.println("Hello World");


        //  Variables
        System.out.println(" ");
        int age = 25; // Output: 25
        double pi = 3.14; // Output: 3.14
        String name = "Zeeshan"; // Output: Zeeshan
        boolean isJavaFun = true; // Output: true

        System.out.println(age + " " + pi +
                            " " + name +
                            " " + isJavaFun );


        // Strings
        System.out.println(" ");
        String greeting = "Hello".toUpperCase();
        System.out.println(greeting);

        int length = greeting.length();
        System.out.println(greeting + " length " + length);


        // If Statement
        System.out.println(" ");
        age = 25;
        if (age > 18 ) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }


        // For Loops
        System.out.println(" ");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }


        // While Loops
        System.out.println(" ");
        int j = 0;
        while (j < 3){
            System.out.println("While: " + j);
            j++;
        }


        // Functions Call
        System.out.println(" ");
        sayHi("Zeeshan"); // Output: Hi World


        // Create Java Object
        System.out.println(" ");
        Java100Sec objJava = new Java100Sec();

        int result = objJava.add(5,10); // Passing Arguments
        System.out.println("5 + 10 = " + result);

    } //End of main Method


    // User Defined Method (Function Declaration)
    static void sayHi(String name) {
        System.out.println("Hi " + name);
    }


    // Method with Parameters
    int add(int a, int b){
        return a + b;
    }

} //End of Class
