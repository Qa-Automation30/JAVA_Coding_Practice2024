package rev_March_2024;

public class RevANumber {

    public static void main(String[] args) {
        int num=87654;
        int revNum=0;

        while (num!=0){
            revNum = (revNum*10)+(num%10);
            num = num/10;
        }
        System.out.println(revNum);
    }
}
