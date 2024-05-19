package CustomException_revesion;

public class CustomException {
    public static void main(String[] args) {
        try {
            vote(19);
        } catch (CreateCustomException e) {
           e.printStackTrace();
        }
    }

    static void vote(int age) throws CreateCustomException {
     if(age<18){
      throw new CreateCustomException("Age must be greater than 18");
     }
     else {
        System.out.println("Valid age for vote");
     }
    }
}
