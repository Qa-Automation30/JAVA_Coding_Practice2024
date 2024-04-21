package rev_March_2024;

public class factorial {
   static int fact=1;
    public static void main(String[] args) {
        int num =4;
        System.out.println(factorial(num));
    }
   static int factorial(int num){
        if(num==1){
            return 1;
        }
        fact = fact*num;
        factorial(num-1);
        return fact;
    }
}
