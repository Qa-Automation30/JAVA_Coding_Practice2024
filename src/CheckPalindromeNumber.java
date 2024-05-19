public class CheckPalindromeNumber {

    public static void main(String[] args) {
        int[] num = {121,123,22,54};
        for(int i=0;i<num.length;i++){
            int orNum = num[i];
            int newNum=0;
            while (orNum!=0){
               newNum =  newNum*10 + orNum%10;
                orNum = orNum / 10;
            }
            if(num[i]==newNum){
                System.out.println("This is PalindromeNumber-->"+num[i]);
            }
            else {
                System.out.println("This is not PalindromeNumber-->"+num[i]);
            }
        }
    }
}
