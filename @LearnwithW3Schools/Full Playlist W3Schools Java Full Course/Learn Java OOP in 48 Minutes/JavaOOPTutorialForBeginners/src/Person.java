
//** Java Access Modifieers  */
//* public    The code is accessible for all classes
//* private   The code is only accessible with the declared class
//* default   The code is only accessible in the same package. The is used when you don't specify a modifier.
//* protected The code is accessible in the same package and subclasses.

//** Java Encapsulation */

/*Encapsulation, is to make sure that "sensitive" data is hidden from users
  declare class variables/attributes as private
  provide public get and set methods to access and update the value of a private variable
*/
public class Person {
    private String name; //private = restricted access

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John"); //Set the value the name variable to "John"
        System.out.println(myObj.getName());

        myObj.name = "John";   //error
        System.out.println(myObj.name); //error
    }
}


