package EpamQuestions.CustomExceptions;

public class CustomException {
    /**
     *  In Java, we can create our own exceptions that are derived classes of the Exception class.
     *  In order to create custom exception, we need to extend Exception class that belongs to java.lang package.
     *
     */
    public static void main(String[] args){
        try {
            vote(10);
        } catch (InvalidAgeCustomException e) {
            e.printStackTrace();
        }
    }

    static void vote(int age) throws InvalidAgeCustomException{
        if(age<18){
            throw new InvalidAgeCustomException("age is not valid to vote");
        }
        else {
            System.out.println("You are allowed to vote");
        }
    }
}
