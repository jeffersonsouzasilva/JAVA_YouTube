
//** Create an Object */
//Another Class
public class myChannel {
    int x = 5;

    public static void main(String[] args) {
        LearnWithW3schools myObj = new  LearnWithW3schools();
        System.out.println(myObj.x);

        //** Multiple Objects */
        LearnWithW3schools myObj1 = new LearnWithW3schools();
        LearnWithW3schools myObj2 = new LearnWithW3schools();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

    }
}
