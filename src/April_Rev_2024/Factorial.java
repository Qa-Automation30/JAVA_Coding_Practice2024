package April_Rev_2024;

public class Factorial {
    static int fact=1;
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    static int factorial(int num){
        if(num==0){
            return 1;
        }
            fact=fact*num;
            factorial(num-1);
        return fact;
    }
}
