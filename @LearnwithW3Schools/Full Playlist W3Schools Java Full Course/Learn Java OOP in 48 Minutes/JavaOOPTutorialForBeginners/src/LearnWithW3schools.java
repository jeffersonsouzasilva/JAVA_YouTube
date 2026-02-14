
//Parou em 11:29 do movie

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

    }

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

