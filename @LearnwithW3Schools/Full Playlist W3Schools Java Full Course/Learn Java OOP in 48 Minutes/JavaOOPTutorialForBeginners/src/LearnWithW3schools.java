//** Create a Class */
public class LearnWithW3schools {
    //** Java Class Attributes */
    int x = 5;
    int y = 3;
    String name = "Dr. Zeeshan";
    String channel;

    //Main method
    public static void main(String[] args) {
        LearnWithW3schools myObj = new LearnWithW3schools();
        myObj.x = 40;
        System.out.println(myObj.x); //Output 40;

        //** Multiple Objects */
        LearnWithW3schools myObj1 = new LearnWithW3schools();
        LearnWithW3schools myObj2 = new LearnWithW3schools();

        myObj2.x = 25; //Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:
        System.out.println(myObj1.x); //Outputs 5
        System.out.println(myObj2.x); //Outputs 25

        //**Java Class Methods */
        //Method Call
        myMethod(); //Outputs "Hello World!"

        myStaticMethod(); //Call the static method
        // myStaticMethod(); This would compile an error

        //LearnWithW3schools myObj = new LearnWithW3schools(); //Create an object of Main
        myObj.myPublicMethod(); //Call the public method on the object

        //LearnWithW3schools myObj = new LearnWithW3schools(); //Create an object of Main
        System.out.println(myObj.x); //Print the value of x
         //Outputs 5

        //** Call Constructor with Parameters */
        //LearnWithW3schools myObj = new LearnWithW3schools("Dr. Zeeshan");
        System.out.println(myObj.name); //Output: Dr. Zeeshan

        //** Call Constructor with Multiple Parameters */
        //LearnWithW3schools myObj = new LearnWithW3schools("Dr. Zeeshan" , "@LearnWithW3schools");
        System.out.println("Hi! I am" + myObj.name); //Output: Hi! I am Dr. Zeeshan
        System.out.println("If You Like this Video, then suport " + myObj.channel);


        //* **** */
        //* Java Exceptions - Try....Catch */
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            System.out.println("Something went wrong.");
        }
        finally {
            //finally statement lets you execute code, after try...catch, regardless of the result:
            System.out.println("The 'try catch' is finished.");
        }
    }//end on main

    //** Java Class Methods */
    //Method Declaration
    static void myMethod(){
        System.out.println("Hello World!");
        //** Access Methods With an Object */
        LearnWithW3schools myCar = new LearnWithW3schools(); //Create a myCar object
        myCar.fullThrottle();       //Call the fullThrottle() method
                //// Output:The car is going as fast as it can!
        myCar.speed(200); //Call the speed() method
                //// Output: Max speed is: 200
    }

    //** **** */
    //** Static vs. Public  */
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //**Access Methods With an Object */
    //Create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    //** **** */
    //** Java Constructors */
    //Create a Main class
    //int x; //Create a class attribute
    //String name;
    //String channel;
    //Create a class constructor for the Main class
    public LearnWithW3schools(){
        x = 5; //Set the initial value for the class attribute x
    }

    //** Constructor Parameters */
    public LearnWithW3schools(String n){
        name = n;
    }

    //Multiple Parameters
    public LearnWithW3schools(String n, String c){
        name = n;
        channel = c;
    }

} // end of class




//** Using Multiple Classes */
class Second{
    //** Access Methods in another class with an Object */
    public void myMethod(){
        LearnWithW3schools myCar = new LearnWithW3schools();    //Create a myCar object
        myCar.fullThrottle();       //Call the fullThrottle() method
                ////Output:The car is going as fast it can!
        myCar.speed(180); //Call the speed() method
                ////Output:Max speed is: 200
    }

}



//** **** */
//** Java Inheritance */

//superclass (parent) - the class inherited from
class Vehicle {

    protected String brand = "Ford";    //Vehicle attribute
    public void honk(){                 //Vehicle method
        System.out.println("Tuut, tuut!");
    }
} //end of class

//subclass child - the class that inherits from another class
class Car extends Vehicle {
    private String modelName = "Mustang"; //Car attribute

    public static void main(String[] args) {

        //Create a myCar object
        Car myCar = new Car();

        //Call the honk() method(from the Vehicle class) on the myCar object
        myCar.honk();

        //Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car
        System.out.println(myCar.brand + " " + myCar.modelName);

        /*
         * Output
         * Tuut, tuut!
         * Ford Mustang
         */
    }
}//end of class




//** The final Keyword */
//To Stop / Not allow class to be inherited

//final class Vehicle{
//    //..
//}

//class Car extends Vehicle{
//    //....
//}

//ERROR: cannot inherit from final Vehicle

//** **** */
//** Java Polymorphism */
//method Overriding
class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }

    //Regular Method
    public void sleep(){
        System.out.println("Zzz");
    }
}//end of class

class Lion extends Animal{
    public void animalSound(){
        System.out.println("The Lion says: Roar Roar");
    }

//    public void sleep(){
//        System.out.println("Zzz");
//    }
}//end of class

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}//end of class


// class Main{
//    public static void main(String[] args) {
//
//        //Create object with Parent class
//        Animal myAnimal = new Animal(); // Create a Animal object
//        Animal myLion = new Lion(); // Create a Lion object
//        Animal myDog = new Dog(); // Create a Dog object
//        myAnimal.animalSound();
//        myLion.animalSound();
//        myDog.animalSound();
//
//    }
//}//end of class


//* **** */
//*Java Inner Classes */
//a class within a class
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    //   static class InnerClass {
    //        int y = 5;
    //    }

}


//** **** */
//** Java Abstraction */
//Data abstraction is the precess of hiding certain details and showing only essential information to the user.

//abstract class Animal{
//    //Abstract method: can only be used in an abstract class, and
//    //it does not have a body.
//    //The body is provided by the subclass (inherited from).
//    public abstract void animalSound(){}
//
//    //Regular Method
//    public void sleep(){
//        System.out.println("Zzz");
//    }
//}//end of abstract Animal class

//** **** */
//** Java Interface */
/*
 * Another way to achieve abstraction in Java, is with interfaces.
 * An interface is a completely "abstract class" that is used
 * to grounp related methods with empty bodies:
 *
 */

//use interface - instead of class
//interface Animal{
//    public void animalSound(); //interface method (does not have a body)
//    public void sleep();//interface method (does not have a body)
//}


/*
 * To access the interface methods, the interface must be "implemented"
 * (kinda like inherited) by another class with the implements keyword
 * (instead of extends).
 */
//Lion "implements" the Animal interface


//class Lion implements Animal{
//    public void animalSound(){
//        //The body of animalSound() is provided here
//        System.out.println("The Lion says: Roar Roar");
//    }
//
//    public void sleep(){
//        //The body of sleep() is provided here
//        System.out.println("Zzz");
//    }
//}//end of Lion class
