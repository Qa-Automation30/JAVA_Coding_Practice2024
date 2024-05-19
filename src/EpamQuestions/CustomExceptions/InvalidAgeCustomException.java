package EpamQuestions.CustomExceptions;
/**
 *  In Java, we can create our own exceptions that are derived classes of the Exception class.
 *  In order to create custom exception, we need to extend Exception class that belongs to java.lang package.
 *
 */
public class InvalidAgeCustomException extends Exception{

    InvalidAgeCustomException(String str){
        super(str);
    }
}
