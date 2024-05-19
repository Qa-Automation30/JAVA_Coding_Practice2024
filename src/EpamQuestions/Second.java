package EpamQuestions;

// Asked this code in Epam :
//How to call both constructor at once?
// This is the concept of constructor chaining he was asking about.
public class Second {
    Second(){
        this("123");
        System.out.println("Test");

    }
    Second(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Second second = new Second();
    }
}
/**
 * In Java, you cannot directly call both constructors at once.
 * Constructors are invoked implicitly when you create an instance of a class using the new keyword.
 * Each constructor is called based on the arguments provided during object creation. However,
 * you can achieve the desired behavior by modifying your constructors to call each other. Here's how you can do it:
 *
 * public class Second {
 *     Second() {
 *         this("Test"); // Calls the constructor with a string argument
 *     }
 *
 *     Second(String str) {
 *         System.out.println(str);
 *     }
 *
 *     public static void main(String[] args) {
 *         Second second = new Second(); // This will invoke the no-argument constructor which in turn calls the other constructor
 *     }
 * }
 *
 * In this modified version, when you create an instance of Second without providing any arguments,
 * the no-argument constructor is called. Inside this constructor,
 * this("Test"); is used to call the constructor with a string argument, effectively printing "Test".
 */
