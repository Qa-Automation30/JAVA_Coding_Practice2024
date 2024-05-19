public class CheckPalindromeNumber_1 {
    public static void main(String[] args) {
        int [] num ={121,111,324,987,232};
        int len = num.length;
        for(int i=0;i<num.length;i++){
            int orgNum = num[i];
            int myNum=0;
            while (orgNum!=0){
                int n1 = orgNum % 10;
                myNum = myNum *10+n1;
                orgNum = orgNum /10;
            }
            if(myNum==num[i]){
                System.out.println(num[i]+"--> This is Palindrome Number");
            }
            else {
                System.out.println(num[i]+"--> This is not Palindrome Number");
            }
        }
    }
}
