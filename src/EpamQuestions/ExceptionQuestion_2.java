package EpamQuestions;

public class ExceptionQuestion_2 {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);  // Here we get the exception  // first step : yaha se programme terminate ho jayega.
            System.out.println("try block");  // This line will not execute because of above line me exception aa raha hai
        }
        catch (Exception e){
            System.out.println("I am in catch Block"); // 2nd step --> Yaha ayega bcs humne handle kiya hai
        }
        finally {
            System.out.println("This is finally block"); // 3rd step --> Yaha ayega and ye print karega
        }
    }
}
