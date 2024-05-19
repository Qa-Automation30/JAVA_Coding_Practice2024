package exceptionHandling;

public class tryCatchFinally_1 {
    public static void main(String[] args) {
        try {
            int a =1/0;
        }
        finally {
            System.out.println("1");
        }
    }
}
