package exceptionHandling;

public class RunTimeException_1 {

    static int myArr [] = {10,2,3};
    public static void printArray(int index)
    {
        System.out.println(myArr[index]);
    }
    public static void main(String[] args)
    {
        /**
         * Here Handle the Runtime exception using try catch block.
         * So the line number 23 now able to execute.
         */
        try {
            System.out.println(myArr[5]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            arrayIndexOutOfBoundsException.printStackTrace();
        }
        printArray(1);
    }
}
