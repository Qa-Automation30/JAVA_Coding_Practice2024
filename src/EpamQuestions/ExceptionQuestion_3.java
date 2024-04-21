package EpamQuestions;

import java.io.FileNotFoundException;

public class ExceptionQuestion_3 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
        }
        catch (Exception e){
            System.out.println("I am in catch Block");
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
