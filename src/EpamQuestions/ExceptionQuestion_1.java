package EpamQuestions;

public class ExceptionQuestion_1 {

    //1-> He asked that finally block will run or not.
    // The Answer is NO, bcs at line 7 pe hi exception aa jayega.
    public static void main(String[] args) {
        System.out.println(10/0);
        try {
            System.out.println("try block");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
