public class Main {
    public static void main(String[] args) {

        //Create object with Parent class
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myLion = new Lion(); // Create a Lion object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myLion.animalSound();
        myDog.animalSound();
        myLion.sleep();

        //To access inner Class, Must create object opf Outer Class first
        OuterClass myOuter = new OuterClass();
        //Then use OuterClass object to create Inner Class object
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        //OuterClass myOuter = new OuterClass()
        //ERROR: OuterClass.InnerClass has private access in OuterClass
        //OuterClass.InnerClass myInner = myOuter.new InnerClass(); //ERROR
        //System.out.println(myInner.y + myOuter.x);

        //Now access InnerClass without creating an object of the outer class
        //OuterClass.InnerClass myInner = new OuterClass().InnerClass; //ERROR
        System.out.println(myInner.y); //Outputs 5


        //Lion myLion = new Lion();
        myAnimal.animalSound();
        myLion.sleep();

        checkAge(15); //Set age to 15 (which is below 18...)
    }


    //** throw Keyword */
    //The throw statement allows you to create a custom error.
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}//end of class
