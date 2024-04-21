package rev_March_2024;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int inputNumber =11;
        int count=0;
        for(int i=0;i<inputNumber/2;i++){
            if(inputNumber%2==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("This is Prime number");
        }
    }
}
