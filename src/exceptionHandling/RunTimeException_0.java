package exceptionHandling;

/**
 * Exception types in Java -> There are two types of Exceptions in Java
 *
 * 1--> Compile time exception (checked exceptions)
 * 2--> Runtime exception (unchecked exception)
 * ========================================================
 * Runtime exception (unchecked exception)
 *
 * a)->NullPointerException:
 * This occurs when you try to use a null reference in your code.
 * Example:
 * String str = null;
 * int length = str.length();  [This code will result in a runtime exception
 * because you're trying to call the length() method on a null reference.]
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * b)->ArrayIndexOutOfBoundsException:
 * This occurs when you try
 * to access an index that is outside the bounds of an array.
 * Example:int[] arr = {1, 2, 3};
 * int element = arr[3];
 *
 * This code will result in a runtime exception because you're trying
 * to access the element at index 3, which doesn't exist in the array.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * c)->ArithmeticException:
 * This occurs when you perform an illegal arithmetic operation,
 * such as dividing by zero.
 * Example:int result = 10 / 0;
 *
 * This code will result in a runtime exception because you're trying to divide by zero.
 *
 * ================
 * Ways to handle exceptions
 * =========================
 * Handling exception using try catch finally
 * throws keyword: postpone exception
 * try with resources
 * user defined exception
 *
 * throw new Exception
 */
public class RunTimeException_0 {
    static int myArr [] = {10,2,3};
    public static void printArray(int index)
    {
       System.out.println(myArr[index]);
    }
    public static void main(String[] args)
    {
        /**
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         * Index 5 out of bounds for length 3
         * 	at exceptionHandling.RunTimeException.main(RunTimeException.java:49)
         */
        System.out.println(myArr[5]);
        printArray(1);
    }

}
