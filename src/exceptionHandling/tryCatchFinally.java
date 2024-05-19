package exceptionHandling;

public class tryCatchFinally {

    public static void main(String[] args) {
        try {
             int[] arr ={1,2,3};
                int a =1/0;
                System.out.println(arr[5]);
                System.out.println("in try block");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("I am in catch block");
        }
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("111");
    }
}
