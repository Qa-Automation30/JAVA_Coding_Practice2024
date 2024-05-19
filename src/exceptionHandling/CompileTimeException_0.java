package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Exception types in Java -> There are two types of Exceptions in Java
 *
 * 1--> Compile time exception (checked exceptions)
 * ========================================================
 * Compile time exception (checked exceptions)
 * Compile time exceptions me editor khud bata deta hai ki kya error hai.
 *
 * a)-> Syntax errors:
 * These occur when you violate the Java syntax rules,
 * such as missing a semicolon at the end of a statement or using an incorrect keyword.
 * example -> int a = 10 [This code will result in a compile-time error because
 * it's missing a semicolon at the end of the statement.]
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * b)->Type errors:
 * These occur when you try to assign a value of one type to a variable
 * of another type or use an incorrect data type in your code.
 * Example: String str = 10; [This code will result in a compile-time error because
 * you're trying to assign an integer value to a String variable.]
 * +++++++++++++++++++++++++++++++++++++++++++++++++++
 * c)-> Method signature errors:
 * These occur when the signature of a method
 * (the method name, parameter types, and return type) doesn't match the method call.
 *
 * Example: public int sum(int a, int b) {
 *     return a + b;
 * }
 *
 * int result = sum(10); [This code will result in a compile-time error because the method
 * call doesn't provide enough arguments to match the method signature.]
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

public class CompileTimeException_0 {
    /**
     * "FileNotFoundException", "IO EXCEPTION", "SQL Exception" are checked exception, which means that it must be either
     * handled using a try-catch block or declared in the method signature using the throws keyword.
     * This helps to ensure that any potential file-related errors are caught and handled appropriately in the code.
     * @param args
     * @throws FileNotFoundException
     * ++++++++++++++++++++++++++++++++++++++++++++++++
     * This main method is declaring I am going to throw FileNotFoundException.
     * So In this case we are not handling the exception, but we are postponing the exception.
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.xml");
        FileReader fileReader = new FileReader(file);
        /**
         * So if we add few more lines code after this and try to execute it, it will not execute bcs
         * program will terminate due to exception
         */
        System.out.println("This will not print after Exception");
    }
}
