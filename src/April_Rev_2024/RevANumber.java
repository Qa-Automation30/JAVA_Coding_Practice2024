package April_Rev_2024;

public class RevANumber {
    public static void main(String[] args) {
        int num=87654;
        int newNum=0;

        while (num!=0){
            newNum = (newNum*10)+(num%10);
            num = num/10;
        }
        System.out.println(newNum);
    }
}
