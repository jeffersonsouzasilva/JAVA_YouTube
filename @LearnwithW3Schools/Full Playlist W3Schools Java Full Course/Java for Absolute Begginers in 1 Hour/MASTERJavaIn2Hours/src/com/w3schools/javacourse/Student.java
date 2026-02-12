package com.w3schools.javacourse;

class Student {

    //default Constructor
    Student(){
        System.out.println("Constructor Called");
    }

    //class variable declaration
    String stdName = null;

    public static void main(String[] args) {
        int y; //local variable declaration
        y=10; // local variable initliztion
        int x = 10;

        // object of class Student
        Student std1 = new Student();


        std1.setName("Dr. Zeeshan ");
        String n = std1.getName(); //call to method
        System.out.println("The New Name is : " + n);


        Student std2 = new Student();
        std2.setName("John Paul");
        System.out.println("Hello New Guy : " + std2.getName() );
    }

    //declaring method
    String getName(){
        //System.out.println("The Name os Student : " + stdName);

        return stdName;
    } // end of getName Method

    //method declaration with argument
    void setName(String name){
        stdName = name;
        //System.out.println("The Student New Name is " + name);
    } // end of setName method

}
